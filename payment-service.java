package com.aquila.payment;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

public class PaymentServer {

    private static List<String> payments = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8081), 0);

        server.createContext("/health", exchange ->
                sendResponse(exchange, 200, "{\"status\":\"Payment Service Running\"}")
        );

        server.createContext("/pay", exchange -> {
            if ("POST".equals(exchange.getRequestMethod())) {
                payments.add("Payment completed");
                sendResponse(exchange, 201, "{\"message\":\"Payment processed\"}");
            }
        });

        server.setExecutor(null);
        server.start();
        System.out.println("Payment Service started on port 8081");
    }

    private static void sendResponse(com.sun.net.httpserver.HttpExchange exchange,
                                     int status,
                                     String body) throws IOException {

        exchange.getResponseHeaders().add("Content-Type", "application/json");
        exchange.sendResponseHeaders(status, body.length());

        try (OutputStream os = exchange.getResponseBody()) {
            os.write(body.getBytes());
        }
    }
}

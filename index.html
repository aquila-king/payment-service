// App.java
package com.example;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.Map;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        System.out.println("🚀 Java Web App running at http://localhost:8080/");
    }

    @GetMapping("/")
    public String home() {
        return """
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Java Web App | Jenkins CI/CD</title>
                <style>
                    body {
                        font-family: 'Segoe UI', Arial, sans-serif;
                        background: linear-gradient(135deg, #007bff, #00c4ff);
                        color: white;
                        text-align: center;
                        padding-top: 80px;
                    }
                    h1 { font-size: 2.5rem; margin-bottom: 1rem; }
                    .status-box {
                        background: rgba(255, 255, 255, 0.1);
                        display: inline-block;
                        padding: 20px 40px;
                        border-radius: 12px;
                        box-shadow: 0 8px 20px rgba(0,0,0,0.2);
                    }
                    button {
                        margin-top: 20px;
                        padding: 10px 20px;
                        background: #fff;
                        color: #007bff;
                        border: none;
                        border-radius: 6px;
                        cursor: pointer;
                    }
                </style>
            </head>
            <body>
                <h1>🚀 Java Web Application</h1>
                <p>Built & Deployed via Jenkins CI/CD</p>

                <div class="status-box">
                    <p><strong>Service Status:</strong> <span id="status">Loading...</span></p>
                    <p><strong>Timestamp:</strong> <span id="timestamp">---</span></p>
                    <button onclick="fetchStatus()">Check API</button>
                </div>

                <script>
                    async function fetchStatus() {
                        const res = await fetch('/api/status');
                        const data = await res.json();
                        document.getElementById('status').textContent = data.message;
                        document.getElementById('timestamp').textContent = data.timestamp;
                    }
                    fetchStatus();
                </script>
            </body>
            </html>
        """;
    }

    @GetMapping("/api/status")
    public Map<String, Object> status() {
        return Map.of(
                "status", "OK",
                "message", "Application is running successfully!",
                "timestamp", LocalDateTime.now().toString()
        );
    }
}

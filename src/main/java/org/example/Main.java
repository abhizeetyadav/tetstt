package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            SimpleHttpServer.startServer();
        } catch (IOException e) {
            System.err.println("Error starting HTTP server: " + e.getMessage());
        }
    }
}
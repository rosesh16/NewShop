package com.example;

/**
 * Simple application used to demonstrate Jenkins CI/CD
 * for an online shopping website.
 */
public class App {

    public static int add(int a, int b) {
        return a + b;
    }

    public static String getApplicationName() {
        return "Online Shopping Website";
    }

    public static void main(String[] args) {
        System.out.println("Online Shopping Website Application");
        System.out.println("Application is running successfully.");
    }
}

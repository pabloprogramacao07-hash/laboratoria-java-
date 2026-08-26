package com.example;

public class App {
    public static void main(String[] args) {
        String userName = "Ana";
        printWelcomeMessage(userName);
    }

    private static void printWelcomeMessage(String userName) {
        System.out.println("Bem vinda (o)," + userName + "!");
    }
}
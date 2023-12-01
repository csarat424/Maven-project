package com.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            String capitalizedName = StringUtils.capitalize(name);
            printGreeting(capitalizedName);
        }
    }

    private static void printGreeting(String name) {
        System.out.println("Hello, " + name + "! Welcome to Maven!");
    }
}


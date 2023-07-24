package org.example;

import java.util.Scanner;

public class Main {

    public static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator(keyboard);
        passwordGenerator.mainLoop();
        keyboard.close();
    }
}
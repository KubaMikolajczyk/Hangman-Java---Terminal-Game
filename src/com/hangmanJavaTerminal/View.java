package com.hangmanJavaTerminal;

public class View {

    public void welcomeMessage(){
        System.out.println("Welcome to hangman game!" +
                            "\nApp created by Kuba Mikołajczyk\n");
    }

    public void displayMenu(){
        System.out.println("1. New game\n" +
                            "2. Ladder board\n" +
                            "3. Exit");
    }
}

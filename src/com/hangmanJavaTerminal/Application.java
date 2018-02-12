package com.hangmanJavaTerminal;

import java.util.Scanner;

public class Application {

    private View view;
    private Game game;
    private boolean isRunning;
    private Scanner input;

    Application(){

        view = new View();
        isRunning = true;
        input = new Scanner(System.in);
        game = new Game();
    }

    public void startApp(){

        mainMenu();
    }

    private void mainMenu(){

        view.welcomeMessage();
        while(isRunning){
            view.displayMenu();
            Integer menuChoice = input.nextInt();

            switch (menuChoice){

                case 1:
                    game.start();
                    break;
                case 2:
                    break;
                case 3:
                    isRunning = false;
                    break;
            }
        }
    }
}

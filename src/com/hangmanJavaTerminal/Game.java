package com.hangmanJavaTerminal;

public class Game {
    private CountryCapitalDao dao;
    private String capitalToGuess;

    public void start(){
        dao = new CountryCapitalDao();
        capitalToGuess = dao.getCapital();
        System.out.println(capitalToGuess);
    }
}

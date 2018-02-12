package com.hangmanJavaTerminal;

public class Application {

    private CountryCapitalDao dao;

    Application(){
        dao = new CountryCapitalDao();
    }

    public void startApp(){
        System.out.println(dao.getCapital());
    }
}

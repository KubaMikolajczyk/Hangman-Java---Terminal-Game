package com.hangmanJavaTerminal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CountryCapitalDao {

    private final int CAPITAL = 1;
    private List<String> capitals;
    private List<String> countries;
    private String fileName;
    private Random random;

    CountryCapitalDao(){

        capitals = new ArrayList<String>();
        countries = new ArrayList<String>();
        fileName = "txt/countries_and_capitals.txt";
        random = new Random();
    }

    private void updateCapitals() {

        /* Read file and put each line into array */
        String line = null;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {

                /* From each array return capital which is upon index 1 and put it into capitals array list */
                String[] country = line.split(" \\| ");
                capitals.add(country[CAPITAL]);
            }
            bufferedReader.close();

        /* catch all exceptions that can occur during file reading */
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getCapital(){

        updateCapitals();

        /* generate random int to choose the capital from array list */
        int randomIndex = random.nextInt(capitals.size());
        String randomCapital = capitals.get(randomIndex).toUpperCase();

        return randomCapital;
    }
}

package com.hw;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader inputFile = new BufferedReader(new FileReader(args[0]));
             BufferedWriter outputFile = new BufferedWriter(new FileWriter(args[1]))) {
            String text = inputFile.readLine();
            while (text != null) {
                outputFile.write(text);
                outputFile.flush();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }
}
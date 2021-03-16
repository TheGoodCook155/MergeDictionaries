package com.test;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
        You can use this app to merge txt or lst dictionary files into one dictionary file. If you are tired of switching between
        dictionary files, then this app is the right choice for you.
        Make the one and ultimate password dictionary!
         */

        //Input Array of dictionary file name
        String[] inputs = { "crackhuman.txt","digits.txt", "digits2.txt", "kirilicni_original.txt", "rockyou.txt","darkc0de.lst"};

        String line = "";
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        for (int i = 0; i < inputs.length; i++) {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(inputs[i])));
            while(scanner.hasNext()){
                line = scanner.nextLine();
                System.out.println("File " + i + " content " + line);
                writer.write(line);
                writer.write("\n");
                writer.flush();
            }
        }


    }
}

package agh.po.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lotto2 {
    public static void main(String[] args) {
        
        if (args.length != 6)
        {
            System.out.println("musi byc 6 liczb");
            return;
        }
        
        ArrayList<Integer> typy = new ArrayList<>();
        for (int i = 0; i < args.length; i++) 
        {
            typy.add(Integer.parseInt(args[i]));
        }
        
        Random generator = new Random();
        ArrayList<Integer> wylosowane = new ArrayList<>();

        while (wylosowane.size() < 6)
        {
            int liczba = generator.nextInt(49) + 1;
            boolean czy_zajeta = wylosowane.contains(liczba);
            if (czy_zajeta == false)
            {
                wylosowane.add(liczba);
            }
        }


        ArrayList<Integer> trafienia = new ArrayList<>(typy); // trafienia - kopia typów
        trafienia.retainAll(wylosowane); //bierzemy tylko część wspólną typów i trafień

        int liczbaTrafien = trafienia.size();

        System.out.println("typy: " + typy);
        System.out.println("Wylosowane: " + wylosowane);
        System.out.println("ile trafionych: " + liczbaTrafien);
        System.out.println("ktore trafione: " + trafienia);
    }
}
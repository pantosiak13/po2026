package agh.po.lab1;

import java.util.HashSet;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> wylosowaneLiczby = new HashSet<>();

        while (wylosowaneLiczby.size() < 6) {
            int liczba = random.nextInt(49) + 1;
            wylosowaneLiczby.add(liczba);
        }

        System.out.println("Wylosowane liczby lotto: " + wylosowaneLiczby);
    }
}
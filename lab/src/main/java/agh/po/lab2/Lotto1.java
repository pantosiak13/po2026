package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto1
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        ArrayList<Integer> lista = new ArrayList<>();

        while (lista.size() < 6)
        {
            int liczba = generator.nextInt(49) + 1;
            boolean czy_zajeta = lista.contains(liczba);
            if (czy_zajeta == false)
            {
                lista.add(liczba);
            }
        }
        System.out.println("Wylosowane: " + lista);
    }
}
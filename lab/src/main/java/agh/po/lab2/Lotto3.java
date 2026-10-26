package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto3
{
    public static void main(String[] args)
    {

        if (args.length != 6)
        {
            System.out.println("musi byc 6 liczb");
            return;
        }

        ArrayList<Integer> typy = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            typy.add(Integer.parseInt(args[i]));
        }

        Random generator = new Random();
        long cnt = 0;
        
        boolean czyTrafiono6 = false;

        long start = System.currentTimeMillis();

        while (czyTrafiono6 == false)
        {
            cnt++;
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

            ArrayList<Integer> trafienia = new ArrayList<>(typy);
            trafienia.retainAll(wylosowane);
            if (trafienia.size() == 6)
            {
                czyTrafiono6 = true;
            }
        }

        long end = System.currentTimeMillis();
        long czas = end - start;

        System.out.println("typy: " + typy);
        System.out.println("liczba losowan: " + cnt);
        System.out.println("czas dzialania: " + czas + " ms");
    }
}
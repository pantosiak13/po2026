package agh.po.SYMULATOR;

public class Main
{
    public static void main(String[] args)
    {
        Sprzeglo sprzeglo = new Sprzeglo("Sprzęgło", 12.5, 800);
        SkrzyniaBiegow skrzynia = new SkrzyniaBiegow("Skrzynia 5-biegowa", 45, 3500, 5, sprzeglo);
        Silnik silnik = new Silnik("Silnik 1.6", 120, 9000, 6500);
        Pozycja start = new Pozycja(0, 0);

        Samochód auto = new Samochód("KR888", "Golf", 200, silnik, skrzynia, start);
        System.out.println(auto);

        auto.wlacz();
        sprzeglo.wcisnij();
        skrzynia.zwiekszBieg();
        sprzeglo.zwolnij();
        silnik.zwiekszObroty();
        silnik.zwiekszObroty();
        System.out.println(auto);

        auto.jedzDo(new Pozycja(10, 5));
        System.out.println(auto);
        System.out.println("Waga: " + auto.getWaga());

        auto.wylacz();
        System.out.println(auto);
    }
}
package agh.po.SYMULATOR;

public class SkrzyniaBiegow extends Komponent
{
    private int aktualnyBieg;
    private int iloscBiegow;
    private double aktualnePrzelozenie;
    private Sprzeglo sprzeglo;

    public SkrzyniaBiegow(String nazwa, double waga, double cena,
                          int iloscBiegow, Sprzeglo sprzeglo)
    {
        super(nazwa, waga, cena);
        this.iloscBiegow = iloscBiegow;
        this.sprzeglo = sprzeglo;
        this.aktualnyBieg = 0;
        this.aktualnePrzelozenie = 0;
    }

    public void zwiekszBieg()
    {
        if (!sprzeglo.isWcisniete())
        {
            System.out.println("Wciśnij sprzęgło, aby zmienić bieg.");
        } else if (aktualnyBieg < iloscBiegow)
        {
            aktualnyBieg++;
            aktualnePrzelozenie = aktualnyBieg * 0.5;
        }
    }

    public void zmniejszBieg()
    {
        if (!sprzeglo.isWcisniete())
        {
            System.out.println("Wciśnij sprzęgło, aby zmienić bieg.");
        } else if (aktualnyBieg > 0)
        {
            aktualnyBieg--;
            aktualnePrzelozenie = aktualnyBieg * 0.5;
        }
    }

    public void zerujBieg()
    {
        aktualnyBieg = 0;
        aktualnePrzelozenie = 0;
    }

    public int getAktBieg() { return aktualnyBieg; }
    public double getAktPrzelozenie() { return aktualnePrzelozenie; }
    public Sprzeglo getSprzeglo() { return sprzeglo; }
}
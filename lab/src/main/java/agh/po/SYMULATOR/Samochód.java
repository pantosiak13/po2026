package agh.po.SYMULATOR;

public class Samochód
{
    private boolean stanWlaczenia;
    private String nrRejest;
    private String model;
    private double predkoscMax;

    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;
    private Pozycja aktualnaPozycja;

    public Samochód(String nrRejest, String model, double predkoscMax,
                    Silnik silnik, SkrzyniaBiegow skrzynia, Pozycja pozycjaStartowa)
    {
        this.nrRejest = nrRejest;
        this.model = model;
        this.predkoscMax = predkoscMax;
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.aktualnaPozycja = pozycjaStartowa;
        this.stanWlaczenia = false;
    }

    public void wlacz()
    {
        if (!stanWlaczenia)
        {
            silnik.uruchom();
            stanWlaczenia = true;
        }
    }
    public void wylacz()
    {
        if (stanWlaczenia)
        {
            silnik.zatrzymaj();
            skrzynia.zerujBieg();
            stanWlaczenia = false;
        }
    }

    public void jedzDo(Pozycja cel)
    {
        if (!stanWlaczenia)
        {
            System.out.println("Auto wyłączone - nie ma tak.");
            return;
        }
        double dx = cel.getX() - aktualnaPozycja.getX();
        double dy = cel.getY() - aktualnaPozycja.getY();
        aktualnaPozycja.aktualizujPozycje(dx, dy);
    }

    public double getWaga()
    {
        return silnik.getWaga() + skrzynia.getWaga() + skrzynia.getSprzeglo().getWaga();
    }

    public double getAktPredkosc()
    {
        if (!stanWlaczenia) {
            return 0;
        }
        double predkosc = silnik.getObroty() * skrzynia.getAktPrzelozenie() * 0.02;
        return Math.min(predkosc, predkoscMax);
    }

    public Pozycja getAktPozycja()
    {
        return aktualnaPozycja;
    }

    @Override
    public String toString()
    {
        return model + " [" + nrRejest + "], włączony: " + stanWlaczenia
                + ", prędkość: " + getAktPredkosc()
                + ", pozycja: " + aktualnaPozycja.getPozycja();
    }
}
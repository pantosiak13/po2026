package agh.po.SYMULATOR;

public class Silnik extends Komponent
{
    private int maxObroty;
    private int obroty;

    public Silnik(String nazwa, double waga, double cena, int maxObroty)
    {
        super(nazwa, waga, cena);
        this.maxObroty = maxObroty;
        this.obroty = 0;
    }

    public void uruchom()
    {
        obroty = 800; // po uruchomieniu
    }

    public void zatrzymaj()
    {
        obroty = 0;
    }

    public void zwiekszObroty()
    {
        if (obroty > 0) {
            obroty = Math.min(obroty + 500, maxObroty);
        }
    }

    public void zmniejszObroty() {
        if (obroty > 800) {
            obroty = Math.max(obroty - 500, 800);
        }
    }

    public int getObroty() { return obroty; }
}
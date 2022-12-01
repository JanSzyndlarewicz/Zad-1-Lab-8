import java.util.Arrays;
import java.util.Random;

public class Klient extends Osoba{

    private int n;
    private Lokata[] t;

    public Klient() {
        super();
        n = 0;
        t = null;
    }

    public Klient(String nazwisko, String pesel, int n) {
        super(nazwisko, pesel);
        this.n = n;

        t = new Lokata[n];
        Random random = new Random();
        for(int i=0; i<t.length; i++){
            t[i] = new Lokata(random.nextInt(9501)+500, random.nextInt(9501)+500, false);
        }

    }

    @Override
    public double Oblicz() {
        double suma = 0;
        for(int i=0; i<t.length; i++){
            suma+= t[i].getKwota();
        }
        return suma;
    }

    public void wyswietlLokaty(){
        for(int i=0; i<t.length; i++){
            System.out.println(t[i]);
        }
    }

    @Override
    public String toString() {
        return "Klient{" +
                "nazwisko='" + getNazwisko() + '\'' +
                ", pesel='" + getPesel() + '\'' +
                ", n=" + n +
                '}';
    }


}

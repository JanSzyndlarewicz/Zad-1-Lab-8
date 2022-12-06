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
        if(n>0){
            this.n = n;
        }
        else{
            n = 0;
        }


        t = new Lokata[n];
        Random random = new Random();
        for(int i=0; i<t.length; i++){
            t[i] = new Lokata(random.nextInt(9501)+500, (double) Math.round(random.nextDouble(950001)+500)/100, random.nextBoolean());
        }

    }

    @Override
    public double Oblicz() {
        double suma = 0;
        if(n>0){
            for(int i=0; i<t.length; i++){
                suma += t[i].getKwota();
            }
        }

        return suma;
    }

    public void wyswietlLokaty(){
        if(n>0){
            for(int i=0; i<t.length; i++){
                System.out.println(t[i]);
            }
        }
        else{
            System.out.println("Brak lokat");
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

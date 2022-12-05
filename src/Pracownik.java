import java.util.Arrays;
import java.util.Random;

public class Pracownik extends Osoba {

    private String s;
    private int pensja, stawka;
    private int[] t = new int[6];

    public Pracownik(){
        super();
        s = "brak";
        pensja = 0;
        stawka = 0;
        t = null;
    }

    public Pracownik(String nazwisko, String pesel, String stan, int pensja, int stawka) {
        super(nazwisko, pesel);
        this.s = stan;
        this.pensja = pensja;
        this.stawka = stawka;
        Random random = new Random();
        for(int i=0; i<t.length; i++){
            t[i] = random.nextInt(5);
        }

    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    public int getStawka() {
        return stawka;
    }

    public void setStawka(int stawka) {
        this.stawka = stawka;
    }

    public int[] getT() {
        return t;
    }

    public void setT(int[] t) {
        this.t = t;
    }

    @Override
    public double Oblicz() {
        double suma = pensja;
        for(int i=0; i<t.length; i++){
            suma += t[i]*stawka;
        }
        return suma;
    }

    public void wyswietlLiczbeNadgodzin(){
        System.out.println("Liczba nadgodzin w poszczególnych dniach tygodnia:");
        System.out.println("Poniedziałek: " + t[0]);
        System.out.println("Wtorek: " + t[1]);
        System.out.println("Środa: " + t[2]);
        System.out.println("Czwartek: " + t[3]);
        System.out.println("Piątek: " + t[4]);
        System.out.println("Sobota: " + t[5]);
    }

    public boolean jestKasjerem(){
        if(s.equals("kasjer")){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "nazwisko='" + getNazwisko() + '\'' +
                ", pesel='" + getPesel() + '\'' +
                "s='" + s + '\'' +
                ", pensja=" + pensja +
                ", stawka=" + stawka +
                ", t=" + Arrays.toString(t) +
                '}';
    }
}

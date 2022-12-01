public class Main {
    public static void main(String[] args) {


       Pracownik x = new Pracownik("Kowalski", "102202", "kasjer", 4000, 40);
       System.out.println(x);
       System.out.println(x.jestKasjerem());
       x.wyswietlLiczbeNadgodzin();
       System.out.println(x.Oblicz());

       Lokata z = new Lokata(2, 33.05, true);
       System.out.println(z);
    }
}
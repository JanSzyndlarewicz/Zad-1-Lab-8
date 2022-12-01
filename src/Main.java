public class Main {
    public static void main(String[] args) {


       Pracownik x = new Pracownik("Kowalski", "102202", "kasjer", 4000, 40);
       System.out.println(x.toString());
       System.out.println(x.jestKasjerem());
       x.wyswietlLiczbeNadgodzin();
       System.out.println(x.Oblicz());
    }
}
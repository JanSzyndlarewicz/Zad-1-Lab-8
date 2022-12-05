import java.awt.*;
import java.util.Arrays;

public class Bank {

   public static void printAll(Osoba[] t){
      int i=0;

      do{
         System.out.println(t[i].toString());
         i++;
      }while(i<t.length && t[i]!=null);
   }

   public static void printEmployeeHours(Osoba[] t){
      int i=0;

      do{
         if(t[i] instanceof Pracownik){
            System.out.print("nazwisko: " + ((Pracownik) t[i]).getNazwisko() +
                    ", pesel: " + ((Pracownik) t[i]).getPesel() +
                    ", nadgodziny w poszczególnych dniach: " + Arrays.toString(((Pracownik) t[i]).getT()) + '\n');
         }

         i++;
      }while(i<t.length && t[i]!=null);
   }

   public static void printKlientAccount(Osoba[] t){
      int i=0;

      do{
         if(t[i] instanceof Klient){
            System.out.print(((Klient) t[i]).toString() + '\n');
            ((Klient) t[i]).wyswietlLokaty();
            System.out.println();
         }

         i++;
      }while(i<t.length && t[i]!=null);
   }

   public static void countKasjer(Osoba[] t){
      int i=0, count = 0;

      do{
         if(t[i] instanceof Pracownik){
            if(((Pracownik) t[i]).getS().equals("kasjer")){
               count++;
            }
         }
         i++;
      }while(i<t.length && t[i]!=null);

      System.out.println("Ilość kasjerów: " + count);
   }

   public static void maxSalary(Osoba[] t){
      int i=1, index = 0;

      do{
         if(t[i] instanceof Pracownik){
            if(((Pracownik) t[i]).getPensja()>((Pracownik) t[index]).getPensja()){
               index = i;
            }
         }
         i++;
      }while(i<t.length && t[i]!=null);

      System.out.println("Najwięcej zarobił: "+ ((Pracownik) t[index]).getNazwisko()
              + ", zarobił: " + (((Pracownik) t[index]).getPensja())
              + ", na stanowisku: " + ((Pracownik) t[index]).getS());
   }
    public static void main(String[] args) {

       Osoba[] t = new Osoba[20];
       t[0] = new Pracownik("Kowalski", "1234567", "kasjer", 3500, 25);
       t[1] = new Klient("Komin", "54235212", 4);
       t[2] = new Pracownik("Nowak", "8653455", "sprzątacz", 3200, 23);
       t[3] = new Pracownik("Klech", "3524141", "recepcjonista", 2500, 20);
       t[4] = new Klient("Las", "553253212", 2);
       t[5] = new Klient("Mech", "56356412", 5);
       t[6] = new Pracownik("Krak", "65432321", "ochroniarz", 4590, 35);
       t[7] = new Klient();
       t[8] = new Pracownik();
       t[9] = new Pracownik("Bruk", "62342321", "kasjer", 2590, 22);

       int n = 0;
       do{
          n++;
       }while(n<t.length && t[n]!=null);


       printAll(t);
       System.out.println();
       printEmployeeHours(t);
       System.out.println();
       printKlientAccount(t);
       System.out.println();
       countKasjer(t);
       System.out.println();
       maxSalary(t);
    }
}
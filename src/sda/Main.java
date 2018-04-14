package sda;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
     /*   HISTOGRAM
        Program losuje liczby z zakresu od 1 do 20. Losowanie jest dokonywane conajmniej 50 razy. Ilość ile razy dana liczba została
        wylosowana jest zapisywana do tablicy.
                Z wartości ile razy została wylosowana liczba tworzony jest histogram.
                Na początek w pierszym podejściu wystarczy wypisać informację:
        1 - 3 razy
        2 - 0 razy
        ...
        19 - 1 razy
        20 - 3 razy*/
        //int[] ilosc2 = new int[20];
        int[] tab = new int[50];
        //losujemy wartości do tablicy
        for(int i = 0; i < tab.length; i++){
            Random r = new Random();
            tab[i] = r.nextInt(20)+1;
            //ilosc2[r.nextInt(20)+1]++;
            System.out.println((i) + ". " + tab[i]);

            ///coś dopisałam
        }



        //uzupełniamy druga tablicę wartościami, które będziemy sprawdzać
        int[] ilosc = new int[20];

        int value = 1;

        for(int i = 0; i < ilosc.length; i++){
            ilosc[i] = value;
            //System.out.println("kolejna wartość ilosc["+i+"]= "+value);
            value++;
        }
        //sprawdzamy ile razy dana wartosc sie powtórzyła
        int trafiona = 0;
        for (int i = 0; i < ilosc.length; i++){
            for (int j = 0; j < tab.length; j++){
               if (ilosc[i] == tab[j]){
               trafiona = trafiona +1;
               }
            }
            System.out.println(ilosc[i] + " - " + trafiona + " razy.");
            trafiona = 0;

        }

        //for(int i = 0; i < ilosc2.length; i++){
        //    System.out.println("kolejna wartość ilosc2 "+i+": "+ilosc2[i]);
        //}

        /*int sprawdz = 1;
        while (sprawdz <= 5){
           int  traf = 0;
            for(int i = 0; i < tab.length; i++){
                if(tab[i] == sprawdz){
                  traf = traf+1;

                }
             }
             sprawdz++;
            System.out.println(sprawdz + " - " + traf + " razy.");
        }*/

    }

}

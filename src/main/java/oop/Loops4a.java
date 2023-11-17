package oop;

import java.util.Arrays;

public class Loops4a {

    static String[] tablica;    // deklaracja zmiennej

    //psvm -> public static void main(String[] args) {
    public static void main(String[] args) {
        tablica = new String[3];   // inicjalizacja zmiennej zadeklarowanej w linii 9
        String str1 = "10";
        String str2 = "20";
        String str3 = "30";
        tablica[0] = str1;
        tablica[1] = str2;
        tablica[2] = str3;

/*
        // pętla while -> wykonywana dopóki warunek = true

 */
        int counter = 1;
        // warunek -> counter <= 10
        while (counter < 10) {
            System.out.println("help! " + counter);
            counter++;  // inkrementacja -> ++ oznacza dodanie 1
            // counter++ oznacza to samo co: counter = counter + 1;
            // counter--; -> dekrementacja
        }

          //dopóki (warunek jest prawdziwy) {
            //wykonuj kod;
        }
for (String l : lista)










      /*  // pętla for
        // Pętla na 6
        for (int i = 0;  i < 100 ; i++) {
            System.out.println("Liczba:  " + i);
        } */



    }



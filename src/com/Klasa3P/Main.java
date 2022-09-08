package com.Klasa3P;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //progarm zgadnij liczbę
        int losuj = (int) (Math.random() * 100 + 1);
        int ile = 10;
        boolean czy = false;
        System.out.println("Zgadnij liczbę");
        do {
                System.out.println("Podaj liczbę");
                Scanner wpisz = new Scanner(System.in);
                int wpisana = wpisz.nextInt();
                if(wpisana == losuj){
                    break;
                }
                if (wpisana > losuj) {
                    System.out.println("mniej");
                    ile--;
                    System.out.println("Pozostało " + ile + " prób");
                }
                else {
                    System.out.println("więcej");
                    ile--;
                    System.out.println("Pozostało " + ile + " prób");
                }
            }
            while (true);
            ile--;
            int zaktorym = 10-ile;
            System.out.println("gratulacje! udało ci się za " + zaktorym + " razem");
        }
    }
package com.Klasa3P;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //progarm zgadnij liczbę
        int losuj = (int) (Math.random() * 100 + 1);
        int ile=10;
        boolean czy = false;
        while(!czy) {
            if(ile==0){
                break;
            }
            Scanner wpisz = new Scanner(System.in);
            System.out.println("Zgadnij liczbę");
            int wpisana = wpisz.nextInt();
            if (wpisana == losuj) {
                ile--;
                int ktoryraz = 10-ile;
                System.out.println("Gratulacje! Udało ci się za " + ktoryraz + " razem");
                czy = true;
            }
            else{
                if(wpisana>losuj){
                    System.out.println("mniej");
                    ile--;
                }
                else{
                    System.out.println("więcej");
                    ile--;
                }
            }
        if(!czy && ile==0){
            System.out.println("Nie udało się, nie masz już prób");
            System.out.println("Liczbą to była: " + losuj);
        }
        else if(!czy){
            System.out.println("Nie udało się, masz jeszcze " + ile + " prób");
        }
        }
    }
}
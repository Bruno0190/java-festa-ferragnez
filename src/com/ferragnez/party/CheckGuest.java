package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        Boolean trovato = false;
        String beccato ="";

        System.out.println("Buonasera, il suo nome e cognome prego");
        String nome = in.nextLine();

        for (Integer i = 0; i <= invitati.length - 1; i ++) {
            if (nome.toLowerCase().trim().replaceAll("\\s+", " ").equals(invitati[i].toLowerCase())) {
                trovato = true;
                beccato = invitati[i];
                break;
            }
        } 
        if (trovato == true) {
            System.out.println("Benvenuto "+ beccato +". Si goda la festa.");
        } else {
            System.out.println("Lei non è fra gli invitati, se ne vada prima che chiamo la polizia!");    
        }
        in.close();
    }

}

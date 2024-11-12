/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringhe;

import java.util.Scanner;

/**
 *
 * @author ospite
 */
public class Stringhe {
    
    static final int TANTI = 30;
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       String parola;
       char[]minuscolo = new char [TANTI];
        System.out.println("Inserisci una parola: ");
        parola = input.next();
        
        for (int x = 0; x < parola.length(); x++) {
            minuscolo[x] = parola.charAt(x);
        }
        // trasforma la parola in minuscolo 
        for (int x = 0; x< parola.length(); x++){
         minuscolo[x] = Character.toLowerCase(minuscolo[x]); // in minuscolo
         System.out.println("La parola in minuscolo (array): " + minuscolo[x]);
        }
        
        //visualizza la parola carattere per carattere
        for (int x = 0; x < minuscolo.length; x++){
            System.out.print(minuscolo[x]);
        }
        System.out.println(" ");
        String parolaMinu = new String(minuscolo);
        System.out.println("La parola in minuscolo (oggetto):");
        System.out.println(parolaMinu);
    }
    
            
            
    
    
}

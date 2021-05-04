/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uts;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Piramida {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris untuk ketinggian piramida: ");
        int baris = scanner.nextInt();
        int angka;
        System.out.println("");
        
        for (int i=0; i<baris; i++) {
            angka = 1;
            for (int k=0; k<(baris-i)*2; k++){
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++) {
                System.out.format("%4d", angka);
                angka = angka*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}

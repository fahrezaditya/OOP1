/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg1;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lingkaran nilai1 = new Lingkaran();
        Persegi nilai2 = new Persegi();
        Scanner scan = new Scanner (System.in);
        
        System.out.println("= Menghitung Luas Bangun =");
        System.out.println("1. Lingkaran\n2. Persegi");
        System.out.println();
        System.out.print("Masukkan pilihan anda\n=> ");
        int pilih = scan.nextInt();
        
        if (pilih ==1){
            nilai1.hitung();
        }
        else if (pilih ==2){
            nilai2.hitung();
        }
    }
}

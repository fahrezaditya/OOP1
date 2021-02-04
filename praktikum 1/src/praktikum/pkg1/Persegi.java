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
public class Persegi {
    Double sisi, luas;
    
    void hitung(){
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println();
        System.out.println("== Luas Persegi ==");
        System.out.println();
        System.out.print("Masukkan panjang sisi : ");
        sisi = scan.nextDouble();
        luas = sisi*sisi;
        System.out.println();
        System.out.println("Luas Persegi adalah "+luas);
    }
}

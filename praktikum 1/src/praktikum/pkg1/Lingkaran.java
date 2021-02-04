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
public class Lingkaran {
    Double jari, phi, luas;
    
    void hitung(){
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println();
        System.out.println("== Luas Lingkaran ==");
        System.out.println();
        System.out.print("phi : 1. 22/7\n      2. 3,14\nPilih phi => ");
        phi = scan.nextDouble();
        System.out.print("Masukkan jari-jari : ");
        jari = scan.nextDouble();
        System.out.println();
        
        if (phi == 1){
            luas = jari*jari*22/7;
            System.out.println("Luas Lingkaran adalah "+luas);
        }
        else if (phi == 2){
            luas = jari*jari*3.14;
            System.out.println("Luas Lingkaran adalah "+luas);
        }
    }
    
}

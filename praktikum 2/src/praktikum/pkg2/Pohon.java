/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg2;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Pohon {
    String nama;
    int tinggi;
    
    Scanner scan = new Scanner(System.in);
    
    void setNama (){
        System.out.print("Masukkan nama pohon : ");
        nama = scan.nextLine();
    }
    void setTinggi (){
        System.out.print("Masukkan tinggi pohon : ");
        tinggi = scan.nextInt();
    }
    String getNama (){
        return nama;
    }
    int getTinggi (){
        return tinggi;
    }
    
}

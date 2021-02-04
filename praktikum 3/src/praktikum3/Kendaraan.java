/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * @author MOKLET-2
 */
public class Kendaraan {
    
    static void data (){
        String jenis, tipe, nama, mesin, power, torsi, stater, rem;
        int cc, tranmisi;
        double berat;
        
        jenis = "Mini Motor Racing";
        tipe = "HR01";
        nama = "NSF100";
        mesin = "Air-cooled 4- tak satu silinder";
        power = "6,2 kw/9.500 rpm";
        torsi = "7,4 N.m/7000 rpm";
        stater = "Dorong";
        rem = "Singgel depan-belakang";
        berat = 72.6;
        cc = 100;
        tranmisi = 5;
        
        System.out.println("== DATA MOTOR ==");
        System.out.println("jenis\t: "+jenis);
        System.out.println("Tipe\t: "+tipe);
        System.out.println("Model\t: "+nama);
        System.out.println("Berat\t: "+berat+" Kg");
        System.out.println("Mesin\t: "+mesin);
        System.out.println("Tranmisi: "+tranmisi+" percepatan");
        System.out.println("Cc\t: "+cc);
        System.out.println("Power\t: "+power);
        System.out.println("Torsi\t: "+torsi);
        System.out.println("Stater\t: "+stater);
        System.out.println("Rem\t: "+rem);
    }
}

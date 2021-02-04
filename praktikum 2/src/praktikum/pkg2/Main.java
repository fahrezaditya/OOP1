/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg2;

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
        c();
        k();
    }
    
    static void c(){
        String cemara;
        
        Pohon data = new Pohon();
        
        System.out.println("= POHON CEMARA =");
        data.setNama();
        data.setTinggi();
        cemara = data.getNama()+" dengan tinngi "+data.getTinggi();
        System.out.println();
        System.out.println("Pohon "+cemara+" m");
        System.out.println();
    }
    
    static void k(){
        String kelapa;
        
        Pohon data = new Pohon();
        
        System.out.println("= POHON KELAPA =");
        data.setNama();
        data.setTinggi();
        kelapa = data.getNama()+" dengan tinngi "+data.getTinggi();
        System.out.println();
        System.out.println("Pohon "+kelapa+" m");
        System.out.println();
    }
}

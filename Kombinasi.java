/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kombinasi;

import java.util.Scanner;

/**
 *
 * @author Anang Misbakhul Khoir
 * NIM 09040620047
 */
public class Kombinasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.println("Mulai Kombinasi");
      System.out.println("");
    
      Scanner input = new Scanner (System.in);
    
      int varInputN, varInputR, varHasil;
      System.out.print("Masukkan Jumlah Keseluruhan : ");
      varInputN = input.nextInt (); 
      
      System.out.print ("Masukkan Jumlah yang Diambil : ");
      varInputR = input.nextInt (); 
      varHasil  = 0;
     
      System.out.println("----------------");
      System.out.println("Keluaran ");
     
      rumusKombinasi (varInputN, varInputR, varHasil);
     
      System.out.println("----------------");
      System.out.println("Selesai");
    }
     /**
      *ncr     = n!/ r! x (n-r)!
      *n!      = bagian 1
      *r!      = bagian 2
      * (n-1)! = bagian 3
     * @param  varInputN
     * @param  varInputR
     * @param  varHasil
      */
    
     public static void rumusKombinasi(int varInputN, int varInputR, int varHasil) {

        int varBagian1 = 1;
        for (int counter = 1; counter <= varInputN; counter++) {
            varBagian1 = varBagian1 * counter;
        } 
        int varBagian2 = 1;
        for (int counter = 1; counter <= varInputR; counter++) {
            varBagian2 = varBagian2 * counter;   
        }
        int varBagian3 = 1;
        for (int counter = 1; counter <= (varInputN-varInputR); counter++){
            varBagian3 = varBagian3 * counter;
        }
    
        varHasil = varBagian1 / (varBagian2 * varBagian3);
        System.out.println("Maka banyak cara yang terjadi = " + varHasil + " cara");
    }
    
}

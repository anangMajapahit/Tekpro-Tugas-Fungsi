/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilanganprima;

import java.util.Scanner;

/**
 *
 * @author Anang Misbakhul Khoir
 * NIM 09040620047
 */
public class BilanganPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Mulai Cek Bilangan");
       System.out.println(" ");
       
       Scanner input = new Scanner (System.in);
       System.out.print("Masukkan Angka yang ingin diperiksa : ");
       int varInput = input.nextInt();
       operasiPrima (varInput);
       
       System.out.println("---------------");
       System.out.println("Selesai");
             
    }

    private static int operasiPrima(int varInput) {
        int varPembagi = 0;
        for (int counter = 1; counter <= varInput; counter++) {
           if (varInput % counter == 0) {
             varPembagi++;
           }
        }
        if (varPembagi == 2) {
           System.out.println("---------------");
           System.out.println("Keluaran");
           System.out.println("Angka " + varInput + " = Bilangan Prima");
        }
        else {
           System.out.println("---------------");
           System.out.println("Keluaran");
           System.out.println("Angka " + varInput + " = Bukan Bilangan Prima");
        }
        return varInput;
        
    }

}
    


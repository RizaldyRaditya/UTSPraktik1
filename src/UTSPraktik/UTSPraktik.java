/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSPraktik;

import java.util.Scanner;


public class UTSPraktik {
    public static void main(String[] args) {
        String namatoko = "RizaldyRadityaa";
        System.out.println("namatoko : "+ namatoko);
        
        String Barang;
         int Kode, Bayar = 0, Jumlahbarang;
         double  Hargabarang, diskon = 0;
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Barang :");
        Barang = scanner.nextLine();
        System.out.println("Hargabarang :");
        Hargabarang = scanner.nextDouble();
        System.out.println("Kode :");
        Kode = scanner.nextInt();
        
        if (Hargabarang >= 500000) {
            diskon = (Hargabarang - Hargabarang / 2);
        } else if (Hargabarang >= 200000) {
            diskon = (Hargabarang - Hargabarang* 2 / 10);
        } else if (Hargabarang >= 100000) {
            diskon = (Hargabarang - Hargabarang* 1 / 10);

        } else {
            
        }
        Bayar = (int) (Hargabarang - diskon);
        String Kasir ="Rizaldy";
        
        System.out.println("Total bayar : Rp "+ Bayar);
        System.out.println("Kasir : "+ Kasir);
    }
}

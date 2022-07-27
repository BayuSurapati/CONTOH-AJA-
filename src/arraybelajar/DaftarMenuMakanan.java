/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraybelajar;

import java.util.Scanner;

/**
 *
 * @author JeanLaptop
 */
public class DaftarMenuMakanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int a = 0;
        int hargatotal = 0;
        int nomor;
        String pesanlagi;
        String menu[] = {"Menu", "1. Burger", "2. Pizza", "3. Nasi Goreng", "4. Mie Goreng", "5. Bakso Ayam"};
        int harga[] = {1, 6000, 7000, 10000, 10000, 5000};

        System.out.println(" DAFTAR MENU ");
        System.out.println("=============");
        System.out.println(menu[0] + "->" + "Ke-" + harga[0]);
        System.out.println(menu[1] + "->" + "Rp." + harga[1]);
        System.out.println(menu[2] + "->" + "Rp." + harga[2]);
        System.out.println(menu[3] + "->" + "Rp." + harga[3]);
        System.out.println(menu[4] + "->" + "Rp." + harga[4]);
        System.out.println(menu[5] + "->" + "Rp." + harga[5]);
        System.out.println("=========================");

        do {

            Scanner input = new Scanner(System.in);

            System.out.print("Pingin Pilih Menu Nomor Berapa = ");
            nomor = input.nextInt();

            if (nomor == 1) {
                menu[a] = "Burger";
                harga[a] = 6000;
            } else if (nomor == 2) {
                menu[a] = "Pizza";
                harga[a] = 7000;
            } else if (nomor == 3) {
                menu[a] = "Nasi Goreng";
                harga[a] = 10000;
            } else if (nomor == 4) {
                menu[a] = "Mie Goreng";
                harga[a] = 10000;
            } else if (nomor == 5) {
                menu[a] = "Bakso";
                harga[a] = 5000;
            } else {
                System.out.println("Maaf Nomor yang anda pilih tidak ada");
            }
            
            System.out.println("Menu yang anda pesan       : "+menu[a]);
            System.out.println("Harga menu yang anda pesan : "+harga[a]);
            System.out.println("apakah ada yang ingin di pesan lagi? (ya/tidak)");
            pesanlagi = input.next();
        } while (pesanlagi.equalsIgnoreCase("ya"));

        System.out.println("Terimakasih telah Memesan, menu anda akan segera kami sajikan");
        
        
        
   }

}

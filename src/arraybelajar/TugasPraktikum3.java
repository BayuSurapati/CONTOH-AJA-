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
public class TugasPraktikum3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilaiMax, jumlah, i, posisi = 1, array[];
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan Banyaknya Angka : ");
        jumlah = scan.nextInt();
        array = new int[jumlah];

        System.out.println("Masukkan " + jumlah + " angka");

        for (i = 0; i < jumlah; i++) {
            System.out.print("Kata ke " + (i + 1) + " : ");
            array[i] = scan.nextInt();
        }
        nilaiMax = array[0];
        for (i = 0; i < jumlah; i++) {
            if (array[i] > nilaiMax) {
                nilaiMax = array[i];
                posisi = i + 1;

            }
        }
        System.out.println("NIlai Maksimum adalah "+nilaiMax+" berada pada indeks ke-"+posisi);
    }
}
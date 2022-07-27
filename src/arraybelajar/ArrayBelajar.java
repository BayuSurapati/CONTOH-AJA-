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
public class ArrayBelajar {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int highest, jumlah, i, lokasi = 1, array[];
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan jumlah baris: ");
    jumlah = scan.nextInt();
    array = new int[jumlah];
    
    System.out.println("Masukkan "+jumlah+" angka");
    for(i = 0; i < jumlah; i++) {
      System.out.print("Baris ke-"+ (i+1) +": " );
      array[i] = scan.nextInt();
    }
    highest = array[0];
    for(i = 0; i < jumlah; i++) {
      if (array[i] > highest){
        highest = array[i];
        lokasi = i+1;
      }
    }
    System.out.println("Nilai makasimum adalah "+highest+" berada di elemen ke "+lokasi);
    
  }
}

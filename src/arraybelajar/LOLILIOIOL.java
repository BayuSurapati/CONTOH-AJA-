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
public class LOLILIOIOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input = new Scanner(System.in);
        String nama[] = new String[3];
        String kelas[] = new String[3];
        int absen[] = new int[3];
        
        System.out.print("SISWA PERTAMA: ");
        nama[0] = input.nextLine();
        System.out.print("KELAS: ");
        kelas[0] = input.nextLine();
        System.out.print("No Absen: ");
        absen[0] = input.nextInt();
        
        System.out.print("SISWA KEDUA: ");
        nama[1] = input.nextLine();
        System.out.print("KELAS: ");
        kelas[1] = input.nextLine();
        System.out.println("No Absen: ");
        absen[1] = input.nextInt();
        
        System.out.print("SISWA KETIGA: ");
        nama[2] = input.nextLine();
        System.out.print("KELAS: ");
        kelas[2] = input.nextLine();
        System.out.print("No Absen: ");
        absen[2] = input.nextInt();
        
        System.out.println("NAMA SISWA : ");
        System.out.println(nama[0]+" "+kelas[0]+" "+absen[0]+","+nama[1]+" "+kelas[1]+" "+absen[1]+","+nama[2]+" "+kelas[2]+" "+ absen[2]);
        
        
        
        
    }
    
}

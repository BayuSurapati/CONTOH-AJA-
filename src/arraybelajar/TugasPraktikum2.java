/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraybelajar;

/**
 *
 * @author JeanLaptop
 */
public class TugasPraktikum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[][] entry = {{"Florence", "735-1234", "Manila"},
        {"Joyce", "983-3333", "Quezon City"},
        {"Becca", "456-3322", "Manila"}};
        
        //cetak data array
        for (int x = 0; x < entry.length; x++) {
            System.out.println("Name : " + entry[x][0]);
            System.out.println("Tel.# : " + entry[x][1]);
            System.out.println("Address : " + entry[x][2]);
            System.out.println("--------------------------");
        }
    }
}


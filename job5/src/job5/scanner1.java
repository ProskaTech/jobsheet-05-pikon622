/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package job5;

import java.util.Scanner;

/**
 *
 * @author Pikonnn
 */
public class scanner1 {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan nama lengkap: ");
        String nama = in.nextLine();
        
        System.out.print("Masukkan NIM: ");
        int NIM = in.nextInt();
        
        System.out.print("Masukkan Nilai: ");
        float nilai = in.nextFloat();
        
        System.out.println("\nNama  : " + nama +
                           "\nNIM   : " + NIM +
                           "\nNilai : " + nilai);
    }
}


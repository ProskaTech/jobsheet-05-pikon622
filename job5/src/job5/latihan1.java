/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package job5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author pikonnn
 */
public class latihan1 {
    public static void main(String args[]){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String a, b;
        float angka1, angka2, jumlah;
        System.out.println("Program Penjumlahan Dua Buah Bilangan");
        
        try {
            System.out.print("Masukkan Angka Pertama: ");
            a = dataIn.readLine();
            /*Data yang akan diproses aritmarika harus dikonversikan dulu
              dari tipe data String ke tipe data angka yang diperlukan.
              Data yang diperoleh dari inputan kelas BufferedReader tipe datanya selalu String*/
            angka1 = Float.parseFloat(a);//konversi dari String ke float
            
            System.out.print("Masukkan Angka Kedua: ");
            b = dataIn.readLine();
            angka2 = Float.parseFloat(b);//konversi dari string ke float
            
            jumlah = angka1 + angka2;
            System.out.println("Jumlah: " + jumlah);
        }
        
        catch (IOException e) {
            System.out.println("gagal membaca keyboard");
        }
    }
}
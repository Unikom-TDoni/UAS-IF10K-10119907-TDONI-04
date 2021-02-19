/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * TANGGAL  : 19/02/2021
 * NO SOAL  : 4
 * Deskripsi Program : Program ini digunakan untuk uas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Aplikasi Pendataan Wisatawan");
        System.out.println("=====================");
        Wisatawan wisatawan = new Wisatawan();
        System.out.println("Nama : ");
        wisatawan.setNama(scanner.nextLine());
        
        System.out.println("Kewarganegaraan : ");
        wisatawan.setKewarganegaraan(scanner.nextLine());
        
        System.out.println("Tujuan Wisata : ");
        wisatawan.setTujuanWisata(scanner.nextLine());
        
        System.out.println();
        System.out.println("Hasil Data Aplikasi Pendataan Wisatawan");
        System.out.println("=====================");
        System.out.println("Nama            : " + wisatawan.getNama());
        System.out.println("Kewarganegaraan : " + wisatawan.getKewarganegaraan());
        System.out.println("Tujuan Wisata   : " + wisatawan.getTujuanWisata());
    }
}

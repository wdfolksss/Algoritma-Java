package sesi13;

import java.util.Scanner;

public class CariData {
     private static Object ls;

     public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
            int nilai [] = {90,70,100,60,50,85};
            System.out.println("Cari Nilai: ");
            Scanner sc = new Scanner(System.in);
            int cari = sc.nextInt();
            int posisi = ls.cariData (nilai,cari);

            if(posisi == -1){
                System.out.println("Data tidak ditemukan");
            }
            else{
                System.out.println("Data ada diposisi: " + posisi);
            }
    }
}

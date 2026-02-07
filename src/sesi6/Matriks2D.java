package sesi6;

import java.util.Scanner;

public class Matriks2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Penjumlahan Matriks=====");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("==============================");
        System.out.println("Pilih Menu:     ");
        int menu = sc.nextInt();
        System.out.println("Isikan Jumlah Baris:    ");
        int baris = sc.nextInt();
        System.out.println("Isikan Jumlah Kolom:    ");
        int kolom = sc.nextInt();

        int matriksA [] [] = new int [baris] [kolom];
        int matriksB [] [] = new int [baris] [kolom];
        int hasil [] [] = new int [baris] [kolom];

        for (int i=0; i<matriksA.length; i++){
            for (int j=0; j<matriksA[i].length; j++){
                System.out.println("Nilai Matriks A:" + i + "," + j + ":");
                matriksA [i] [j] = sc.nextInt();
                System.out.println("Nilai Matriks B:" + i + "," + j + ":");
                matriksB [i] [j] = sc.nextInt();
                if (menu ==1){
                    hasil [i] [j] = matriksA [i] [j] + matriksB [i] [j];
                } 
                else if (menu ==2){
                    hasil [i] [j] = matriksA [i] [j] - matriksB [i] [j];
                }             
            }
        }

        for  (int i=0; i<matriksA.length; i++){
            for (int j=0; j<matriksA[i].length; j++){
                System.out.print(matriksA [i] [j] + " " );
            }
            System.out.println();
        }

        System.out.println("====Jumlah Matriks A====");
        for  (int i=0; i<matriksA.length; i++){
            for (int j=0; j<matriksA[i].length; j++){
                System.out.print(matriksB [i] [j] + " " );
            }
            System.out.println();
        }

        System.out.println("====Jumlah Matriks B====");
        for  (int i=0; i<matriksA.length; i++){
            for (int j=0; j<matriksA[i].length; j++){
                System.out.print(hasil [i] [j] + " " );
            }
            System.out.println();
        }
    }
}

package sesi4;
import java.util.Scanner;
// package Sesi 4;

public class Faktorial {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Isikan Angka : ");
        int angka = sc.nextInt();

        int hasil = 1;
        for(int i=1; i<=angka; i++){
            hasil = hasil * i;
            System.out.println(hasil);
        }
        System.out.println(angka + "!=" + hasil);

    }
}

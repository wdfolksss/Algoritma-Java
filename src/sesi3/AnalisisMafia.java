package sesi3;
import java.util.Scanner;

public class AnalisisMafia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Umur: ");
        int umur = sc.nextInt();
        sc.nextLine();  
        System.out.print("Masukkan Tempat Tinggal : ");
        String tempatTinggal = sc.nextLine();
        System.out.print("Masukkan Uang Tabungan (dalam dolar) : ");
        double tabungan = sc.nextDouble();
        
        String hasil;

        //Don
        if (umur > 40 &&
            (tempatTinggal.equalsIgnoreCase("Nevada") ||
            tempatTinggal.equalsIgnoreCase("New York") ||
            tempatTinggal.equalsIgnoreCase("Havana")) &&
            tabungan > 10000000) {
            hasil = "Kemungkinan adalah seorang anggota mafia dengan pangkat Don";
        
        //Underboss    
        }
        else if (umur >= 25 && umur <= 40 &&
            (tempatTinggal.equalsIgnoreCase("New Jersey") ||
            tempatTinggal.equalsIgnoreCase("Manhattan") ||
            tempatTinggal.equalsIgnoreCase("Nevada")) &&
            tabungan >= 1000000 && tabungan <= 2000000) { 
            hasil = nama + " kemungkinan adalah seorang anggota mafia dengan pangkat Underboss.";
        
        //Capo    
        }
        else if (umur >= 18 && umur <= 24 &&
            (tempatTinggal.equalsIgnoreCase("California") ||
            tempatTinggal.equalsIgnoreCase("Detroit") ||
            tempatTinggal.equalsIgnoreCase("Boston")) &&
            tabungan < 1000000) {
            hasil = nama + " kemungkinan adalah seorang anggota mafia dengan pangkat Capo.";

        } 
        else {
            hasil = nama + " tidak mencurigakan.";
        }

        System.out.println(hasil);
        sc.close();
    
    }
}


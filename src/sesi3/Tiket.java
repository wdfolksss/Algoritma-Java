package sesi3;
import java.util.Scanner;

public class Tiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====Menu====");
        System.out.println("1. Anak-anak (0-12)");
        System.out.println("2. Remaja (13-17)");
        System.out.println("3. Dewasa (18-59)");
        System.out.println("4. Lansia (>=60)" );
        System.out.println("============");

        System.out.print("Jumlah Anak:");
        int jumlahAnak = sc.nextInt();
        System.out.print("Jumlah Remaja:");
        int jumlahRemaja = sc.nextInt();
        System.out.print("Jumlah Dewasa:");
        int jumlahDewasa = sc.nextInt();
        System.out.print("Jumlah Lansia:");
        int JumlahLansia = sc.nextInt();

        int totalAnak = jumlahAnak * 10000;
        int totalRemaja = jumlahRemaja * 15000;
        int totalDewasa = jumlahDewasa * 25000;

        int totalHarga = totalAnak + totalRemaja + totalDewasa;
        int diskon = 0;
        if(totalHarga >100000){
            diskon = 5;
        }
        int totalBayar = totalHarga - (totalHarga * diskon / 100);
        System.out.println("Anak-anak " + jumlahAnak + "*10000=" + totalAnak);
        System.out.println("Remaja " + jumlahRemaja + "*15000=" + totalRemaja);
        System.out.println("Dewasa " + jumlahDewasa + "*25000=" + totalDewasa);
        System.out.println("Lansia " + JumlahLansia + "*0 = 0");
        System.out.println("Total Harga: Rp. " + totalHarga);
        System.out.println("Total Diskon: Rp. " + (totalHarga * diskon / 100));
        System.out.println("Total Bayar: Rp. " + totalBayar);
        
    }
    
}

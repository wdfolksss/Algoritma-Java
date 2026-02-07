package sesi3;
import java.util.Scanner;

public class TarifHargaWahana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Masukkan umur anak (tahun): ");
        int umur = sc.nextInt();
        System.out.print("Masukkan tinggi anak (cm): ");
        int tinggi = sc.nextInt();

        int tarifDasar = 0;
        int tambahan = 0;
        int total = 0;
        String alasanTambahan = "-"; // default

        if (umur < 1) {
            System.out.println("Dilarang masuk");
            sc.close();
            return; // langsung berhenti
        } 
        else if (umur < 3) {
            tarifDasar = 30000;
            if (umur >= 2 && tinggi > 70) {
                tambahan = 10000;
                alasanTambahan = "Tambahan Rp 10000 karena tinggi > 70 cm";
            }
        } 
        else if (umur < 7) {
            tarifDasar = 40000;
            if (umur >= 4 && tinggi > 120) {
                tambahan = 15000;
                alasanTambahan = "Tambahan Rp 15000 karena tinggi > 120 cm";
            }
        } 
        else if (umur < 10) {
            tarifDasar = 50000;
            if (umur >= 8 && tinggi > 150) {
                tambahan = 20000;
                alasanTambahan = "Tambahan Rp 20000 karena tinggi > 150 cm";
            }
        } 
        else {
            tarifDasar = 80000;
        }

        // Hitung total
        total = tarifDasar + tambahan;

        // Output hasil
        System.out.println("Tarif dasar : Rp " + tarifDasar);
        System.out.println("Tambahan   : Rp " + tambahan);
        if (!alasanTambahan.equals("-")) {
            System.out.println("Keterangan : " + alasanTambahan);
        }
        System.out.println("Total Bayar: Rp " + total);

        sc.close();
    }
}

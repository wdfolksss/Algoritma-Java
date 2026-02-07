package sesi14;
import java.util.Scanner;

public class BinarySearch { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] data = {5, 10, 25, 70, 80, 90};
        System.out.print("Masukkan angka yang dicari: ");
        int cari = input.nextInt();
        int kiri = 0;
        int kanan = data.length - 1;
        int iterasi = 0;

        while (kiri <= kanan) {
            iterasi++;
            int tengah = (kiri + kanan) / 2;

            if (data[tengah] == cari) {
                System.out.println("Angka " + cari + " ditemukan di indeks ke-" + tengah);
                break;
            } else if (data[tengah] < cari) {
                kiri = tengah + 1;
            } else {
                kanan = tengah - 1;
            }
        }

        System.out.println("Jumlah iterasi: " + iterasi);
    }
}
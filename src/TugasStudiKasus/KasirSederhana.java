package TugasStudiKasus;
import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahBarang;
        int harga;
        int total = 0;

        System.out.print("Masukkan jumlah barang yang dibeli: ");
        jumlahBarang = input.nextInt();

        for (int i = 1; i <= jumlahBarang; i++) {
            System.out.print("Masukkan harga barang ke-" + i + ": ");
            harga = input.nextInt();

            while (harga < 0) {
                System.out.print("Harga tidak valid, masukkan ulang: ");
                harga = input.nextInt();
            }

            total += harga;
        }

        int diskon = 0;
        if (total >= 500000) {
            diskon = total * 10 / 100;
        }

        int totalBayar = total - diskon;

        System.out.println("Total Belanja   : Rp" + total);
        System.out.println("Diskon          : Rp" + diskon);
        System.out.println("Total Bayar     : Rp" + totalBayar);
    }
}

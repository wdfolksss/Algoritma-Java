package Kelompok1Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueApotekAdaptif {

    static final int MAX_QUEUE = 5; // batas maksimum queue (kontrol adaptif)

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== SISTEM QUEUE APOTEK ADAPTIF ===");
            System.out.println("1. Ambil Nomor Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Panggil Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    if (queue.size() < MAX_QUEUE) {
                        System.out.print("Masukkan nama pelanggan: ");
                        String nama = input.nextLine();
                        queue.add(nama);
                        System.out.println(nama + " masuk ke antrian");
                    }
                     else {
                        System.out.println("Antrian penuh! Silakan menunggu.");
                    }
                    break;

                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Antrian masih kosong.");
                    } 
                    else {
                        System.out.println("Daftar Antrian: " + queue);
                    }
                    break;

                case 3:
                    if (!queue.isEmpty()) {
                        System.out.println("Memanggil: " + queue.poll());
                    } 
                    else {
                        System.out.println("Antrian kosong.");
                    }
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }
        } 
        while (pilihan != 4);
        input.close();
    }
}

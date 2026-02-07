package Kelompok1Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AntrianApotek {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== SISTEM ANTRIAN APOTEK ===");
            System.out.println("1. Ambil Nomor Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Panggil Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = input.nextLine();
                    queue.add(nama);
                    System.out.println( nama + " masuk ke antrian.");
                    break;
                    
                case 2:
                    System.out.println(" Daftar antrian: " + queue);
                    break;

                case 3:
                    if (!queue.isEmpty()) {
                        System.out.println(" Memanggil: " + queue.poll());
                    } 
                    else {
                        System.out.println(" Antrian kosong.");
                    }
                    break;

                case 4:
                    System.out.println(" Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }
        } 
        while (pilihan != 4);
        input.close();
    }
}
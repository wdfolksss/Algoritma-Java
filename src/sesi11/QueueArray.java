package sesi11;

import java.util.Scanner;

public class QueueArray {
    static Scanner input = new Scanner(System.in);
    static String[] queue = new String[10];
    static int size = 0;

    public static void main(String[] args) {
        int pilih;

        do {
            System.out.println("=== MENU ANTRIAN ===");
            System.out.println("1. Tambah Data Antrian");
            System.out.println("2. Hapus Antrian Elemen Pertama");
            System.out.println("3. Hapus Antrian di Posisi Tertentu");
            System.out.println("4. Hapus Semua Elemen");
            System.out.println("5. Tampilkan Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    tambah();
                    break;
                case 2:
                    hapusDepan();
                    break;
                case 3:
                    hapusPosisi();
                    break;
                case 4:
                    hapusSemua();
                    break;
                case 5:
                    tampil();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } 
        while (pilih != 0);
    }

    // Tambah Data
        static void tambah() {
        System.out.print("Masukkan data : ");
        String data = input.nextLine();

        for (int i = 0; i < data.length(); i++) {
            if (size == queue.length) {
                System.out.println("Antrian penuh!");
                break;
            }
            queue[size] = String.valueOf(data.charAt(i));
            size++;
        }
    }

    // Hapus elemen pertama (dequeue)
    static void hapusDepan() {
        if (size == 0) {
            System.out.println("Antrian kosong!");
        } 
        else {
            for (int i = 0; i < size - 1; i++) {
                queue[i] = queue[i + 1];
            }
            queue[size - 1] = null;
            size--;
            System.out.println("Elemen pertama dihapus.");
        }
    }

    // Hapus elemen di posisi tertentu
    static void hapusPosisi() {
        if (size == 0) {
            System.out.println("Antrian kosong!");
        } 
        else {
            System.out.print("Masukkan posisi (1-" + size + "): ");
            int pos = input.nextInt();
            input.nextLine();

            if (pos < 1 || pos > size) {
                System.out.println("Posisi tidak valid!");
            } 
            else {
                for (int i = pos - 1; i < size - 1; i++) {
                    queue[i] = queue[i + 1];
                }
                queue[size - 1] = null;
                size--;
                System.out.println("Data pada posisi " + pos + " dihapus.");
            }
        }
    }

    // Hapus semua elemen
    static void hapusSemua() {
        for (int i = 0; i < queue.length; i++) {
            queue[i] = null;
        }
        size = 0;
        System.out.println("Semua data dihapus.");
    }

    static void tampil() {
        System.out.println("Isi Antrian:");
        for (int i = 0; i < queue.length; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

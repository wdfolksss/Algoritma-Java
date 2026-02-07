package sesi2;
import java.util.Scanner;

    public class Operator{
        public static void main(String[] args){
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Isikan Bilangan 1:");
                int bil1 = sc.nextInt();
                System.out.print("Isikan Bilangan 2:");
                int bil2 = sc.nextInt();
                
                // Operator Aritmatika
                int hasilJumlah = bil1 + bil2;
                int hasilKurang = bil1 - bil2;
                int hasilKali = bil1 * bil2;
                double hasilBagi = (double)bil1 / bil2;
                int hasilSisa = bil1 % bil2;

                System.out.println("Hasil Jumlah:" + hasilJumlah);
                System.out.println("Hasil Kurang:" + hasilKurang);
                System.out.println("Hasil Kali:" + hasilKali);
                System.out.println("Hasil Bagi:" + hasilBagi);
                System.out.println("Hasil Sisa:" + hasilSisa);
            }

        }
    }


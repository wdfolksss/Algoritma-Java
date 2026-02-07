package sesi4;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata atau kalimat: ");
        String teks = input.nextLine();

        // Hapus spasi dan ubah huruf ke huruf kecil agar adil dalam perbandingan
        String bersih = teks.replaceAll("\\s+", "").toLowerCase();
        String balik = new StringBuilder(bersih).reverse().toString();

        if (bersih.equals(balik)) {
            System.out.println("\"" + teks + "\" adalah palindrome.");
        } 
        else {
            System.out.println("\"" + teks + "\" bukan palindrome.");
        }

    }
}

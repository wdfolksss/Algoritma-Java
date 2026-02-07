package sesi4;
import java.util.Scanner;

public class PalindromeNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        int next = angka + 1;

        // Cek angka berikutnya sampai ketemu palindrome
        while (!isPalindrome(next)) {
            next++;
        }

        System.out.println("Palindrome terdekat selanjutnya: " + next);
        input.close();
    }

    // Fungsi untuk mengecek apakah angka palindrome
    public static boolean isPalindrome(int n) {
        int temp = n;
        int reversed = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return n == reversed;
    }
}

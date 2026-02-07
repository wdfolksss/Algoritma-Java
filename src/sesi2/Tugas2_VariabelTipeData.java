package sesi2;
import java.util.Scanner;

// Nama    :Warda Amalia
// NIM     :20250040003
// Prodi   :Teknik Informatika (TI25E)
 
public class Tugas2_VariabelTipeData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Tugas Variabel & Tipe Data ===");
        System.out.println("Pilih program:");
        System.out.println("1. Konversi nilai angka ke huruf (menggunakan operator ternary)");
        System.out.println("2. Operasi aritmatika (+, -, *, /, %)");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = sc.nextInt();
        sc.nextLine(); 

        if (pilihan == 1) {
            System.out.print("Masukkan nilai (0 - 100): ");
            int nilai = sc.nextInt();
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan nilai antara 0 sampai 100.");
            } else {

                // Konversi menggunakan ternary
                String huruf = (nilai >= 85) ? "A"
                        : (nilai >= 75) ? "B"
                        : (nilai >= 65) ? "C"
                        : (nilai >= 55) ? "D"
                        : "E";

                System.out.println("Nilai " + nilai + " => " + huruf);
            }

        } else if (pilihan == 2) {
            System.out.print("Masukkan Bilangan 1                  : ");
            double a = sc.nextDouble();
            System.out.print("Masukkan Bilangan 2                  : ");
            double b = sc.nextDouble();
            sc.nextLine();
            System.out.print("Masukkan Operator (+, -, *, /, %)    : ");
            String opStr = sc.nextLine().trim();
            char op = (opStr.length() > 0) ? opStr.charAt(0) : '?';

            switch (op) {
                case '+':
                    System.out.printf("Hasil penjumlahan %.0f dan %.0f adalah %s%n", a, b, formatNumber(a + b));
                    break;
                case '-':
                    System.out.printf("Hasil pengurangan %.0f dan %.0f adalah %s%n", a, b, formatNumber(a - b));
                    break;
                case '*':
                    System.out.printf("Hasil perkalian %.0f dan %.0f adalah %s%n", a, b, formatNumber(a * b));
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    } else {
                        double hasil = a / b;
                        System.out.printf("Hasil pembagian %.0f dan %.0f adalah %s%n", a, b, formatDecimal(hasil));
                    }
                    break;
                case '%':
                    if (b == 0) {
                        System.out.println("Error: Modulus dengan nol tidak diperbolehkan.");
                    } else {
                        double hasilMod = a % b;
                        System.out.printf("Hasil modulus %.0f dan %.0f adalah %s%n", a, b, formatNumber(hasilMod));
                    }
                    break;
                default:
                    System.out.println("Operator tidak dikenali. Gunakan salah satu dari: + - * / %");
            }
        } else {
            System.out.println("Pilihan tidak valid. Jalankan ulang program dan pilih 1 atau 2.");
        }

        sc.close();
    }

    // Format angka: jika bilangan bulat (mis. 30.0) tampilkan tanpa .0, jika bukan tampilkan dengan decimal singkat
    private static String formatNumber(double x) {
        if (x == Math.rint(x)) {
            return String.format("%.0f", x);
        } else {
            return String.valueOf(x);
        }
    }

    // Format untuk pembagian: tampilkan desimal (hilangkan trailing zeros jika perlu)
    private static String formatDecimal(double x) {
        if (x == Math.rint(x)) {
            return String.format("%.0f", x);
        }
        String s = String.format("%.6f", x);
        s = s.replaceAll("0+$", "");
        s = s.replaceAll("\\.$", "");
        return s;
    }
}

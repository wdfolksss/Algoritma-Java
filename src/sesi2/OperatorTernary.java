package sesi2;
import java.util.Scanner;

public class OperatorTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nilai
        System.out.print("Masukkan nilai (0-100): ");
        int nilai = input.nextInt();

        // Konversi nilai 
        String huruf = (nilai >= 85 && nilai <= 100) ? "A" :
                       (nilai >= 75 && nilai <= 84) ? "B" :
                       (nilai >= 65 && nilai <= 74) ? "C" :
                       (nilai >= 55 && nilai <= 64) ? "D" :
                       "E";

        System.out.println("Nilai " + nilai + " = " + huruf);
        input.close();
    }
}

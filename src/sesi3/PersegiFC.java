package sesi3;
import java.util.Scanner;

public class PersegiFC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nomor punggung pemain: ");
        int nomor = sc.nextInt();
        System.out.println("Nomor punggung: " + nomor);
        System.out.print("Posisi: ");


        if (nomor % 2 == 0) { 
            // Nomor genap
            System.out.print("Target Attacker");
            if (nomor >= 50 && nomor <= 100) {
                System.out.print(" + Captain Team");
            }
        } else { 
            // Nomor ganjil
            System.out.print("Defender");
            if (nomor > 90) {
                System.out.print(" + Playmaker");
            }
            if (nomor % 15 == 0) { // kelipatan 3 dan 5
                System.out.print(" + Keeper");
            }
        }
        System.out.println();
    }
}

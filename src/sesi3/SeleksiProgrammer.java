package sesi3;
import java.util.Scanner;

public class SeleksiProgrammer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai coding (0-100): ");
        int coding = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Masukkan nilai interview (A/B/C/D): ");
        String interview = sc.nextLine().toUpperCase();

        // Penilaian coding
        String hasilCoding;
        if (coding > 80) {
            hasilCoding = "LOLOS";
        } else if (coding >= 60 && coding <= 80) {
            hasilCoding = "DIPERTIMBANGKAN";
        } else {
            hasilCoding = "GAGAL";
        }
        
        String hasilInterview;
        if (interview.equals("A") || interview.equals("B")) {
            hasilInterview = "LOLOS";
        } else {
            hasilInterview = "GAGAL";
        }

        System.out.println("Hasil tes coding    : " + hasilCoding);
        System.out.println("Hasil tes interview : " + hasilInterview);


        // Keputusan akhir
        if ((hasilCoding.equals("LOLOS") || hasilCoding.equals("DIPERTIMBANGKAN")) 
                && hasilInterview.equals("LOLOS")) {
            System.out.println("Selamat Kamu Berhasil Menjadi Calon Programmer");
        } else {
            System.out.println("Maaf Kamu Belum Berhasil Menjadi Calon Programmer");
        }

        sc.close();
    }
}
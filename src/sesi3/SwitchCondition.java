package sesi3;
import java.util.Scanner;

public class SwitchCondition {
    public static void main(String[] args) {
        String kodebuku = "";
        String buku = "";
        int jmlHari = 0;
        String status = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Isikan Kode Buku:");
        kodebuku = sc.next();
        System.out.print("Pinjam Berapa hari?");
        jmlHari = sc.nextInt();

        switch (kodebuku) {
            case "P":
                buku = "Pemrograman";
                if(jmlHari <=7){
                    status = "Boleh dipinjam selama " + jmlHari + " Hari";
                }
                else{
                    status = "Tidak Boleh dipinjam selama " + jmlHari + " Hari";
                }

                break;
            case "J":
                buku = "Jaringan Komputer";
                break;
            case "A" :
                buku = "Artificial Intelligence";
                break;
            default:
                buku = "Tidak ada kategori " + kodebuku;
                break;
        }
        System.out.println("Buku : " + buku);
        System.out.println(status);
        

    }
}






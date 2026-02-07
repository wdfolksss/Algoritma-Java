package sesi4;
import java.util.Scanner;
public class LoopWhile {
    public static void main(String[] args) {
        
        //Menu
        //1. Menjumlah 2 bilangan
        //2. Mengurangi 2 bilangan
        Scanner sc = new Scanner(System.in);
        int bil1 = 0;
        int bil2 = 0;
        int hasil = 0;
        int pilihan;
        String jawab="";

        do{
            System.out.print("Isikan Menu Pilihan:");
            pilihan = sc.nextInt();
            System.out.print("Isikan Bilangan 1:");
            bil1 = sc.nextInt();
            System.out.print("Isikan Bilangan 2:");
            bil2 = sc.nextInt();

            if(pilihan==1){
                hasil = bil1 + bil2;
            }
            else if(pilihan==2){
                hasil = bil1 - bil2;
            }
            System.out.println("Hasil :" + hasil);
            System.out.print("Apakah Mau mengulang Program (Y/T)");
            jawab = sc.next();
        }while(jawab.equals("Y"));
        
    }
}
package sesi4;
import java.util.Scanner;

public class CekPrima2 {
    public static void main(String[] args) {
        boolean isPrima = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Isikan Angka:");
        int angka = sc.nextInt();
        int count = 0;
        if(angka >=2){
            
            for(int i = 2; i<angka;i++){
                count++;
                if(angka %i==0){
                    isPrima = false;
                    break;
                }
            } 
        }
        else{
            isPrima = false;
        }

            if(isPrima){
                System.out.println(angka + " adalah bil.Prima");
            }
            else{
                System.out.println(angka + " Bukan Bil.Prima");
            }

             System.out.println("Jumlah Loop:" + count);
    }
}
package sesi4;
import java.util.Scanner;

public class CekPrima {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Isikan Angka : ");
        int angka = sc.nextInt();
        int faktor = 0;

        for(int i= 1; i<=angka; i++){
            if(angka % i ==0){
                faktor = faktor + 1;
            }
        }

        if(faktor == 2){
            System.out.println(angka + " adalah bilangan Prima");
        } else {
            System.out.println(angka + " bukan bilangan Prima");
        }

    }
}

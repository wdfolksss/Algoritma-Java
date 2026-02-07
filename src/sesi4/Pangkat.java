package sesi4;
import java.util.Scanner;

public class Pangkat {
    public static void main(String [] args){
        // 2 ^ 3 = 8
        Scanner sc = new Scanner(System.in);
        System.out.print("Isikan Bilangan : ");
        int bilangan = sc.nextInt();
        System.out.print("Isikan Pangkat : ");
        int pangkat = sc.nextInt();
        int hasil = 1;

        for (int i=1; i<=pangkat; i++){
            hasil = hasil * bilangan;
        }
        System.out.println(bilangan + "^" + pangkat + "=" + hasil);
    }
}

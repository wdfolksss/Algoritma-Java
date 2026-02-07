package UTS;
import java.util.Scanner;

public class DiskonBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total belanja Anda: ");
        double total = input.nextDouble();
        double diskon;

        if (total >= 500000) {
            diskon = 0.20; // 20%
        } 
        else if (total >= 250000) {
            diskon = 0.10; // 10%
        } 
        else {
            diskon = 0.0; // tidak ada diskon
        }

        double totalBayar = total - (total * diskon);
        System.out.println("Total belanja: Rp" + total);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Total yang harus dibayar: Rp" + totalBayar);

        input.close();
    }
}

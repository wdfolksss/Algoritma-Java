package sesi5;
import java.util.Scanner;
public class ArrayKota {
    public static void main(String[] args) {
        String kota[] = {"Sukabumi", "Cianjur", "Bandung", "Garut", 
        "Tasik", "Ciamis", "Banjar", "Cilacap"};
        
        System.out.println(" Hitung Tarif Bus ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Terminal Berangkat: ");
        String KotaAwal = scanner.next();
        System.out.print("Terminal Tujuan: ");
        String KotAkhir = scanner.next();  
        
        //tarif per kota = 5000
        int indeksAwal = 0;
        int indeksAkhir = 0;
        for(int i=0; i<kota.length; i++){
        if(kota[i].equals(KotaAwal)){
            indeksAwal = i;
        }
        else if(kota[i].equals(KotAkhir)){
            indeksAkhir = i;
        }
    }

    System.out.println("Indeks Awal: " + indeksAwal);
    System.out.println("Indeks Akhir: " + indeksAkhir);
    int biaya = (indeksAkhir - indeksAwal) * 5000;
    if (biaya <0){
        biaya = biaya * -1;
    }
    System.out.println("Tarif Bus: " + biaya);
}
}

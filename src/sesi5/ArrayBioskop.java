package sesi5;

public class ArrayBioskop {
    public static void main(String[] args) {
        char kursi [] = {'L', 'P', 'L', 'L', 'P', 'L', 'L', 'P' };

        //permasalahan => menghitung jumlah penonton L & P
        int hargaTiket = 35000;
        int totalL = 0;
        int totalP = 0;
        int totalK = 0;
        for(int i=0; i<kursi.length; i++){
            if(kursi[i] == 'L'){
                totalL++;
            }
            else if(kursi[i] == 'P'){
                totalP++;
            }
            else if(kursi[i] == '-'){
                totalK++;
            }
        }
        System.out.println("Total L: " + totalL);
        System.out.println("Total P: " + totalP);
        System.out.println("TotalK: " + totalK);
        System.out.println("Total Semua Penonton: " + (totalL + totalP));
        System.out.println("Total Harga Penonton Laki-laki: " + (totalL + totalP));
        System.out.println("Total Kursi: " + (totalL + totalP + totalK));
        int totalPendapatan = (totalL + totalP) * hargaTiket;
        System.out.println("Total Pendapatan: " + totalPendapatan);
    }
}

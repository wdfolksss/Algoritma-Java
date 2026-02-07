package sesi12;

import java.util.Scanner;

public class ObjectMahasiswa {
    static Mahasiswa[] arrMhs ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Isikan Banyak Data :");
        int n = sc.nextInt();       
        arrMhs = new Mahasiswa[n];
        for(int i=0; i<arrMhs.length; i++){
            System.out.println("NIM :");
            int nim = sc.nextInt();
            System.out.println("Nama :");
            String nama = sc.nextLine();
            arrMhs[i] = new Mahasiswa(nim, nama);
        }

        infoData();
        for(int i=0; i<arrMhs.length - 1; i++){
            for(int j=0; j<arrMhs.length - i - 1;j++){
                if(arrMhs[j].getNim() > arrMhs[j+1].getNim()){
                    Mahasiswa temp = arrMhs[j];
                    arrMhs[j] = arrMhs[j+1];
                    arrMhs[j+1] = temp;

                }
            }
        }
        System.out.println("Setelah Di Sortir :");
        infoData();
    }

    static void infoData(){
        for(int i=0; i<arrMhs.length; i++){
            System.out.println(arrMhs[i].getNim() + "," + arrMhs[i].getNama());
            System.out.println();
        }
    }
}

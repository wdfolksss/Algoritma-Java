package sesi6;

public class Array2D {
    public static void main(String[] args) {
        int data [][] = new int [2][2];

        //Memberikan nilai
        data [0][0] = 5;
        data [0][1] = 7;
        data [1][0] = 9;
        data [1][1] = 10;
        
        System.out.println("Nilai baris ke 0, kolom 0: " + data[0][0]);
        System.out.println("Nilai baris ke 0, kolom 1: " + data[0][1]);
        System.out.println("Nilai baris ke 1, kolom 0: " + data[1][0]);
        System.out.println("Nilai baris ke 1, kolom 1: " + data[1][1]);

        //mengakses elemen array 2D menggunakan perlulangan for
        // int total = 0;
        // for (int i = 0; i < data.length; i++) { //loop untuk baris
        //     for (int j = 0; j < data.length; j++) { //loop untuk kolom
        //         total = total + data[i][j];
        //         System.out.println(data[i][j]);
        //     }            
            
        // }

        // System.out.println("Jumlah Total Data: " + total);

        int total = 0;
        for (int i=0; i<data.length; i++){
            for (int j=0; j<data.length; j++){
                total = total + data [i] [j];
                System.out.println(data[i] [j]);

            }
        }
        
        System.out.println("Jumlah Total data: " + total);
    }
}

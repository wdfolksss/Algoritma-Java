package sesi6;

public class MatrikIdentitas {
    public static void main(String[] args) {
        int baris = 10;
        int kolom = 10;

        int matriks [] [] = new int [baris] [kolom];

        for (int brs=0; brs<matriks.length; brs++) {
            for (int klm=0; klm<matriks [brs].length; klm++){
                if (brs == klm){
                    matriks [brs] [klm] = 1;
                } 
                else {
                    matriks [brs] [klm] = 0;
                }
                System.out.print(matriks [brs] [klm]);    
            } 
            System.out.println();
        }
    }
}

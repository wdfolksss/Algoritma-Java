package sesi6;

public class ArrayChairs {
    public static void main (String [] args){
        char chairs [] [] = {
            { 'L', 'P', 'L', 'L', 'L', 'P', ' ', ' '},
            { 'p', 'L', 'L', 'L', 'L', 'P', 'P', 'P'},
            { 'L', 'P', 'L', 'L', 'L'},
            { 'L', 'P', 'L', 'L', 'L'},
            { 'L', 'P', 'L', 'L', 'L', 'P', 'L', 'P'},
        };

        int panjangData = chairs.length;
        System.out.println("Panjang data : " + panjangData);
        //Panjangnya data = ?? => 5
        int totalL = 0;
        int totalP = 0;
        int totalK = 0;

        for (int i=0; i<chairs.length; i++){ //loop baris
            for (int j=0; j<chairs[i].length; j++){
                if (chairs[i] [j] == 'L'){
                    totalL++;
                } 
                else if (chairs[i] [j] == 'P'){
                    totalP++;
                } 
                else {
                    totalK++;
                }
            }
        }

        System.out.println("Total Laki-laki : " + totalL);
        System.out.println("Total Perempuan : " + totalP);
        System.out.println("Total Kursi Kosong : " + totalK);
        
    }
}

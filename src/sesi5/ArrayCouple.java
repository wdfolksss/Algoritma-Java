package sesi5;

public class ArrayCouple {
    public static void main(String[] args) {
        char kursi [] = {'L', 'P', 'L', 'L', 'P', 'L', 'L', 'P' };

        //Hitung jumlah pasangan L & P
        int totalCouple = 0;
        // for(int i=0; i<kursi.length-1; i++){
        //     if(kursi[i] == 'L' && kursi[i+1] == 'P'){
        //         totalCouple++;
        //     }
        //     else if(kursi[i] == 'P' && kursi[i+1] == 'L'){
        //         totalCouple++;
        //     }
        // }
        
            for(int i=0; i<kursi.length-1; i++){
                if(kursi[i]!=kursi[i+1]){
                    totalCouple++;
                }
            }

        System.out.println("Total Couple: " + totalCouple);

    }
}

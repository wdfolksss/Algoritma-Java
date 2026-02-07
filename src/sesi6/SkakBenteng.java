package sesi6;

public class SkakBenteng {
    public static void main(String[] args) {
        char catur [] [] = {
            {'*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', 'R', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', 'B', '*'},
            {'*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*'},
        };

        int barisR = 0;
        int barisB = 0;
        int kolomR = 0;
        int kolomB = 0;        

        for (int i=0; i<catur.length; i++){
            for (int j=0; j<catur[i].length; j++){
                if (catur [i] [j] =='R'){
                    barisR = i;
                    kolomR = j;
                }
                else if (catur [i] [j] =='B'){
                    barisB = i;
                    kolomB = j;
                }
            }
        } 

        System.out.println("Raja    :" + barisR + "," + kolomR);
        System.out.println("Benteng :" + barisB + "," + kolomB);

        if (barisR >=0 && barisB >=0 && kolomR >=0 && kolomB >=0){
            if (barisB==barisR || kolomB==kolomR){
        System.out.println("SKAK");
        }
        else{
            System.out.println("Im Free");
        }
    }
    else{
        System.out.println("Taruh Bidak");
    }
    }
}

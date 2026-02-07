package sesi6;

public class GoHome {
    public static void main(String[] args) {

        /*Prabowo mau pergi ke rumah jokowi tapi tidak tau arah
         kemudian dia bertanya ke seseorang untuk menunjukan arah, 
         prabowo mau menegecek petunjuk itu benar atau salah*/

        char gmap [] []={
            {'*', 'P', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', 'J', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*'},
        };
        
        //L = Left, R = Right, U = Up, D = Down
        String petunjuk = "DDDDDRRR"; 
        int xP=0, xJ=0, yP=0, yJ=0;
        for (int i=0; i<gmap.length; i++){
            for (int j=0; j<gmap[i].length; j++){
                if (gmap [i] [j] == 'P'){
                    xP = i;
                    yP = j;
                }
                else if (gmap [i] [j] == 'J'){
                    xJ = i;
                    yJ = j;
                }
            }
        }
        gmap[xP][yP] = '*';

        for (int i=0; i<petunjuk.length(); i++){
            char arah = petunjuk.charAt(i);
            if(arah=='D'){
                xP++;
            }
            else if(arah=='U'){
                xP--;
            }
            else if(arah=='R'){
                yP++;
            }
            else if(arah =='L'){
                yP--;           
            }
        }

        if (xP==xJ && yP==yJ){
            System.out.println("Sampai Tujuan");
            gmap [xP] [yP] ='P';
        }
        else {
            System.out.println("Salah Arah");
            gmap [xP] [yP] ='P';

        }

       // Tampilkan peta hasil akhirnya
        System.out.println("\nPeta akhir perjalanan Prabowo:");
        for (int i = 0; i < gmap.length; i++) {
            for (int j = 0; j < gmap[i].length; j++) {
                System.out.print(gmap[i][j] + " ");
            }
            System.out.println();
        }
    
    }
}        

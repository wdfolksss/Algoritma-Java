package sesi4;
public class LoopFor {
    public static void main (String [] args){
        // Mencetak Angka 1-10
        for(int i = 1; i <= 10; i++) {
            System.out.print(i + "");
        }

        System.out.println();
        //Mencetak angka 10 20 30 40 ...100
        for(int i = 10; i <= 100; i += 10) {
            System.out.print(i + " ");
        }

        System.out.println();
        for(int i=1; i<=10; i++){
            System.out.print(i*10 + " ");
        }

        System.out.println();
        //mencetak angka 10,9,8,7....1
        for(int i=10; i>=1; i--){
            System.out.print(i + " ");
        }

        System.out.println();
        for(int i=1; i<=10; i++){
            System.out.println((11-i) + "");
        }

        System.out.println();
        //mencetak angka 1, -2, 3, -4, 5, -6, 7, -8, 9, -10
        for(int i=1; i<=10; i++){
            if(i % 2 == 0){
                System.out.print(i * -1 + " ");
            } else {
                System.out.print(i + " ");
            }
        }

            System.out.println();
            int tanda = 1;
            for (int i=1; i<=10; i++){
                int hasil = tanda * i;
                System.out.print(hasil + " ");
                tanda = tanda * -1;
            }
        }
    }
    

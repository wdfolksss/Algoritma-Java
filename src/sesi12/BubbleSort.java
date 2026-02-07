package sesi12;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int data [] = {1, 6, 5, 9, 4, 8};
        int size = data.length;
        int fase = 0;

        for (int i=0; i<size -1;i++){
             fase = fase + 1;
            System.out.println("Fase ke:"+fase);
            for(int j=0; j<size-i-1;j++){
                if(data[j] > data[j+1]){
                    int c = data[j];        //c = casep
                    data[j] = data[j+1];
                    data[j+1] = c;
                }
                System.out.println(Arrays.toString(data));
            }
           
        }
    }
}

package sesi10;

import java.util.Scanner;

public class Desimal2Biner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Isikan Bil. Desimal : ");

        int bil = sc.nextInt();
        String biner = "";

        while(!(bil < 1)){
        int sisa = bil % 2;
        bil = bil / 2; 
        biner = biner + sisa;
        System.out.print(sisa);
        }

        int size = biner.length();
        StackString ss = new StackString(size);

        for(int i=0; i<size; i++){
            ss.push (biner.charAt(i) + "");
        }
        String result = "";

        for(int i=0; i<size; i++){
            result += ss.pop();
        }

        System.out.println(" biner " + bil + " : " + " = " + result);

    }
}

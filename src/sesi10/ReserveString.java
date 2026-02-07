package sesi10;

import java.util.Scanner;

public class ReserveString {

    static String result = "";      //kalo diluar pake static kalo didalem pvsm jgn pake static
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in); 
        System.out.print("Masukkan kalimat atau kata: ");
        String kalimat = sc.nextLine();
        int size = kalimat.length();
        StackString rs = new StackString(size);

        for(int i=0; i<size; i++){
            String huruf = kalimat.charAt(i) + "";
            rs.push(huruf);
        }

        for(int i=0; i<size; i++){
            String huruf = rs.pop();
            result += huruf;
        }

        System.out.println(result);
        
        //tambahkan palindrome
        if(kalimat.toLowerCase().equals(result.toLowerCase())){
            System.out.println("kalimat palindrome");
        }
        else{
            System.out.println("bukan kalimat palindrome");
        }
        
    }

}

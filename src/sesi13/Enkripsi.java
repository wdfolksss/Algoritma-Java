package sesi13;
import java.util.Scanner;
// import java.util.Arrays;
public class Enkripsi{
    public static void main(String[] args) {
    int a,b,c,d;
    Scanner sc = new Scanner(System.in);
    System.out.print("Matriks A: ");
    a = Integer.parseInt(sc.nextLine());
    System.out.print("Matriks B: ");
    b = Integer.parseInt(sc.nextLine());
    System.out.print("Matriks C: ");
    c = Integer.parseInt(sc.nextLine());
    System.out.print("Matriks D: ");
    d = Integer.parseInt(sc.nextLine());

    HillCipher hc = new HillCipher(a, b, c, d);
    // hc.inversMatriks();
    // System.out.println(hc.a);
    // System.out.println(hc.b);
    // System.out.println(hc.c);
    // System.out.println(hc.d);
    // System.out.println(hc.isDeterminan());

    // int len = hc.addSpace("ABCDE").length();
    // System.out.println(hc.addSpace("ABCD"));
    // int [] result = hc.word2Array("AKU");
    // String kata = "AKU";
    // String add = hc.addSpace(kata);
    // System.out.println(Arrays.toString(result));
    // int [] kalimat = {0, 10, 20, 26};
    // System.out.println(hc.array2Word(kalimat));
    System.out.println("Isikan Kalimat");
    String kalimat = sc.nextLine();
    System.out.println("1. Enkripsi: ");
    System.out.println("2. Dekripsi: ");
    int pilihan  = sc.nextInt();

    if(pilihan ==1){
        if(hc.isDeterminan()){
            kalimat = hc.addSpace(kalimat);
            int [] arrayKalimat = hc.word2Array(kalimat);
            for(int i=0; i<arrayKalimat.length; i+=2){
                int blk1 = ((arrayKalimat [i] * a) + (arrayKalimat[i+1] * c)) % 27;
                int blk2 = ((arrayKalimat [i] * b) + (arrayKalimat[i+1] * d)) % 27;
                arrayKalimat[i] = blk1;
                arrayKalimat[i + 1] = blk2;

            }
            // System.out.println(Arrays.toString(arrayKalimat));
            System.out.println(hc.array2Word(arrayKalimat));
        }
        else{
            System.out.println("Ulangi Lagi, Determinan harus = 1");
        }
    }
    else if(pilihan ==2){
        if(hc.isDeterminan()){
            hc.inversMatriks();
            kalimat = hc.addSpace(kalimat);
            int [] arrayKalimat = hc.word2Array(kalimat);
            for(int i=0; i<arrayKalimat.length; i+=2){
                int blk1 = ((arrayKalimat[i] * hc.a) + (arrayKalimat[i+1] * hc.c)) % 27;
                int blk2 = ((arrayKalimat[i] * hc.b) + (arrayKalimat [i+1] * hc.d)) % 27;
                arrayKalimat[i] = blk1;
                arrayKalimat[i+1] = blk2;
            }
            System.out.println(hc.array2Word(arrayKalimat));
        }
        else{
            System.out.println("Ulangi Lagi, Determinan harus = 1");
        }
        }
    }
}
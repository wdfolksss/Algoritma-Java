// package sesi2;
// import java.util.Scanner;

// public class OperasiAritmatika {
//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);
//         System.out.print("Masukkan bilangan 1 : ");
//         int bil1 = input.nextInt();
//         System.out.print("Masukkan bilangan 2 : ");
//         int bil2 = input.nextInt();
//         System.out.print("Masukkan Operator (+, -, *, /, %) : ");
//         char op = input.next().charAt(0);

//         switch (op) {
//             case '+':
//                 System.out.println("Hasil penjumlahan " + bil1 + " + " + bil2 + " adalah " + (bil1 + bil2));
//                 break;

//             case '-':
//                 System.out.println("Hasil pengurangan " + bil1 + " - " + bil2 + " adalah " + (bil1 - bil2));
//                 break;

//             case '*':
//                 System.out.println("Hasil perkalian " + bil1 + " * " + bil2 + " adalah " + (bil1 * bil2));
//                 break;

//             case '/':
//                 if (bil2 != 0) {
//                     System.out.println("Hasil pembagian " + bil1 + " / " + bil2 + " adalah " + (bil1 / bil2));
//                 } else {
//                     System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
//                 }
//                 break;

//             case '%':
//                 System.out.println("Hasil modulus " + bil1 + " dan " + bil2 + " adalah " + (bil1 % bil2));
//                 break;
//         }
//     }
// }


package sesi2;

import java.util.Scanner;

public class OperasiAritmatika{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bil1");
        int bil1 = input.nextInt();
        System.out.println("Masukkan bil2");
        int bil2 = input.nextInt();
        System.out.println("Masukkan Operator (+, -, *, /, %)");
        char operasi = input.next().charAt(0);

        switch (operasi) {
            case '+' :
                System.out.println("Hasil dari Penjumlahan " + bil1 + "+" + bil2 + " adalah " + (bil1 + bil2 ));
                break;
            case '-' :
                System.out.println("Hasil dari Pengurangan " + bil1 + "-" + bil2 + " adalah " + (bil1 - bil2 ));
                break;
                case '/' :
                if (bil2 !=0){
                    System.out.println("Hasil dari Pembagian " + bil1 + "/" + bil2 + " adalah " + (bil1 / bil2 ));
                }
                else{
                    System.out.println("error karna 0 dalam pembagian tidak diperbolehkan");
                }
                break;
                case '%' :
                    System.out.println("Hasil dari Modulus " + bil1 + "%" + bil2 + " adalah " + (bil1 % bil2 ));
                    break;
        }
    }
}

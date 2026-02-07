package sesi10;

import java.util.Scanner;

public class NavigasiBrowser {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackNavigasi browser = new StackNavigasi();
        int menu;

        do {
            System.out.println("\nPilih Menu:");
            System.out.println("1. Input URL");
            System.out.println("2. Forward");
            System.out.println("3. Back");
            System.out.println("4. Exit");
            System.out.print("Menu : ");
            menu = input.nextInt();
            input.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Input URL : ");
                    String url = input.nextLine();
                    browser.inputURL(url);
                    break;

                case 2:
                    browser.forward();
                    break;

                case 3:
                    browser.back();
                    break;

                case 4:
                    System.out.println("Program selesai...");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }
        } 
        while (menu != 4);
        input.close();
    }
}

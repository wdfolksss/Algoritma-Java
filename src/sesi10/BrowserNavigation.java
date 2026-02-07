package  sesi10;
import java.util.Scanner;
import java.util.Stack;

public class BrowserNavigation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> backStack = new Stack<>();
        Stack<String> forwardStack = new Stack<>();
        String currentPage = null;
        int menu;

        do {
            System.out.println("\nPilih Menu:");
            System.out.println("1. Input URL");
            System.out.println("2. Forward");
            System.out.println("3. Back");
            System.out.println("4. Exit");
            System.out.print("\nMenu : ");
            menu = input.nextInt();
            input.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Input URL : ");
                    String newURL = input.nextLine();

                    if (currentPage != null) {
                        backStack.push(currentPage);
                    }

                    currentPage = newURL;
                    forwardStack.clear();

                    System.out.println("Output : Anda sekarang berada di halaman " + currentPage);
                    break;

                case 2: // FORWARD
                    if (forwardStack.isEmpty()) {
                        System.out.println("Output : Anda sudah dihalaman paling depan");
                    } 
                    else {
                        backStack.push(currentPage);
                        currentPage = forwardStack.pop();
                        System.out.println("Output : Anda sekarang berada di halaman " + currentPage);
                    }
                    break;

                case 3: // BACK
                    if (backStack.isEmpty()) {
                        System.out.println("Output : Anda sudah dihalaman paling belakang");
                    } 
                    else {
                        forwardStack.push(currentPage);
                        currentPage = backStack.pop();
                        System.out.println("Output : Anda sekarang berada di halaman " + currentPage);
                    }
                    break;

                case 4:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

        } 
        while (menu != 4);
        input.close();
    }
}

package sesi10;

import java.util.Stack;

public class StackNavigasi {
    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String currentPage = null;

    // INPUT URL 
    public void inputURL(String url) {
        if (currentPage != null) {
            backStack.push(currentPage); // SIMPAN ke BACK (push)
        }
        currentPage = url;               // PINDAH ke halaman baru
        forwardStack.clear();            // HAPUS riwayat forward
        System.out.println("Output : Anda sekarang berada di halaman " + currentPage);
    }

    // BACK 
    public void back() {
        if (backStack.isEmpty()) {
            System.out.println("Output : Anda sudah dihalaman paling belakang");
        } 
        else {
            forwardStack.push(currentPage);   // SIMPAN ke FORWARD (push)
            currentPage = backStack.pop();    // AMBIL dari BACK (pop)
            System.out.println("Output : Anda sekarang berada di halaman " + currentPage);
        }
    }

    //  FORWARD 
    public void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("Output : Anda sudah dihalaman paling depan");
        } 
        else {
            backStack.push(currentPage);      // SIMPAN ke BACK (push)
            currentPage = forwardStack.pop(); // AMBIL dari FORWARD (pop)
            System.out.println("Output : Anda sekarang berada di halaman " + currentPage);
        }
    }
}

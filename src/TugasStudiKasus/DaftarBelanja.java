package TugasStudiKasus;

import java.util.ArrayList;

public class DaftarBelanja {
    public static void main(String[] args) {

        ArrayList<String> belanja = new ArrayList<>();

        belanja.add("Beras");
        belanja.add("Gula");
        belanja.add("Minyak");
        belanja.add("Telur");

        System.out.println("Daftar Belanja Awal:");
        for (String b : belanja) {
            System.out.println("- " + b);
        }

        belanja.remove("Gula");

        System.out.println("Daftar Belanja Setelah Dihapus:");
        for (String b : belanja) {
            System.out.println("- " + b);
        }
    }
}
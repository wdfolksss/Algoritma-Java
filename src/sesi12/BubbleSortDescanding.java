package sesi12;
public class BubbleSortDescanding {
    public static void main(String[] args) {
        String[] kota = {
            "Semarang", "Malang", "Jakarta",
            "Cianjur", "Bogor", "Denpasar"
        };

        int n = kota.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (kota[j].compareTo(kota[j + 1]) < 0) {
                    String temp = kota[j];
                    kota[j] = kota[j + 1];
                    kota[j + 1] = temp;
                }
            }
        }

        System.out.println("Hasil Sorting DESCENDING:");
        for (String k : kota) {
            System.out.print(k + " ");
        }
    }
}

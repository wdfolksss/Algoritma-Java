package sesi12;
public class BubbleSortAngkaStep {
    public static void main(String[] args) {

        int[] data = {100, 90, 73, 60, 2, 41};
        int n = data.length;

        System.out.println("Data Awal:");
        tampil(data);
        System.out.println();

        for (int i = 0; i < n - 1; i++) {
            System.out.println("FASE " + (i + 1));

            for (int j = 0; j < n - 1 - i; j++) {
                if (data[j] < data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
                tampil(data);
            }
            System.out.println();
        }

        System.out.println("Hasil Akhir:");
        tampil(data);
    }

    static void tampil(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}

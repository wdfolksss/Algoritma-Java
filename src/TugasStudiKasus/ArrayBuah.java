package TugasStudiKasus;
public class ArrayBuah {
    public static void main(String[] args) {

        String[] buah = {"Apel", "Jeruk", "Mangga"};
        System.out.println("Daftar Nama Buah:");

        for (int i = 0; i < buah.length; i++) {
            System.out.println("Buah ke-" + (i + 1) + ": " + buah[i]);
        }
    }
}

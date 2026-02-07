package sesi11;
public class QueueLinear {
    int size;
    int capacity;
    char[] array;

    public QueueLinear(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.array = new char[capacity];
    }

    void enqueue(char item) {
        if (size < capacity) {
            array[size] = item;
            size++;
        }
    }

    // Menghapus 'a' (elemen pertama)
    void dequeueA() {
        if (size == 0) return;
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = '\0';
        size--;
    }

    // FITUR BARU: Menghapus 'f' di mana pun posisinya
    void removeF() {
        int indexF = -1;
        // Cari index huruf 'f'
        for (int i = 0; i < size; i++) {
            if (array[i] == 'f') {
                indexF = i;
                break;
            }
        }

        if (indexF != -1) {
            System.out.println("Menghapus '" + array[indexF] + "' pada index ke-" + indexF);
            // Geser semua elemen setelah f ke kiri
            for (int i = indexF; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            // Tambahkan null di bagian paling belakang
            array[size - 1] = '\0';
            size--;
        } else {
            System.out.println("Huruf 'f' tidak ditemukan.");
        }
    }

    void display() {
        System.out.print("Isi Array: [ ");
        for (int i = 0; i < capacity; i++) {
            if (array[i] == '\0') {
                System.out.print("null ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        QueueLinear q = new QueueLinear(10);
        char[] data = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        for (char c : data) q.enqueue(c);

        System.out.println("Keadaan Awal:");
        q.display();

        System.out.println("\nSetelah menghapus 'a':");
        q.dequeueA();
        q.display();

        System.out.println("\nSetelah menghapus 'f':");
        q.removeF();
        q.display();
    }
}
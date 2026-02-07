package sesi5;

public class ArrayHotel {
    public static void main(String[] args) {

        char kamar[][] = {
            {'*', '*', '*', '*', 'X'},   // Lantai 1
            {'*', '*', '*', '*', '*'},   // Lantai 2
            {'*', '*', '*', '*', '*'},   // Lantai 3
            {'*', '*', '*', 'X', '*'}    // Lantai 4
        };

        int kosong = 0; 
        // for (int i = 0; i < kamar.length; i++) {             // per lantai
        for (int i = kamar.length - 1; i >= 0; i--) {           // mulai dari lantai 4
            for (int j = 0; j < kamar[i].length; j++) {         // per kamar
                if (kamar[i][j] == 'X') {
                    System.out.println("Tamu berada di Lantai " + (i + 1) + " Kamar " + (j + 1));
                } else if (kamar[i][j] == '*') {
                    kosong++;
                }
            }
        }
        System.out.println("Jumlah kamar yang tersedia adalah " + kosong + " kamar");
    }
}

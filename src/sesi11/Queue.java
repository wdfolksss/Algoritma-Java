package sesi11;

import java.util.ArrayDeque;

public class Queue {
 
    public static void main(String[] args) {
        ArrayDeque<String> data = new ArrayDeque<>();
        data.add("Jakarta");
        data.add("Bogor");
        data.add("Sukabumi");
        data.add("Bandung");

        System.out.println("Data Poll :" + data.poll());

        String first = data.getFirst();
        String last = data.getLast();

        System.out.println("Elemen Pertama :" + first);
        System.out.println("Elemen Terakhir :" + last);
        System.out.println(data.contains("Medan"));
        System.out.println(data.contains("Bandung"));

        int size = data.size();
        System.out.println("Ukuran Antrian :" + size);

        for(int i=0;i<data.size();i++){
            System.out.println(data.remove());
        }


    }
}

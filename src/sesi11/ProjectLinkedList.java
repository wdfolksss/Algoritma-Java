package sesi11;
import java.util.LinkedList;

public class ProjectLinkedList {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();

        list1.add(5);
        list1.add(10);
        list1.add(20);

        list2.add(30);
        list2.add(40);
        list2.add(50);
        
        list3.add(60);
        list3.add(70);
        list3.add(80);
        list3.add(90);

        int size1 = list1.size();
        int size2 = list2.size();
        int size3 = list3.size();

        System.out.println("Panjang Linked List:");
        System.out.println("List 1: " + size1);
        System.out.println("List 2: " + size2);
        System.out.println("List 3: " + size3);
        System.out.println();

        int maxSize = Math.max(size1, Math.max(size2, size3));

        System.out.println("Linked List dengan panjang sama:");

        if (size1 == size2) {
            System.out.println("List 1: " + list1);
            System.out.println("List 2: " + list2);
        }

        if (size1 == size3) {
            System.out.println("List 1: " + list1);
            System.out.println("List 3: " + list3);
        }

        if (size2 == size3 && size1 != size2) {
            System.out.println("List 2: " + list2);
            System.out.println("List 3: " + list3);
        }

        System.out.println();

        System.out.println("Linked List PALING PANJANG:");

        if (size1 == maxSize) {
            System.out.println("List 1: " + list1);
        }
        if (size2 == maxSize) {
            System.out.println("List 2: " + list2);
        }
        if (size3 == maxSize) {
            System.out.println("List 3: " + list3);
        }
    }
}

package sesi10;

public class StackNilai {
    public static void main(String[] args) {
        int a; //primitive

        //reference tipe data
        StackArray s1 = new StackArray(4);
        
        s1.push(5);
        s1.push(10);
        s1.push(8);
        s1.push(100);
        s1.push(600);
        s1.infoStack();

        int nilai = s1.pop();
        System.out.println(nilai);
        nilai = s1.pop();
        System.out.println(nilai);
        nilai = s1.pop();
        System.out.println(nilai);
        nilai = s1.pop();
        System.out.println(nilai);
        nilai = s1.pop();
        System.out.println(nilai);
        
    }
}

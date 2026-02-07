package sesi5;
public class BelajarArray {
    public static void main(String[] args){
        String students [] = new String[5];
     
        //Memberi nilai pada array
        students[0] = "Wadaa";
        students[1] = "Bunga";
        students[2] = "Keyzia";
        students[3] = "Nazwa";
        students[4] = "Maysa";

        int scores [] = {100, 90, 60, 70, 51};

        //Mengakses nilai pada array
        System.out.println("Nilai" + students[0] +  "="  + scores[0]);
        //Mengakses nilai pada array
        // System.out.println(Arrays.toString(students));
        

        //Menggunakan Loopoing pada array
        for(int i=0; i<students.length; i++){
            System.out.println(students[i]);
        }

        //mencari nilai rata-rata
        int total = 0;
        for(int i=0; i<scores.length; i++){
            total = total + scores[i];
        }

        double rata2 = (double)total / scores.length;   
        System.out.println("Rata-rata = " + rata2);
    }
}

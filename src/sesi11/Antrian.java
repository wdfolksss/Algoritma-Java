package sesi11;
public class Antrian {
    String [] data;
    int palingdepan, palingbelakang;
    int maksElemen; 

    public Antrian(int ukuran){
        palingdepan = 0;
        palingbelakang = 0;
        maksElemen = ukuran;
        data = new String[maksElemen];
    }

    public void insert(String data){

        if(palingbelakang == maksElemen){
            System.out.println("Antrian Sudah Penuh");
            System.out.println(data + " Tidak masuk kedalam antrian");
        }
        else{
            this.data[palingbelakang] = data;
            palingbelakang++;
        }
    }

    public String infoPalingBelakang(){
       return "Posisi paling belakang adalah " + data[palingbelakang-1];
    }

    public String infoPalingDepan(){
        return "Posisi paling depan adalah " + data[palingdepan];
    }

    public String remove(){
        String d = data[palingdepan];
        data[palingdepan] = null;
        palingdepan++;
        return d;
        }

    public void info(){
        for(int i=0;i<data.length;i++){
            System.out.println(i + " , " + data[i]);
        }
    }
}


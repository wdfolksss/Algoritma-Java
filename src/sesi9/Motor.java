package sesi9;

public class Motor {
    String warna;
    int kecepatan;
    String merk;
    boolean isOn = false;

    //  Method dibagi jadi 2
    //  1. Setter = memberi nilai ke atribut (void)
    //  2.Getter = mengambil nilai atribut (tipe data)

    

    public void setMotor( String w, int v, String merk){
        warna = w;
        kecepatan = v;
        this.merk = merk;
    }

    public String getWarna(){
        return warna;
    }

    public int getKecepatan(){
        return kecepatan;
    }

    public String getMerk(){
        return merk;
    }

    public void setOn(){
        isOn = true;
    }

    public void setOff(){
        isOn = false;
        kecepatan = 0;
    }

    public void setKecepatan(int v ){
        if (isOn == true) {
            kecepatan += v;
        }
        else{

            System.out.println("Motor mati belum menyala");
        }
        
    }

    public void infoMotor(){
        System.out.println("Merk :" + getMerk());
        System.out.println("Warna :" + getWarna());
        System.out.println("Kecepatan :" + getKecepatan ()+ "KM/H");
    }

}

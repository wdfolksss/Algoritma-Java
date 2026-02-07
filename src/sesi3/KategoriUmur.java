package sesi3;
import javax.swing.JOptionPane;

public class KategoriUmur{
    public static void main(String[] args){
        String umur =
        JOptionPane.showInputDialog("Isikan Umur: ");
        
        int i_umur = Integer.parseInt(umur);
        String hasil = "";
        if(i_umur >0 && i_umur <=12){
            hasil = "Anak-anak";
        }
        else if(i_umur >12 && i_umur <=17){
            hasil = "Remaja";        
        }
        else if(i_umur >17 && i_umur <=59){
            hasil = "Dewasa";        
        }
        else if(i_umur >60){
            hasil = "Lansia";        
        }
        else{
            hasil = "Umur tidak valid";
        }

        JOptionPane.showConfirmDialog(null, hasil);
    }
}
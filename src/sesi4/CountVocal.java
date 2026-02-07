package sesi4;
public class CountVocal {
    public static void main(String [] args){
        //A. I, U, E, O

        String kalimat = "Hallo Apa kabar youuu, I Miss You XXL";
        int panjang = kalimat.length();
        int totalA = 0;
        int totalI = 0;
        int totalU = 0;
        int totalE = 0;
        int totalO = 0;
        int totalVokal = 0;
        int totalKonsonan = 0;

        for(int i=0; i<panjang; i++){
            char huruf = kalimat.charAt(i);
            if(huruf == 'a'){
                totalA = totalA + 1;
            }
            else if(huruf == 'i'){
                totalI = totalI + 1;
            }
            else if(huruf == 'u'){
                totalU = totalU + 1;
            }
            else if(huruf == 'e'){
                totalE = totalE + 1;
            }
            else if(huruf == 'o'){
                totalO = totalO + 1;
            }
        }

        totalVokal = totalA + totalI + totalU + totalE + totalO;
        totalKonsonan = panjang - totalVokal; // spasi dan y
        System.out.println("Total Huruf A = " + totalA);
        System.out.println("Total Huruf I = " + totalI);
        System.out.println("Total Huruf U = " + totalU);
        System.out.println("Total Huruf E = " + totalE);
        System.out.println("Total Huruf O = " + totalO);
        System.out.println("Total Huruf Vokal = " + (totalA + totalI + totalU + totalE + totalO));
        System.out.println("Total Huruf Konsonan = " + totalKonsonan);
        
    }
}

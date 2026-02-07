package sesi13;

public class HillCipher {
    int a, b, c, d;
    String dictionary = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
    HillCipher(int a, int b, int c, int d){ //contsractor
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

    }

    public boolean isDeterminan(){
        return (a * d) - (b * c) ==1;   
    }

    public void inversMatriks(){
        int temp = a;
        a = d;
        d = temp;

        b = 27 - b;
        c = 27 - c;
    }

    public String addSpace(String words){
        // String swords = null;
        // if(words.length ()% 2 != 0){
        //     swords = words + " ";
        // }
        // return swords;

        return words.length ()% 2==1 ? words + " ": words;
    }

    public int [] word2Array(String words){
        int result [] = new int [words.length()];
        
        for(int i=0; i<words.length(); i++){
            for (int j=0; j<dictionary.length(); j++){
                if(words.charAt(i) == dictionary.charAt(j)){
                    result[i] = j;
                }

            }
        }
        return result;
    }

    public String array2Word(int array []){
        String result = "";
        for (int i=0; i<array.length; i++){
            result += dictionary.charAt(array[i]);
        }
        return result;
    }
}

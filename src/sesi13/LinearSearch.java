package sesi13;
public class LinearSearch {
    
    int posisi = -1;
    public int cariData(int data[], int key){
        int j=0;
        int n = data.length;

        while(j<n){
            if(data[j] == key){
                posisi = j;
                break;
            }
            j++;
        }
        return posisi;
    }
    
}

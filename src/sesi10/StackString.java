package sesi10;

public class StackString {
        int MAX_SIZE;
        int top;
        String stack [];

        //constructor adalah method sama dengan nama class
        //inisialisasi atribut/variabel
        // hanya dipanggil 1x saat penciptaam objek

        public StackString( int size){
            MAX_SIZE = size ;
            stack = new String [size];
            top = -1;
        } 

        public void push (String value){
            if (top == MAX_SIZE) {
                System.out.println("Tumpukkan sudah penuh");
            }
            else{
                top = top + 1;
                stack[top] = value;
            }
        }
        
        public String pop (){
            if (isempty()){
                System.out.println("Tumpukkan kosong");
                return ""; 
            }

            String value = stack[top];
            top = top -1;
            return value;
        }

        public boolean isempty(){
            return  top == -1;
        }

        public String infoStack(){
            String word = "";
            String p = "";
            for (int i=0; i<=top; i++){
                p = stack[i];
                word = p + word;
            }
            return word;
        }
}

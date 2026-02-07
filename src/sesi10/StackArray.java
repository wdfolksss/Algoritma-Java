package sesi10;

public class StackArray {
        int MAX_SIZE;
        int top;
        int stack [];

        //constructor adalah method sama dengan nama class
        //inisialisasi atribut/variabel
        // hanya dipanggil 1x saat penciptaam objek

        public StackArray( int size){
            MAX_SIZE = size - 1;
            stack = new int [size];
            top = -1;
        } 

        public void push (int value){
            if (top == MAX_SIZE) {
                System.out.println("Tumpukkan sudah penuh");
            }
            else{
                top = top + 1;
                stack[top] = value;
            }
        }

        public int pop (){
            if (isempty()){
                System.out.println("Tumpukkan kosong");
                return -1; 
            }
            int value = stack[top];
            top = top -1;
            return  value;
        }

        public boolean isempty(){
            return  top == -1;
        }

        public void infoStack(){
            for (int i=0; i<=top; i++){
                System.out.println(stack[i] + " ");
            }
            System.out.println();
        }
}

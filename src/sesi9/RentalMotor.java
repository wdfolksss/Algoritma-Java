package sesi9;

public class RentalMotor {
    public static void main(String[] args) {
        Motor m1 = new Motor();
        Motor m2 = new Motor();
        String nama;
        m1.setMotor( "Merah", 0, "Yamaha");
        m2.setMotor("Hitam", 0, "Honda");
        m1.setOn();
        m1.setOff();
        m1.setKecepatan(20);
        m1.setKecepatan(20);
        m1.infoMotor();
        m2.infoMotor();

        m1.setOff();
        m1.infoMotor();
        m1.setKecepatan(60);
    }
}

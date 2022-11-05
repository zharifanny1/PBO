import java.awt.image.Kernel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Penyewa penyewa = new Penyewa();
        Motor motor = new Motor();
        //Motor_manual manual = new Motor_manual();
        //Motor_matic matic = new Motor_matic();
        Rental_motor rentalmotor = new Rental_motor();


        penyewa.output();
        motor.output();
        rentalmotor.output();


    }
}
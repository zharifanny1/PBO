import java.util.Scanner;

public class Motor extends Rental_motor{

    private int id_motor;
    private String nama_motor;
    private String pabrikan_motor;
    private String warna_motor;
    private int biaya_rental;

    public int getBiaya_rental() {
        return biaya_rental;
    }

    public void setBiaya_rental(int biaya_rental) {
        this.biaya_rental = biaya_rental;
    }

    public int getId_motor() {
        return id_motor;
    }


    public void setId_motor(int i) {
        this.id_motor = id_motor;
    }

    public String getNama_motor() {
        return nama_motor;
    }

    public void setNama_motor(String nama_motor) {
        this.nama_motor = nama_motor;
    }

    public String getPabrikan_motor() {
        return pabrikan_motor;
    }

    public void setPabrikan_motor(String pabrikan_motor) {
        this.pabrikan_motor = pabrikan_motor;
    }

    public String getWarna_motor() {
        return warna_motor;
    }

    public void setWarna_motor(String warna_motor) {
        this.warna_motor = warna_motor;
    }

    public void output() {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Masukkan ID Motor: ");
        setId_motor(userinput.nextInt());

        System.out.println("Masukkan Nama Motor: ");
        setNama_motor(userinput.next());

        System.out.println("Masukkan Pabrikan Motor : ");
        setPabrikan_motor(userinput.next());

        System.out.println("Masukkan Warna Motor : ");
        setWarna_motor(userinput.next());

        System.out.println("ID Motor " + this.id_motor);
        System.out.println("Nama Motor " + this.nama_motor);
        System.out.println("Pabrikan Motor "+ this.pabrikan_motor);
        System.out.println("Warna Motor "+ this.pabrikan_motor);
    }

}

import java.util.Scanner;

public class Rental_motor {
    private int id_rental;
    private int tanggal_rental;
    private int id_motor;
    private int tanggal_pengembalian;

    private int jumlah_rental;
    private int total_biaya;

    public int getJumlah_rental() {
        return jumlah_rental;
    }

    public void setJumlah_rental(int jumlah_rental) {
        this.jumlah_rental = jumlah_rental;
    }

    public int getId_rental() {
        return id_rental;
    }

    public void setId_rental(int id_rental) {
        this.id_rental = id_rental;
    }

    public int getTanggal_rental() {
        return tanggal_rental;
    }

    public void setTanggal_rental(int tanggal_rental) {
        this.tanggal_rental = tanggal_rental;
    }

    public int getId_motor() {
        return id_motor;
    }

    public void setId_motor(int id_motor) {
        this.id_motor = id_motor;
    }

    public int getTanggal_pengembalian() {
        return tanggal_pengembalian;
    }

    public void setTanggal_pengembalian(int tanggal_pengembalian) {
        this.tanggal_pengembalian = tanggal_pengembalian;
    }

    public int getTotal_biaya() {
        return total_biaya;
    }

    public void setTotal_biaya(int total_biaya) {
        this.total_biaya = total_biaya;
    }

    public void output(){
        Scanner userinput = new Scanner(System.in);
        System.out.println("Masukkan ID Rental : ");
        setId_motor(userinput.nextInt());
        System.out.println("Masukkan Tanggal Rental : ");
        setTanggal_rental(userinput.nextInt());
        System.out.println("Masukkan ID Motor : ");
        setId_motor(userinput.nextInt());
        System.out.println("Masukkan Tanggal Pengembalian : ");
        setTanggal_pengembalian(userinput.nextInt());
        System.out.println("Masukkan Jumlah Rental : ");
        setJumlah_rental(userinput.nextInt());
        System.out.println("Masukkan Total Biaya : ");
        setTotal_biaya(userinput.nextInt());
tant
    }
}


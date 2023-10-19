package PRAK202_2210817210033_HariOctavianDelrossi;

public class Kopi {
    String namaKopi, ukuran, pembeli;
    double harga;

    public void info(){
        System.out.println("Nama Kopi: " +namaKopi);
        System.out.println("Ukuran: " +ukuran);
        System.out.println("Harga: Rp. " +harga);
    }

    public void setPembeli(String pembeli){
        this.pembeli = pembeli;
    }
    public double getPajak(){
        double pajak = harga * 0.11;
        return pajak;
    }
    public String getPembeli(){
        return pembeli;
    }
}

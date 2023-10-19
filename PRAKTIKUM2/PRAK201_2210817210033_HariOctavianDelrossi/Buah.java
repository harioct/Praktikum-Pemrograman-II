package PRAK201_2210817210033_HariOctavianDelrossi;

public class Buah {
    String nama;
    double berat, harga, jumlahBeli, sebelumDiskon, diskon, setelahDiskon;
    public Buah(String nama, double berat, double harga, double jumlahBeli, double sebelumDiskon){
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
        this.sebelumDiskon = sebelumDiskon;
    }
    public void Diskon(){
        diskon = (Math.floor(jumlahBeli/4) * 0.02 * harga * 4);
        setelahDiskon = sebelumDiskon-diskon;
        System.out.printf("Total Diskon: Rp%.2f\n", diskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n", setelahDiskon);
    }
    void infoBuah(){
        System.out.println("Nama Buah: "+nama);
        System.out.println("Berat: "+berat);
        System.out.println("Harga: "+harga);
        System.out.println("Jumlah Beli: "+jumlahBeli+"kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", sebelumDiskon);
        Diskon();
    }
}

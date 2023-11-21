package soal2;

public class Kucing extends HewanPeliharaan{
    private String warnaBulu;

    public Kucing(String nama, String ras, String warna){
        super.nama = nama;
        super.ras = ras;
        this.warnaBulu = warna;
    }
    public void displayDetailKucing(){
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah: " + nama);
        System.out.println("Dengan ras : " + ras);
        System.out.println("Memiliki warna bulu : " + warnaBulu);
    }
}

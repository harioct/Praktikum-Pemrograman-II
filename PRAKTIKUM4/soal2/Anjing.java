package soal2;
import java.util.Arrays;

public class Anjing extends HewanPeliharaan{
    private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String nama, String ras, String warna, String[]kemampuan){
        super.nama = nama;
        super.ras = ras;
        this.warnaBulu = warna;
        this.kemampuan = kemampuan;
    }
    public void displayDetailAnjing(){
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.println("Memiliki kemampuan : " + Arrays.toString(kemampuan).replace("[", "").replace("]", "").replace(",", ""));
    }
}

package PRAK301_2210817210033_HariOctavianDelrossi;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;

public class Dadu {
    private int sisi;
    private int hasilLemparan;
    private Random acak;
    private static int totalNilai = 0;

    public Dadu() {
        this.sisi = 6;
        acak = new Random();
        acakNilai();
    }

        public void acakNilai() {
        this.hasilLemparan = acak.nextInt(sisi) + 1;
    }

    public int lempar() {
        acakNilai();
        totalNilai += hasilLemparan;
        return hasilLemparan;
    }

    public int getSisi() {
        return sisi;
    }

    public static void main(String[] args) {
        LinkedList<Dadu> daftarDadu = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int jumlahDadu = scanner.nextInt();

        for (int i = 0; i < jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            daftarDadu.add(dadu);
            int hasilLempar = dadu.lempar();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + hasilLempar);
        }

        System.out.println("Total nilai dadu keseluruhan " + totalNilai);
    }
}

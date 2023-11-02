package PRAK302_2210817210033_HariOctavianDelrossi;
import java.util.LinkedList;
import java.util.Scanner;

public class MainNegara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahNegara = scanner.nextInt();
        scanner.nextLine();

        LinkedList<Negara> listNegara = new LinkedList<Negara>();

        for (int i = 0; i < jumlahNegara; i++) {
            String namaNegara = scanner.nextLine();
            String jenisKepemimpinan = scanner.nextLine();
            String namaPemimpin = scanner.nextLine();
            int tanggalKemerdekaan = 0;
            int bulanKemerdekaan = 0;
            int tahunKemerdekaan = 0;

            if (!jenisKepemimpinan.equals("monarki")) {
                tanggalKemerdekaan = scanner.nextInt();
                bulanKemerdekaan = scanner.nextInt();
                tahunKemerdekaan = scanner.nextInt();
            }
            scanner.nextLine();
            Negara negara = new Negara(namaNegara, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            listNegara.add(negara);
        }

        for (Negara negara : listNegara) {
            System.out.print("Negara " + negara.getNama() + " mempunyai ");
            if (negara.getJenisKepemimpinan().equals("monarki")) {
                System.out.println("Raja bernama " + negara.getNamaPemimpin());
                System.out.println();
            } else {
                System.out.println("Presiden bernama " + negara.getNamaPemimpin());
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggalKemerdekaan());
                System.out.println();
            }
        }
    }
}

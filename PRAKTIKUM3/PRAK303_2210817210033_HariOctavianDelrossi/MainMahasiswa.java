package PRAK303_2210817210033_HariOctavianDelrossi;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = input.nextLine();
                System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                String nim = input.nextLine();

                Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                daftarMahasiswa.add(mahasiswa);

                System.out.println("Mahasiswa " + nama + " ditambahkan.");
            } else if (pilihan == 2) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String nimHapus = input.nextLine();

                for (int i = 0; i < daftarMahasiswa.size(); i++) {
                    if (daftarMahasiswa.get(i).getNIM().equals(nimHapus)) {
                        daftarMahasiswa.remove(i);
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                        break;
                    }
                }
            } else if (pilihan == 3) {
                System.out.print("Masukkan NIM Mahasiswa yang ingin dicari: ");
                String nimCari = input.nextLine();

                for (Mahasiswa mahasiswa : daftarMahasiswa) {
                    if (mahasiswa.getNIM().equals(nimCari)) {
                        System.out.println("Mahasiswa ditemukan:");
                        System.out.println("NIM: " + mahasiswa.getNIM() + ", Nama: " + mahasiswa.getNama());
                        break;
                    }
                }
            } else if (pilihan == 4) {
                System.out.println("Daftar Mahasiswa:");
                for (Mahasiswa mahasiswa : daftarMahasiswa) {
                    System.out.println("NIM: " + mahasiswa.getNIM() + ", Nama: " + mahasiswa.getNama());
                }
            } else if (pilihan == 0) {
                System.out.println("Terima kasih!");
                daftarMahasiswa.clear();
                break;
            }
        }
    }
}

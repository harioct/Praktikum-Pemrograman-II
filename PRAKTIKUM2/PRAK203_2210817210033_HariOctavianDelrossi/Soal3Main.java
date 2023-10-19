package PRAK203_2210817210033_HariOctavianDelrossi;


public class Soal3Main {
    public static void main(String[] args){
        Pegawai p1 = new Pegawai();
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        //Pada baris ini ditambahkan inisialisasi p1.umur, jika tidak maka pada output umur akan menunjukkan angka 0
        p1.umur = 17;

        //Pada baris ini dihilangkan kata "Pegawai", agar sesuai dengan output soal
        //System.out.println("Nama Pegawai: " +p1.getNama());
        System.out.println("Nama: " +p1.getNama());
        System.out.println("Asal: " +p1.getAsal());
        System.out.println("Jabatan: " +p1.jabatan);
        //Pada baris ini ditambahkan kata "Tahun", agar sesuai dengan output soal
        //System.out.println("Umur: " +p1.umur);
        System.out.println("Umur: " +p1.umur+ " Tahun");
    }
}

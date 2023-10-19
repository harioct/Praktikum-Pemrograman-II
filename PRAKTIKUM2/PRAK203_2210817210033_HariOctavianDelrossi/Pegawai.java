package PRAK203_2210817210033_HariOctavianDelrossi;

//Pada baris ini terjadi error karena nama class tidak sesuai
//public class Employee {
public class Pegawai {
    public String nama;

    //Pada baris ini terjadi error karena tipe data salah
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama(){
        return nama;
    }

    public String getAsal(){
        return asal;
    }

    //Pada baris ini terjadi error karena tidak ada parameter yang diterima method
    //public void setJabatan(){
    public void setJabatan(String j){
        this.jabatan = j;
    }
}

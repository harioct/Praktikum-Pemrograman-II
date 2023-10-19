package PRAK201_2210817210033_HariOctavianDelrossi;

public class Soal1Main {
    public static void main(String[] args){
        Buah apel = new Buah("Apel", 0.4, 7000.0, 40.0, 700000);
        Buah mangga = new Buah("mangga", 0.2, 3500.0, 15.0, 262500);
        Buah alpukat = new Buah("alpukat", 0.25, 10000.0, 12.0, 480000);

        apel.infoBuah();
        mangga.infoBuah();
        alpukat.infoBuah();
    }
}

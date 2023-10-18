package PRAKTIKUM0;
import java.util.Scanner;

public class PRAK005_2210817210033_HariOctavianDelrossi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Makanan Favorit: ");
        String makananFavorit = scanner.nextLine();

        System.out.print("Masukan Hobi: ");
        String hobi = scanner.nextLine();

        System.out.println("Aku Suka Makan " + makananFavorit + ", dan Hobiku " + hobi);
    }
}

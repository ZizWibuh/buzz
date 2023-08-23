import java.util.Scanner;

public class ujicoba1 {
    public static void main(String[] args) {
        
        Scanner balok = new Scanner(System.in);

        System.out.println("Input panjang: ");
        int panjang = balok.nextInt();

        System.out.println("Input lebar: ");
        int lebar = balok.nextInt();

        System.out.println("Input tinggi: ");
        int tinggi = balok.nextInt();

        int rumusBalok = (panjang*lebar*tinggi);
        System.out.println("Hasil: "+ rumusBalok);

        balok.close();
    }
}
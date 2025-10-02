import java.util.Scanner;

public class LuasKelilingBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu : ");
        System.out.println("1. menghitung luas dan keliling persegi panjang ");
        System.out.println("2. menghitung luas dan keliling lingkaran ");
        System.out.println("3. menghitung luas dan keliling segitiga ");
        System.out.print("\nPilihan anda : ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang  : ");
                int Panjang = input.nextInt();
                System.out.print("Masukkan lebar    : ");
                int Lebar = input.nextInt();
                int luasPersegiPanjang = Panjang * Lebar;
                int kelilingPersegiPanjang = 2 * (Panjang + Lebar);
                System.out.println("\nKeliling persegi panjang : " + kelilingPersegiPanjang + " cm");
                System.out.println("Luas persegi panjang     : " + luasPersegiPanjang + " cm2");
                break;

            case 2:
                System.out.print("Masukkan jari-jari: ");
                double jari = input.nextDouble();
                double luasLingkaran = Math.PI * jari * jari;
                double kelilingLingkaran = 2 * Math.PI * jari;
                System.out.println("\nKeliling lingkaran : " + String.format("%.2f", kelilingLingkaran) + " cm");
                System.out.println("Luas lingkaran     : " + String.format("%.2f", luasLingkaran) + " cm2");
                break;

            case 3:
                // menggunakan permisalan huruf a untuk sisi, huruf b untuk alas, dan c untuk
                // tinggi
                System.out.print("Masukkan a: ");
                int a = input.nextInt();
                System.out.print("Masukkan b: ");
                int b = input.nextInt();
                System.out.print("Masukkan r: ");
                int c = input.nextInt();
                int kelilingSegitiga = a + b + c;
                int luasSegitiga = (a * b) / 2;
                System.out.println("\nKeliling segitiga : " + kelilingSegitiga + " cm");
                System.out.println("Luas segitiga     : " + luasSegitiga + " cm2");
                break;

            default:
                System.out.println("Data tak ditemukan, program dihentikan...");
        }
    }
}

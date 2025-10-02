import java.util.Scanner;

public class operasiMatematika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int penjumlahan, pengurangan, perkalian;
        double pembagian;

        // Input angka pertama
        System.out.print("Masukkan angka pertama : ");
        int x = input.nextInt();
        // Input angka kedua
        System.out.print("Masukkan angka kedua   : ");
        int y = input.nextInt();

        // Operasi aritmatika
        penjumlahan = x + y;
        pengurangan = x - y;
        perkalian = x * y;
        pembagian = (double) x / y;

        // Output
        System.out.println("Hasil Penjumlahan : " + penjumlahan);
        System.out.println("Hasil Pengurangan : " + pengurangan);
        System.out.println("Hasil Perkalian   : " + perkalian);
        System.out.println("Hasil Pembagaian  : " + pembagian);
    }
}

import java.util.Scanner;

public class segitigasikubintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            // cetak spasi di depan supaya rata kanan
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            // cetak bintang rapat
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

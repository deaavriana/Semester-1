import java.util.Scanner;

public class menghitungVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMENU");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
            System.out.print("\nMASUKKAN PILIHAN ANDA: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang : ");
                    double p = input.nextDouble();
                    System.out.print("Masukkan lebar   : ");
                    double l = input.nextDouble();
                    System.out.print("Masukkan tinggi  : ");
                    double t = input.nextDouble();
                    double volumeBalok = p * l * t;
                    System.out.println("Volume Balok   = " + volumeBalok);
                    break;

                case 2:
                    System.out.print("Masukkan jari-jari bola : ");
                    double rBola = input.nextDouble();
                    double volumeBola = (4.0 / 3.0) * Math.PI * Math.pow(rBola, 3);
                    System.out.printf("Volume Bola           = " + String.format("%.2f", volumeBola));
                    break;

                case 3:
                    System.out.print("Masukkkan jari-jari alas kerucut : ");
                    double rKerucut = input.nextDouble();
                    System.out.print("Masukkan tinggi kerucut          : ");
                    double tKerucut = input.nextDouble();
                    double volumeKerucut = (1.0 / 3.0) * Math.PI * Math.pow(rKerucut, 2) * tKerucut;
                    System.out.printf("Volume Kerucut                 = " + String.format("%.2f", volumeKerucut));
                    break;

                case 4:
                    System.out.print("Masukkan jari-jari silinder : ");
                    double rSilinder = input.nextDouble();
                    System.out.print("Masukkan tinggi silinder    : ");
                    double tSilinder = input.nextDouble();
                    double volumeSilinder = Math.PI * Math.pow(rSilinder, 2) * tSilinder;
                    System.out.printf("Volume Silinder           = " + String.format("%.2f", volumeSilinder));
                    break;

                case 5:
                    System.out.print("Masukkan  luas alas segitiga : ");
                    double luasAlas = input.nextDouble();
                    System.out.print("Masukkan tinggi limas        : ");
                    double tLimas = input.nextDouble();
                    double volumeLimas = (1.0 / 3.0) * luasAlas * tLimas;
                    System.out.printf("Volume Limas                = " + String.format("%.2f", volumeLimas));
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih! ");
                    break;

                default:
                    System.out.print("Pilihan tidak valid! ");
            }
            System.out.println();
        } while (pilihan != 0);
    }
}

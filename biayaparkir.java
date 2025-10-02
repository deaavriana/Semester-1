import java.util.Scanner;

public class biayaparkir {
    
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        double menitParkir;
        menitParkir = input.nextDouble();
        
        double biayaParkir;
        biayaParkir = 0.0;
        
        if (menitParkir <= 0) {
            System.out.println("Misiiii input ga valid nihh!!");
            return;
        }
        
        input.nextLine();
        String Kendaraan;
        Kendaraan = input.nextLine().toLowerCase();
        
        if (!Kendaraan.equals("mobil") && !Kendaraan.equals("motor")) {
           System.out.println("Jalan kaki tidak perlu bayar parkir");
           return;
        }
        if (menitParkir <= 5) {
            biayaParkir = 3000;
            System.out.println("Biaya parkir " + Kendaraan + " hanya Rp" + String.format("%,.2f", biayaParkir) + " karena hanya " + menitParkir + " menit ");
            return;
            
        } else {
            double jam = menitParkir/60.0;
            if (menitParkir <= 120) {
                biayaParkir = 5000;
            } else {
                biayaParkir = 5000;
                double kelebihan = menitParkir - 120;
                int kelipatan10 = (int) Math.ceil(kelebihan/10.0);
                if (Kendaraan.equals("motor")) {
                    biayaParkir += kelipatan10 * 1000;
                } else if (Kendaraan.equals("mobil")) {
                    biayaParkir += kelipatan10 * 2000;
                }
                System.out.println("Biaya parkir " + Kendaraan + " selama " + jam + " jam adalah Rp" + String.format("%,.2f", biayaParkir));
            return;
            }
            System.out.println("Biaya parkir " + Kendaraan + " selama " + jam + " jam adalah Rp " + String.format("%,.2f", biayaParkir));
            return;
        }
    }
}

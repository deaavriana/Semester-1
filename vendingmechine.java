import java.util.Scanner;

public class vendingmechine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kodeBarang = input.nextLine();
        int jumlahBarang = input.nextInt();
        double jumlahUang = input.nextDouble();

        String nama = "";
        double harga = 0;
        int stok = 0;

        switch (kodeBarang) {
            case "A":
                nama = "Susu";
                harga = 7500;
                stok = 3;
                break;
            case "B":
                nama = "Snack";
                harga = 10000;
                stok = 4;
                break;
            case "C":
                nama = "Air mineral";
                harga = 6500;
                stok = 1;
                break;
            default:
                System.out.println("Kode barang tidak valid");
                return;
        }
        if (jumlahBarang <= 0) {
            System.out.println("Anda tidak melakukan pembelian apapun");
            return;
        }
        if (jumlahBarang > stok) {
            System.out.println("Stok tidak mencukupi");
            return;
        }
        double total = harga * jumlahBarang;

        if (jumlahUang < total) {
            System.out.println("Uang anda tidak cukup");
            return;
        }

        double kembalian = jumlahUang - total;
        System.out.println(
                "Kamu sudah beli " + nama + ", dan mendapat kembalian sejumlah Rp" + String.format("%,.2f", kembalian));
        return;
    }
}

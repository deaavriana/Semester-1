import java.util.Scanner;

public class PenggajianPekerja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int upahPerjam = 5000;
        int upahLembur = 6000;
        int sanksi = 1000;
        int maksJam = 60;
        int minJam = 50;
        int upah = 0, lembur = 0, denda = 0, total;

        // input jam kerja
        System.out.print("Masukkan jam kerja per minggu : ");
        int jamKerja = input.nextInt();

        // Pengajian
        if (jamKerja > maksJam) {
            upah = maksJam * upahPerjam;
            lembur = (jamKerja - maksJam) * upahLembur;
            total = upah + lembur;

        } else if (jamKerja < minJam) {
            upah = jamKerja * upahPerjam;
            denda = (minJam - jamKerja) * sanksi;
            total = upah - denda;

        } else {
            upah = jamKerja * upahPerjam;
            total = upah;
        }
        // output
        System.out.println("\nJam kerja      : " + jamKerja);
        System.out.println("Upah     = Rp. " + upah);
        System.out.println("Lembur   = Rp. " + lembur);
        System.out.println("Denda    = Rp. " + denda);
        System.out.println("------------------------");
        System.out.println("Total    = Rp. " + total);
    }
}

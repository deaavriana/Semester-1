import java.util.Scanner;

public class kalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hasil = 0;
        boolean kondisi = true;
        int operator;
        
        while (kondisi) {
            operator = input.nextInt();
            if (operator == 0) {
              System.out.println("Hasil akhir: " + hasil);
              System.out.println("Kalkulator dimatikan");
              kondisi = false;
            } else if (operator >= 1 && operator <= 4) {
            
            switch (operator) {
                case 1:
                    double nilaiTambah = input.nextDouble();
                    hasil += nilaiTambah;
                    break;
                case 2: 
                    double nilaiKurang = input.nextDouble();
                    hasil -= nilaiKurang;
                    break;
                case 3:
                    double nilaiKali = input.nextDouble();
                    hasil *= nilaiKali;
                    break;
                case 4:
                    double nilaiBagi = input.nextDouble();
                    hasil /= nilaiBagi;
                    break;
                }   
            } else {
                System.out.println("Opsi tidak ditemukan");
                
            }
        }
    }
}

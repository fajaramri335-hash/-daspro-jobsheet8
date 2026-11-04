import java.util.Scanner;

public class Tugas316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalSemua = 0;
            int maxBarang = -1;   
            int tokoTerbanyak = 0;
            String ringkasan = ""; 

            for (int t = 1; t <= jumlahToko; t++) {
                int pelanggan;
                do {
                    System.out.print("Toko " + t + " - jumlah pelanggan: ");
                    pelanggan = sc.nextInt();
                    if (pelanggan < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi!");
                    }
                } while (pelanggan < 0);

                int totalBarang = 0;
                for (int p = 1; p <= pelanggan; p++) {
                    int barang;
                    do {
                        System.out.print("  Barang pelanggan " + p + ": ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("  Tidak boleh negatif. Ulangi!");
                        }
                    } while (barang < 0);
                    totalBarang += barang;
                }

                ringkasan += "Toko " + t + " - pelanggan: " + pelanggan
                        + ", total barang: " + totalBarang + "\n";
                totalSemua += totalBarang;

                if (totalBarang > maxBarang) {   
                    maxBarang = totalBarang;
                    tokoTerbanyak = t;
                }
            }

            System.out.println();
            System.out.print(ringkasan);
            System.out.println("Total barang seluruh toko: " + totalSemua);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}
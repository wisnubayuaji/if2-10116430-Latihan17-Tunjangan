/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double gajiPokok;
        double tunjangan = 0.35;
        String status;

        Scanner sc = new Scanner(System.in);

        System.out.println("===============Program Tunjangan===============");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        gajiPokok = sc.nextDouble();
        System.out.print("Status Anda? (menikah/belum)    : ");
        status = sc.next();

        if (status.equals("menikah")) {
            System.out.println("==========Hasil Perhitungan Gaji Anda==========");
            System.out.println("Gaji Pokok                      : Rp. " + gajiPokok);
            System.out.println("Tunjangan                       : RP. " + (gajiPokok * tunjangan));
            System.out.println("Total Gaji                      : Rp. " + (gajiPokok * tunjangan + gajiPokok));
        } else {
            System.out.println("==========Hasil Perhitungan Gaji Anda==========");
            System.out.println("Gaji Pokok                      : Rp. " + gajiPokok);
            System.out.println("Tunjangan                       : RP. 0");
            System.out.println("Total Gaji                      : Rp. " + gajiPokok);
        }

        System.out.println("(Developed by : Wisnu Bayu Aji)");
    }
}

import java.util.Scanner;

public class GajiKaryawan {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah jam kerja
        System.out.print("Masukkan jumlah jam kerja");
        int JamKerja = scanner.nextInt();

        // Meminta tarif per jam
        System.out.print("Masukkan terif per jam");
        int tarifPerJam = scanner.nextInt();

        // Menghitung gaji bruto
        int gajiBruto = JamKerja * tarifPerJam;

        // Menghitung potongan pajak 
        double potonganPajak = gajiBruto * 0.10;

        // Menghitung gaji bersih
        double gajiBersih = gajiBruto - potonganPajak;

        // Menampilkan Hasil
        System.out.println("Gaji bruto: "+ gajiBruto);
        System.out.println("Potongan pajak: "+ potonganPajak);
        System.out.println("Gaji bersih: "+ gajiBersih);


    }
    }

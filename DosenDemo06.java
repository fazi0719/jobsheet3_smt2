import java.util.Scanner;
public class DosenDemo06 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Dosen06[] arrayOfDosen = new Dosen06[3];
       String dummy;
       
       for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode : ");
            String kode = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (laki-laki/perempuan) : "); 
            dummy = sc.nextLine(); 
            boolean jk = dummy.equalsIgnoreCase("laki-laki");
            System.out.print("Usia : ");
            int usia = Integer.parseInt(sc.nextLine());
            arrayOfDosen[i] = new Dosen06(kode, nama, jk, usia);
            System.out.println("---------------------------");
        }
        System.out.println("\nDAFTAR DOSEN:");
        int counter = 1;
        for (Dosen06 dsn : arrayOfDosen) { // Loop FOREACH
            System.out.println("Data Dosen ke-" + counter);
            System.out.println("Kode : " + dsn.kode);
            System.out.println("Nama : " + dsn.nama);
            
            // Mengubah boolean kembali ke teks untuk tampilan
            String jkTeks = (dsn.jenisKelamin) ? "laki-laki" : "perempuan";
            System.out.println("Jenis Kelamin : " + jkTeks);
            
            System.out.println("Usia : " + dsn.usia);
            System.out.println("---------------------------");
            counter++;
        }
   }
}

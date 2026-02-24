public class dataDosen06 {
    public void dataSemuaDosen(Dosen06[] arrayOfDosen){
        System.out.println("\n=== DATA SEMUA DOSEN ===");
        for (Dosen06 dsn : arrayOfDosen) {
            System.out.println("Kode : " + dsn.kode);
            System.out.println("Nama : " + dsn.nama);
            System.out.println("Jenis Kelamin : " + (dsn.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia : " + dsn.usia);
            System.out.println("---------------------------");
        }
    }
    //mengitung jumlahDosenPerJenisKelamin
    public void jumlahDosenPerJenisKelamin(Dosen06[] arrayOfDosen) {
        int jumlahLakiLaki = 0;
        int jumlahPerempuan = 0;
        for (Dosen06 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) {
                jumlahLakiLaki++;
            } else {
                jumlahPerempuan++;
            }
        }
        System.out.println("\n=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        System.out.println("Jumlah Dosen Laki-laki : " + jumlahLakiLaki);
        System.out.println("Jumlah Dosen Perempuan : " + jumlahPerempuan);
    }
    // rerataUsiaDosenPerJenisKelamin
    public void rerataUsiaDosenPerJenisKelamin(Dosen06[] arrayOfDosen) {
        int totalUsiaLakiLaki = 0;
        int totalUsiaPerempuan = 0;
        int jumlahLakiLaki = 0;
        int jumlahPerempuan = 0;
        for (Dosen06 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) {
                totalUsiaLakiLaki += dsn.usia;
                jumlahLakiLaki++;
            } else {
                totalUsiaPerempuan += dsn.usia;
                jumlahPerempuan++;
            }
        }
        double rerataUsiaLakiLaki = (jumlahLakiLaki > 0) ? (double) totalUsiaLakiLaki / jumlahLakiLaki : 0;
        double rerataUsiaPerempuan = (jumlahPerempuan > 0) ? (double) totalUsiaPerempuan / jumlahPerempuan : 0;
        System.out.println("\n=== RERATA USIA DOSEN PER JENIS KELAMIN ===");
        System.out.println("Rerata Usia Dosen Laki-laki : " + rerataUsiaLakiLaki);
        System.out.println("Rerata Usia Dosen Perempuan : " + rerataUsiaPerempuan);
    }
    //mencari dosen paling tua
    public void dosenPalingTua(Dosen06[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }
        Dosen06 dosenTua = arrayOfDosen[0];
        for (Dosen06 dsn : arrayOfDosen) {
            if (dsn.usia > dosenTua.usia) {
                dosenTua = dsn;
            }
        }
        System.out.println("\n=== DOSEN PALING TUA ===");
        System.out.println("Kode : " + dosenTua.kode);
        System.out.println("Nama : " + dosenTua.nama);
        System.out.println("Jenis Kelamin : " + (dosenTua.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia : " + dosenTua.usia);
    }
    //mencari dosen paling muda
    public void dosenPalingMuda(Dosen06[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }
        Dosen06 dosenMuda = arrayOfDosen[0];
        for (Dosen06 dsn : arrayOfDosen) {
            if (dsn.usia < dosenMuda.usia) {
                dosenMuda = dsn;
            }
        }
        System.out.println("\n=== DOSEN PALING MUDA ===");
        System.out.println("Kode : " + dosenMuda.kode);
        System.out.println("Nama : " + dosenMuda.nama);
        System.out.println("Jenis Kelamin : " + (dosenMuda.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia : " + dosenMuda.usia);  
    }
}

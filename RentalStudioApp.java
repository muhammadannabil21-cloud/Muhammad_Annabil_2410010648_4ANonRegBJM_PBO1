import java.util.Scanner;

public class RentalStudioApp {
    public static void main(String[] args) {
        // IO Sederhana menggunakan Scanner untuk menerima input keyboard
        Scanner pengetik = new Scanner(System.in);
        
        // Penerapan Array untuk menampung beberapa objek studio sekaligus
        Studio[] listStudio = new Studio[3];
        
        // Instansiasi Objek baru ke dalam array
        listStudio[0] = new Studio("Reguler A", 75000);
        listStudio[1] = new Studio("Reguler B", 90000);
        listStudio[2] = new StudioPremium("VIP Rock", 175000, "Gitar Fender + Drum Tama");

        System.out.println("=========================================");
        System.out.println("    APLIKASI SEWA STUDIO MUSIK UNISKA    ");
        System.out.println("=========================================");
        
        // Perulangan (Looping) untuk menampilkan semua daftar studio yang tersedia
        for (int i = 0; i < listStudio.length; i++) {
            System.out.println("\n[ KODE STUDIO: " + (i + 1) + " ]");
            listStudio[i].cetakInfo(); // Menjalankan method informasi masing-masing objek
            System.out.println("-----------------------------------------");
        }

        // Error Handling dengan struktur try-catch untuk mencegah crash jika salah input
        try {
            System.out.print("\nMasukkan Kode Studio yang ingin disewa (1-3): ");
            int nomorPilihan = pengetik.nextInt();
            
            System.out.print("Berapa jam durasi latihan musik?: ");
            int durasiJam = pengetik.nextInt();

            // Struktur Seleksi (Kondisional if-else) untuk validasi input
            if (nomorPilihan >= 1 && nomorPilihan <= 3) {
                Studio studioTerpilih = listStudio[nomorPilihan - 1];
                double totalBayar = studioTerpilih.getTarifPerJam() * durasiJam;
                
                System.out.println("\n=========================================");
                System.out.println("          STRUK BUKTI PENYEWAAN          ");
                System.out.println("=========================================");
                System.out.println("Studio Dipesan : " + studioTerpilih.getNamaStudio());
                System.out.println("Durasi Sewa    : " + durasiJam + " Jam");
                System.out.println("Total Tagihan  : Rp" + totalBayar);
                System.out.println("=========================================");
            } else {
                System.out.println("❌ Kode studio salah! Silakan jalankan ulang program.");
            }
            
        } catch (Exception e) {
            System.out.println("❌ Terjadi Kesalahan: Tolong masukkan angka saja, jangan huruf!");
        } finally {
            // Menutup resource scanner setelah selesai digunakan
            pengetik.close();
            System.out.println("\n[Sistem Ditutup] Selamat berkarya dan latihan musik!");
        }
    }
    }
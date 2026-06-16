// Konsep Inheritance (Pewarisan sifat dari class Studio)
public class StudioPremium extends Studio {
    private String alatEksklusif;

    // Constructor class anak yang terhubung ke class induk
    public StudioPremium(String namaStudio, double tarifPerJam, String alatEksklusif) {
        super(namaStudio, tarifPerJam);
        this.alatEksklusif = alatEksklusif;
    }

    // Menerapkan Polymorphism (Overriding method cetakInfo)
    @Override
    public void cetakInfo() {
        super.cetakInfo(); // Memanggil fungsi cetak dari class induk
        System.out.println("Kategori    : PREMIUM STUDIO");
        System.out.println("Bonus Alat  : " + alatEksklusif);
    }
}
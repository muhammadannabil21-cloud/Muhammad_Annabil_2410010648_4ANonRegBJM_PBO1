public class Studio {
    // Atribut dengan hak akses privat (Encapsulation)
    private String namaStudio;
    private double tarifPerJam;

    // Constructor untuk inisialisasi data studio
    public Studio(String namaStudio, double tarifPerJam) {
        this.namaStudio = namaStudio;
        this.tarifPerJam = tarifPerJam;
    }

    // Method Mutator (Setter) untuk mengubah data
    public void setNamaStudio(String namaStudio) {
        this.namaStudio = namaStudio;
    }

    public void setTarifPerJam(double tarifPerJam) {
        this.tarifPerJam = tarifPerJam;
    }

    // Method Accessor (Getter) untuk mengambil data
    public String getNamaStudio() {
        return namaStudio;
    }

    public double getTarifPerJam() {
        return tarifPerJam;
    }

    // Method untuk menampilkan informasi dasar studio
    public void cetakInfo() {
        System.out.println("Nama Studio : Studio " + namaStudio);
        System.out.println("Tarif / Jam : Rp" + tarifPerJam);
    }
}
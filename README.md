# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data penyewaan studio musik menggunakan Java sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini menerima input berupa jenis studio musik yang ingin disewa dan durasi sewa, lalu memberikan output berupa Struk Bukti Penyewaan beserta rincian total tagihan biaya sewa secara otomatis.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Studio`, `StudioPremium`, dan `RentalStudioApp` adalah contoh dari class.

<pre><code>public class Studio {
    ...
}

public class StudioPremium extends Studio {
    ...
}

public class RentalStudioApp {
    ...
}</code></pre>

2. **Object** adalah instance dari class. Pada kode ini, `listStudio[0] = new Studio("Reguler A", 75000);` adalah contoh pembuatan object.

<pre><code>listStudio[0] = new Studio("Reguler A", 75000);</code></pre>

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaStudio` dan `tarifPerJam` adalah contoh atribut.

<pre><code>private String namaStudio;
private int tarifPerJam;</code></pre>

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Studio` dan `StudioPremium`.

<pre><code>public Studio(String namaStudio, int tarifPerJam) {
    this.namaStudio = namaStudio;
    this.tarifPerJam = tarifPerJam;
}

public StudioPremium(String namaStudio, int tarifPerJam, String alatEksklusif) {
    super(namaStudio, tarifPerJam);
    this.alatEksklusif = alatEksklusif;
}</code></pre>

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaStudio` dan `setTarifPerJam` adalah contoh method mutator.

<pre><code>public void setNamaStudio(String namaStudio) {
    this.namaStudio = namaStudio;
}

public void setTarifPerJam(int tarifPerJam) {
    this.tarifPerJam = tarifPerJam;
}</code></pre>

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaStudio` dan `getTarifPerJam` adalah contoh method accessor.

<pre><code>public String getNamaStudio() {
    return namaStudio;
}

public int getTarifPerJam() {
    return tarifPerJam;
}</code></pre>

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaStudio` dan `tarifPerJam` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

<pre><code>private String namaStudio;
private int tarifPerJam;</code></pre>

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `StudioPremium` mewarisi `Studio` dengan sintaks `extends`.

<pre><code>public class StudioPremium extends Studio {
    ...
}</code></pre>

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `cetakInfo()` di `StudioPremium` merupakan override dari method `cetakInfo()` di `Studio`.

<pre><code>@Override
public void cetakInfo() {
    super.cetakInfo();
    System.out.println("Alat Eksklusif : " + alatEksklusif);
}</code></pre>

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if-else` untuk mengecek validasi nomor studio.

<pre><code>if (nomorPilihan >= 1 && nomorPilihan <= listStudio.length) {
    ...
} else {
    System.out.println("Pilihan tidak valid!");
}</code></pre>

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk menampilkan daftar studio musik yang tersedia.

<pre><code>for (int i = 0; i < listStudio.length; i++) {
    ...
}</code></pre>

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan struk.

<pre><code>Scanner pengetik = new Scanner(System.in);
System.out.print("Masukkan Kode Studio yang ingin disewa (1-3) : ");
int nomorPilihan = pengetik.nextInt();</code></pre>

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Studio[] listStudio = new Studio[3];` adalah contoh penggunaan array objek.

<pre><code>Studio[] listStudio = new Studio[3];</code></pre>

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try-catch` untuk menangani error input data.

<pre><code>try {
    // code yang kemungkinan terjadi error
} catch (Exception e) {
    System.out.println("Terjadi kesalahan input data!");
}</code></pre>

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL** | **100** |

## Pembuat

Nama: Muhammad Annabil  
NPM: 2410010648  
Kelas: 4A Non-Reguler Banjarmasin

<?php
class Student {
    // Deklarasi atribut
    private $nama;
    private $nim;
    private $prodi;
    private $ip;

    // Konstruktor untuk inisialisasi objek dengan atribut
    public function __construct($nama, $nim, $prodi, $ip) {
        $this->nama = $nama;
        $this->nim = $nim;
        $this->prodi = $prodi;
        $this->ip = $ip;
    }

    // Metode getter untuk mengambil nilai atribut
    public function getNama() {
        return $this->nama;
    }

    public function getNim() {
        return $this->nim;
    }

    public function getProdi() {
        return $this->prodi;
    }

    public function getIp() {
        return $this->ip;
    }

    // Metode untuk mengubah nilai atribut
    public function updateMahasiswa($nama, $nim, $prodi, $ip) {
        $this->nama = $nama;
        $this->nim = $nim;
        $this->prodi = $prodi;
        $this->ip = $ip;
    }

    // Metode untuk menampilkan informasi mahasiswa
    public function displayInfo() {
        echo "Nama: " . $this->nama . "\n";
        echo "NIM: " . $this->nim . "\n";
        echo "Prodi: " . $this->prodi . "\n";
        echo "IP: " . $this->ip . "\n";
    }
}
?>

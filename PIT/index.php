 <?php
// Meng-include file Mahasiswa.php
include 'Student.php';

// Membuat objek Mahasiswa
$mahasiswa1 = new Student("Abi", "123456", "Teknik Informatika", 3.75);
$mahasiswa2 = new Student("Abi1", "654321", "Sistem Informasi", 3.90);
$mahasiswa3 = new Student("Abi2", "789012", "Teknologi Informasi", 4.0);

$dataMahasiswa = [$mahasiswa1, $mahasiswa2, $mahasiswa3];

if (isset($_POST['submit'])) {
    $Nama = $_POST['Nama'];
    $NIM = $_POST['NIM'];
    $Prodi = $_POST['Prodi'];
    $IP = $_POST['IP'];
    
    // Buat objek Mahasiswa baru dan tambahkan ke array
    $mahasiswaBaru = new Student($Nama, $NIM, $Prodi, $IP);
    $dataMahasiswa[] = $mahasiswaBaru;
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Data Mahasiswa</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div>
        <h2>Data Mahasiswa</h2>
        <table>
            <tr>
                <th>Nama</th>
                <th>NIM</th>
                <th>Program Studi</th>
                <th>IPK</th>
            </tr>
            <?php foreach ($dataMahasiswa as $mahasiswa): ?>
            <tr>
                <td><?php echo $mahasiswa->getNama(); ?></td>
                <td><?php echo $mahasiswa->getNim(); ?></td>
                <td><?php echo $mahasiswa->getProdi(); ?></td>
                <td><?php echo $mahasiswa->getIp(); ?></td>
            </tr>
            <?php endforeach; ?>
        </table>
        <div  id="form-mahasiswa">
        <!-- Tombol "Tambah Mahasiswa" -->
            <form method="POST" action="" id="nambahMahasiswa">
                <button type="submit" name="showForm" id="tombol">Tambah Mahasiswa</button>
            </form>

            <!-- Form tambah mahasiswa -->
            <?php if (isset($_POST['showForm'])): ?>
                <form action="" method="POST">
                    <label for="Nama">Nama:</label>
                    <input type="text" id="Nama" name="Nama" required><br><br>
                    
                    <label for="NIM">NIM:</label>
                    <input type="text" id="NIM" name="NIM" required><br><br>
                    
                    <label for="Prodi">Program Studi:</label>
                    <input type="text" id="Prodi" name="Prodi" required><br><br>
                    
                    <label for="IP">IPK:</label>
                    <input type="number" id="IP" name="IP" step="0.01" min="0" max="4" required><br><br>
                    
                    <button type="submit" name="submit">Tambah Mahasiswa</button>
                </form>
            <?php endif; ?>
        </div>
            
    </div>
</body>
</html>

import java.util.*;
public class KeretaApi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] dataKereta = {
            {"Ekonomi", "50000", "2%", "Tidak Ada", "Tidak Ada"}, 
            {"Bisnis", "100000", "5%", "Ada", "Tidak Ada"},
            {"Eksekutif", "200000", "7%", "Ada", "Tidak Ada"},
            {"Pariwisata", "300000", "10%", "Ada", "Ada"},
        };

        // int jmlTiket = 0;
        String[][] booked = new String[100][3];

        int menu;
        int counter = 0;
        
        do{
            System.out.println("===Pilihan Menu===");
            System.out.println("1. Lihat Daftar Kereta Api");
            System.out.println("2. Lihat Daftar Kereta Api yg ada AC");
            System.out.println("3. Lihat Daftar Kereta APi yg ada Colokan");
            System.out.println("4. Pesan Tiket Kereta Api");
            System.out.println("5. Lihat Pesanan Tiket");
            System.out.println("!! Masukkan angka selain 1-5 kalo mau keluar");
            System.out.print("Masukkan nilai : ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("===Daftar Kereta Api===");
                    System.out.printf("%-10s %10s %10s %10s %10s ", "-Kereta-", "-Harga-", "-Diskon-", "-AC-", "-Colokan-");
                    for(int i = 0;  i < dataKereta.length; i++){
                        System.out.println();
                        System.out.printf("%-10s Rp %-10s %7s %10s %10s ", dataKereta[i][0], dataKereta[i][1], dataKereta[i][2], dataKereta[i][3], dataKereta[i][4]);
                        
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("\n===Daftar Kereta Api dengan AC===");
                    for(int i = 0;  i < dataKereta.length; i++){
                        if (dataKereta[i][3].equals("Ada")) {
                            System.out.printf("Kereta: %-20s %n", dataKereta[i][0]);
                            System.out.printf("Harga: %-20s %n", dataKereta[i][1]);
                            System.out.printf("Diskon: %-20s %n", dataKereta[i][2]);
                            System.out.printf("AC: %-20s %n", dataKereta[i][3]);
                            System.out.printf("Colokan: %-20s %n", dataKereta[i][4]);
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n===Daftar Kereta Api dengan Colokan===");
                    
                    for(int i = 0; i < dataKereta.length;  i++){
                        if (dataKereta[i][4].equals("Ada")) {
                            System.out.printf("Kereta: %-20s %n", dataKereta[i][0]);
                            System.out.printf("Harga: %-20s %n", dataKereta[i][1]);
                            System.out.printf("Diskon: %-20s %n", dataKereta[i][2]);
                            System.out.printf("AC: %-20s %n", dataKereta[i][3]);
                            System.out.printf("Colokan: %-20s %n", dataKereta[i][4]);
                            System.out.println();
                        }
                        
                    }
                    break;
                case 4:
                    int x, y;
                    do{

                        System.out.println("\n===Pesan Tiket Kereta Api===");
                        System.out.println("Pilih  Kereta Api yang ingin dipesan");
                        System.out.println("1. Ekonomi");
                        System.out.println("2. Bisnis");
                        System.out.println("3. Eksekutif");
                        System.out.println("4. Pariwisata");
                        System.out.print("Masukkan pilihan : ");
                        x = sc.nextInt();
                        System.out.print("Masukkan jumlah tiket : ");
                        y = sc.nextInt();
                        if (x>4 || x<1) {
                            System.out.println(">>Yang bener kocak!!");
                        }
    
                    }while (x<1 || x>4);
                    
                    double harga = Double.parseDouble(dataKereta[x-1][1]);
                    double totalHarga;
                    System.out.println("\n--Tiket berhasil dipesan!!--");
                    double diskon = 0;
                    
                    switch (x) {
                        case 1:
                            diskon = 0.02;
                            break;
                        case 2:
                            diskon = 0.05;   
                            break;                   
                        case 3:
                            diskon = 0.07;                            
                            break;
                        case 4:
                            diskon = 0.10;
                            break;
                        
                        default:
                            // System.out.println("Yang bener kocak!!");
                            break;
                        
                    }
                    totalHarga = harga  - (harga * diskon * y);
                    System.out.println("Total Harga : Rp " + totalHarga);
                    System.out.println();
                    // jmlTiket =  y;
                    booked[counter][0] = dataKereta[x-1][0];
                    booked[counter][1] = "" + y;
                    booked[counter][2] = "Rp " + totalHarga;
                    counter++;
                    
                    
                    System.out.println();

                    
                    break;

                case 5:
                    System.out.println("\n===Tiket yang dipesan===");
                    System.out.printf("%10s %10s %15s %n", "-Jenis Kereta-", "-Jumlah-", "-Harga-");
                    for(int i = 0; i < counter; i++){
                        System.out.printf("%d. %-10s %10s %15s %n", i+1, booked[i][0], booked[i][1], booked[i][2]);

                    }
                    System.out.println();
                    break;

                    




            }

        }while(menu < 6 && menu > 0);

        sc.close();

    }
}

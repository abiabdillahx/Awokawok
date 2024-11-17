import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Selamat Datang di game pemdas TI-C");
        Scanner in = new Scanner(System.in);

        int hpHero = 1000;
        int hpEnemy = 800;
        int bsAtkHero = 100;
        int bsAtkEnemy = 120;
        boolean spSkill = true;
        boolean skillImmo = false;

        int duluan = ((int)(Math.random() * 10) + 1);
        System.out.println(duluan);

        do {
            if (duluan % 2 == 0) {
                // genap --> enemy menyerang
                System.out.println("\n>> Enemy menyerang!!!!!! <<");
                hpHero -= bsAtkEnemy;
                System.out.println("--Hp Hero: " + hpHero);
                System.out.println("--Hp Enemy: " + hpEnemy);
                bsAtkEnemy = 120;
                bsAtkHero = 100;
                duluan++;
            }else{
                // ganjil --> hero berjalan
                System.out.println("\nHero mau ngapain?");
                System.out.println("1. Menyerang! \n2. Heal \n3. Kabur \n4. Perisai \n5. Skill Special");
                int pilihan = in.nextInt();

                switch (pilihan) {
                    case 1:
                        hpEnemy = basicAttackH(hpHero, hpEnemy, bsAtkHero);
                        break;
                    case 2:
                        hpHero = healingGan(hpHero);
                        break;
                    case 3:
                        System.out.println(">> Kaburrrr aku takut! <<");
                        break;
                    case 4:
                        bsAtkEnemy = berlindung(bsAtkEnemy);
                        break;
                    case 5:
                        // boolean spSkill = true;
                        if (spSkill) {
                            System.out.println("Pilih salah satu special skill : \n1. Damage 2x \n2. Immortal (tambah 300hp saat hp 0)");
                            int special = in.nextInt();
                            switch (special) {
                                case 1:
                                    spSkill = false;
                                    bsAtkHero = damage2x(bsAtkHero);
                                    hpEnemy = basicAttackH(hpHero, hpEnemy, bsAtkHero);
                                    break;
                                case 2:
                                    spSkill = false;
                                    skillImmo = true;
                                    System.out.println(">> Immortality telah aktif!! <<");
                                    // hpHero = immortal(hpHero, skillImmo);
                                    break;
                                default:
                                    break;
                            }
                        } else{
                            System.out.println(">> Anda sudah menggunakan special skill !! <<");
                            continue;
                        }
                        break;
                    default:
                        break;
                }
                if (pilihan == 3) {
                    break;
                }

                duluan--;
            }
            
            if (hpEnemy < 200) {
                bsAtkEnemy *= 2;
            }

            if (hpHero <= 0 && skillImmo) {
                hpHero = 300;
                skillImmo = false;
                System.out.println("\n>> Immortal sudah diaktifkan! HP Hero bertambah menjadi 300 <<");
                System.out.println("--Hp Hero: " + hpHero);
                System.out.println("--Hp Enemy: " + hpEnemy);
            }
        } while (hpHero > 0 && hpEnemy > 0);

        if (hpHero > 0 && hpEnemy >0) {
            System.out.println("== kabur, game over ==");
        }
        else if (hpHero > 0) {
            System.out.println("== yey menang ==");
        }
        else if(hpEnemy > 0){
            System.out.println("== game over, kalah :( ==");
        }
        in.close();
    }

    public static int basicAttackH(int hpHero, int hpEnemy, int bsAtkHero){
        System.out.println("\n>> Hero menyerang!!! <<");
        hpEnemy -= bsAtkHero;
        System.out.println("--Hp Hero: " + hpHero);
        System.out.println("--Hp Enemy: " + hpEnemy);
        return hpEnemy;
    }

    public static int healingGan(int hpHero){
        System.out.println("\n>> Berobat <<");
        hpHero += 200;
        if (hpHero > 1000) {
            hpHero = 1000;
        }
        System.out.println("Hp hero: " + hpHero);
        return hpHero;
    }

    public static int berlindung(int bsAtkEnemy){
        System.out.println(">> Hero berlindung <<\n--Damage Enemy menjadi 50%");
        bsAtkEnemy = 60;
        return bsAtkEnemy;
    }

    public static int damage2x(int bsAtkHero){
        System.out.println("\n>> Damage Hero menjadi 2x lipat <<");
        bsAtkHero *= 2;
        return bsAtkHero;
    }

    public static int immortal(int hpHero, boolean skillImmo){
        
        return hpHero;
    }

}


/*
1.Tambahin fitur shield dengan efeknya 50 persen pengurangan damage enemy skill [DONE 1]

2. skill special untuk hero
damage nambah 2 kali lipat dipake maksimal sekali [DONE 3 ea]

3. skill special enemy 
saat enemy darah dibawah 200 enemy akan mode marah dan menambahkan damage 2 kali lipat sampai game berakhir [DONE 2]

4. Skill special immortal
Pemain hanya dapat salah satu antara immortal atau damage 2x, immortal memiliki efek penambahan darah 300,  Ketika darah mencapai 0. [DONE juga ygy :)]
 */

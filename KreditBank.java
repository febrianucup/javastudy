
import java.util.Scanner;

public class KreditBank {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int pendapatan_perBulan;
        String riwayat_kredit, jenis_pekerjaan="";
        double cicilan_lain=0;

        System.out.print("Masukkan perdapatan per-bulan: ");
        pendapatan_perBulan=input.nextInt();
        input.nextLine();

        if(pendapatan_perBulan>=5000000){
            System.out.print("Cek riwayat kredit nasabah (Baik/Buruk): ");
            riwayat_kredit=input.nextLine();
            if(riwayat_kredit.equalsIgnoreCase("baik")){
                System.out.print("Jenis pekerjaan (Kontrak/Freelance): ");
                jenis_pekerjaan=input.nextLine();
                if(jenis_pekerjaan.equalsIgnoreCase("freelance")){
                   System.out.print("Jumlah Cicilan Lain: ");
                    cicilan_lain=input.nextDouble();
                    if(cicilan_lain>(0.3*pendapatan_perBulan)){
                        System.out.println("Kredit Ditolak");
                    }else{
                        System.out.println("kredit disetujui");
                    }
                }else if(jenis_pekerjaan.equalsIgnoreCase("kontrak")){
                    System.out.println("Kredit Disetujui");
                }else{
                    System.out.println("Inputan Salah, Silahkan Coba Lagi");
                }
            }else if(riwayat_kredit.equalsIgnoreCase("buruk")){
                System.out.println("Kredit Ditolak");
            }else{
                System.out.println("Inputan Salah, Silahkan Coba Lagi");
            }
        }else{
            System.out.println("Pendapatan Tidak Memenuhi Syarat");
        }
    }
}

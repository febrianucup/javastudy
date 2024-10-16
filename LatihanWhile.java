
import java.util.Scanner;

public class LatihanWhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int i=1, lulus=0, tidakLulus=0, nilai;

        System.out.print("Input Jumlah Mahasiswa: ");
        int jumlah=input.nextInt();

        while(i<=jumlah){
            System.out.print("Input Nilai: ");
            nilai=input.nextInt();

            if(nilai>=65){
                lulus++;
            }else{
                tidakLulus++;
            }

            i++;
        }

        System.out.println("Jumlah Mahasiswa yang Lulus: " + lulus);
        System.out.println("Jumlah Mahasiswa yang Tidak Lulus: " + tidakLulus);
    }
}

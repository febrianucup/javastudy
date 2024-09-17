
import java.util.Scanner;
public class layang {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //input
        int d1, d2;

        System.out.print("masukkan d1: ");
        d1=input.nextInt();
        System.out.print("masukkan d2: ");
        d2=input.nextInt();

        //execute
        int d2_2=d2/2;
        int panjang=d1-(d2_2);

        double pBenang=Math.sqrt((panjang*panjang)+(d2_2*d2_2));
        System.out.println("panjang benang adalah " + pBenang);
        double luasKertas=(1/2f)*(d1*d2);
        System.out.println("luas adalah " + luasKertas);
    }
}
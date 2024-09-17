
import java.util.Scanner;

public class trapesium {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan sisi AB: ");
        int AB = input.nextInt();
        System.out.print("masukkan sisi CD: ");
        int CD = input.nextInt();
        System.out.print("masukkan tinggi: ");
        int t = input.nextInt();

        //mencari alas segitiga siku2
        int alas = AB - CD;
        double miring = Math.sqrt((alas*alas) + (t*t));
        System.out.println("sisi miring adalah " + miring);

        //keliling
        int keliling = (int) (AB + CD + (miring*2)) ;
        System.out.println("keliling trapesium adalah " + keliling);
    }
}

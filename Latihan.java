
import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int harga, total=0;

        do { 
            System.out.print("Input Harga: ");
            harga=input.nextInt();

            total+=harga;
            continue;
        } while (harga!=0);
        System.out.println(total);
    }
}

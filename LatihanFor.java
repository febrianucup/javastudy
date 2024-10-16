
import java.util.Scanner;

public class LatihanFor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int nilai, total=0;
        double rata2;

        for(int i=1; i<=5; i++){
            System.out.print("Input Nilai " + i + " : ");
            nilai=input.nextInt();

            total+=nilai;
        }

        rata2=total/5f;

        System.out.println(rata2);
    }
}

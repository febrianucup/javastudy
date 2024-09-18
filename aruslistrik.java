import  java.util.Scanner;
public class aruslistrik {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //input
        double r1, r2, r3;
        double rTotal;

        r1=input.nextDouble();
        r2=input.nextDouble();
        r3=input.nextDouble();

        //execute
        rTotal=1/(1/(r1+r2+r3));
        System.out.println(rTotal);
    }
}


import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n=5;
        int i=1;
        int j=1;
        //nested for
        // for(i=1;i<=n;i++){
        //     System.out.println("Out: " + i);
        //     for(j=1;j<=i;j++){
        //         System.out.println("In: " + j);
        //     }
        // }

        //nested while
        // while(i<=n){
        //     System.out.println("Out: " + i);
        //     while (j<=3) { 
        //         System.out.println("In: " + j);
        //         j++;
        //     }
        //     i++;
        // }

        //nested d0-while
        // do{
        //     System.out.println("Outer: " + i);
        //     //inner
        //     do { 
        //         System.out.println("Inner: " + j);
        //         j++;
        //     } while (j<=n);

        //     i++;
        // }while(i<=n);
    }
}

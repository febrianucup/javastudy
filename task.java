
import java.util.Scanner;


public class task {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        
        if (N%2!=0){
            System.out.println("Weird");
            }else if (N%2==0 && N<=5 || N>=2){
                System.out.println("Not Weird");
            }else if (N%2==0 && N>=6 || N<=20){
                System.out.println("Weird");
            }else if (N%2==0 && N>20){
                 System.out.println("Not Weird");
        }else{
            System.out.println("Weird");
        }
        
    }
}

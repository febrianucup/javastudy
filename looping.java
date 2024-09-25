
import java.util.Scanner;


public class looping {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);


        //looping while, do while
        // int i=0;
        // //while
        // while (i<6) {
        //     System.out.println(i);
        //     i++;
        // }
        //do while
        // int j=0;
        // do { 
        //     System.out.println(j);
        //     j++;
        // } while (j<10);

        //for loop
        for (int k=0; k<=5; k++){
            System.out.println(k);
        }

        // Nested loops
        // Outer loop
        for (int u=1; u<=4; u++){
            System.out.println("outer: " + u);

            //Inner loop
            for (int r=1; r<=u; r++){
                System.out.println("inner: " + r);
            }
        }

        // //example
        // for(int i=1; i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("+");
        //     }
        //     System.out.println();
        // }

        int A=input.nextInt();
        int noOfFactor=0;
        for(int k=1;k<=A;k++){
            int countOfFactor=0;
            for(int l=1;l<=k;l++){
                if(k%l==0){
                    countOfFactor++;
                }
            }
            if(countOfFactor==2){
                noOfFactor++;  
            }
        }
        System.out.println(noOfFactor);
    }
}
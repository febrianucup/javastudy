
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        // String[] nama={"febri", "ucup"};

        // String inputNama=input.nextLine();

        // if(inputNama.equalsIgnoreCase("febri")){
        //     System.out.println(nama[0]);
        // }else{
        //     System.out.println(nama[1]);
        // }

        // int[] angka={1,2,3};

        // for(int i=0;i<=angka.length;i++){
        //     System.out.println(angka[i]);
        // }

        //multiple array
        // int[][] num={{1,2,3},{4,5,6}};

        // for(int x=0;x<num.length;x++){
        //     for(int j=0;j<num[x].length;j++){
        //         System.out.print(num[x][j] + " ");
        //     }
        //     System.out.println();
        // }

        // for (int i=0;i<10;i--){
        //     if(i%2==0){
        //         break;
        //     }else if(i%3==0){
        //         continue;
        //     }else{
        //         System.out.println(i + " ");
        //     }
        // }


        // int number[]={1,2,3,4};
        // System.out.println(number[0]);
        // int[] a=new int[3];

        int[][] num={{1,2,3,4},{5,6,7},{8,9,10}};
        int sum=0;

        for (int i=0;i<num.length;i++) {
            for (int j=0;j<num[i].length;j++) {
                System.out.print(num[i][j]);
            }
            System.out.println();
        }

        for(int i=0;i<num.length;i++){
            System.out.println(Arrays.toString(num[i]));
        }

        for(int i=0;i<num.length;i++){
            for (int j = 0; j < num[i].length; j++) {
                sum+=num[i][j];
                System.out.println("Sum: " + sum);
            }
        }
    }
}

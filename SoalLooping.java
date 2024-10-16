
import java.util.Scanner;

public class SoalLooping {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Masukkan Nilai n: ");
        int n=input.nextInt();

        //1
        int i=n;
        while(i>0){
            System.out.print(i);
            i--;
        }

        //2
        // int i=1, jumlah=1;
        // while(i<=n){
        //     jumlah*=i;
            
        //     i++;
        // }
        // System.out.println(jumlah);

        // 3
        // int i;
        // for(i=1;i<=n;i++){
        //     System.out.print(i*i + " ");
        // }

        //4
        // for(int i=1;i<=n;i++){
        //     if(i%2==0){
        //         System.out.print(i*i + " ");
        //     }else{
        //         System.out.print("1, ");
        //     }
        // }

        //5
        // int awal=3, i=0, bil=1;
        // while(i<=n){
        //     System.out.print(awal + " ");
        //     awal+=bil;
        //     bil+=2;

        //     i++; 
        // }    

        //6
        // int bil=10;
        // for(int i=1;bil<=104;i++){
        //     System.out.print(bil + "\t");
        //     if(i%2==0){
        //         bil+=4;
        //     }else{
        //         bil*=2;
        //     }
        // }
        
        //7
        // int a=1, b=1, c=0;
        // System.out.print(a +" "+ b);
        // while(c<55){
        //     c=a+b;
        //     System.out.print(" " + c);
        //     a=b;
        //     b=c;
        // }

        //8
        // int bil1=3, bil2=5, jumlah=0;
        // for(int i=1;i<=bil1;i++){
        //     System.out.println(bil2);
        //     jumlah+=bil2;
        // }
        // System.out.println(jumlah);
    }
}


import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String[] nama={"febri", "ucup"};

        String inputNama=input.nextLine();

        if(inputNama.equalsIgnoreCase("febri")){
            System.out.println(nama[0]);
        }else{
            System.out.println(nama[1]);
        }

        int[] angka={1,2,3};

        for(int i=0;i<=angka.length;i++){
            System.out.println(angka[i]);
        }
    }
}

import java.util.Scanner;

class contorlstatemnt{

    public static void main(String[] args) {
        Scanner inTxt=new Scanner(System.in);
        int num=inTxt.nextInt();
        //if, else, else...if
        //if
        if(num==10){
            System.out.println("hello world");
        }

        // else
        if(num==20){
            System.out.println("hello kang");
        }else{
            System.out.println("hello borok");
        }

        //else..if
        if(num % 2==0){
            System.out.println("ini angka genap");
        }else if (num % 2 !=0) {
            System.out.println("ini angka ganjil");
        }else{
            System.out.println("bukan keduanya");
        }

        //short hand if...else
        String result=(num-5==0) ? "hasilnya 0" : "hasilnya bukan 0";
        System.out.println(result);

        //switch
       
    }    
}

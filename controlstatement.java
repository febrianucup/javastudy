import java.util.Scanner;

class controlstatement{

    public static void main(String[] args) {
        Scanner inTxt=new Scanner(System.in);
        
        // //if, else, else...if
        // //if
        // if(num==10){
        //     System.out.println("hello world");
        // }

        // // else
        // if(num==20){
        //     System.out.println("hello kang");
        // }else{
        //     System.out.println("hello borok");
        // }

        // //else..if
        // if(num % 2==0){
        //     System.out.println("ini angka genap");
        // }else if (num % 2 !=0) {
        //     System.out.println("ini angka ganjil");
        // }else{
        //     System.out.println("bukan keduanya");
        // }

        // //short hand if...else
        // String result=(num-5==0) ? "hasilnya 0" : "hasilnya bukan 0";
        // System.out.println(result);

        // String hasil=(num!=10) ? "hasillnya bukan 10":"hasilnya adalah 10";
        // System.out.println(hasil);

        //nested if
        int num=inTxt.nextInt();
        int a=5;
        int b=3;
        int c=4;
        if (a>b){
            if (b>c){
                System.out.println("benar");
            }else{
                System.out.println("salah");
            }   
        }else{
            System.out.println("salah pada cabang 1");
        }

        //switch
        int kelas=2;
        switch (kelas) {
            case 1 :
                System.out.println("kamu sd kelas 1");
                break;//break digunakan untuk menghentikan output ketika condition telah benar
            case 2 :
                System.out.println("kamu sd kelas 2");
                break;
            default:
                System.out.println("kmau kelas berapa?");
       }
       
       int x=4;
       switch(x){
            case 1 :
                System.out.println("nomor 1");
                break;
            case 2 :
                System.out.println("nomor 2");
                break;
            case 3 :
                System.out.println("nomor 3");
            default://dedault digunakan
                System.out.println("default");
       }

       String huruf="AbC";

       if(huruf.equalsIgnoreCase("abc")){
        System.out.println("huruf abc");
       }else{
        System.out.println("bukan");
       }
    }    
}

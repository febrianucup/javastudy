public class variabel {
    
    public static void main(String[] args){
        //macam macam variabel
        String str="hai";
        int num=10;
        char character='A';
        boolean myBool=true;
        float myFloat=20.2f;
        System.out.println(str + "\n" +  num + "\n" + character + "\n" + myBool + "\n"+ myFloat);

        //multiple variable
        int x, y, z;
        x=10;
        y=3;
        z=4;
        System.out.println(x + y + z);

        //string format
        double result=20.2222;
        System.out.println(String.format("%.4f", result));

        x++;
        x++;
        System.out.println(x++);
    } 
}

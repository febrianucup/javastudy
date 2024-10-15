public class method {

    //crate a methods
    static void myMethod(String fName, int age){
        System.out.println("hai " + fName);
        System.out.println("you are " + age);

        
    }

    //how to return value
    static int num(int var){

        if(var==1){
            return var;
        }

        return var * num(var-1);

    }

    //method overloading
    static int number(int a, int b){
        return a + b;
    }
    static double number(double a, double b){
        return a * b;
    }


    public static void main(String[] args) {
        //call a methods 
        myMethod("febri", 17);
        //you can call multiple method
        myMethod("ucup", 20);
        //call a value which return
        System.out.println(num(10));
        //call a overlaoding method
        System.out.println(number(2.2, 2.1));//method which have a double data type
        System.out.println(num(5));//method which hava a int data type
    }
}

public class looping {

    public static void main(String[] args){
        //looping while, do while
        int i=0;
        //while
        while (i<6) {
            System.out.println(i);
            i++;
        }
        //do while
        int j=0;
        do { 
            System.out.println(j);
            j++;
        } while (j<10);

        //for loop
        for (int k=0; k<=5; k+=1){
            System.out.println(k);
        }

        //Nested loops
        //Outer loop
        for (int u=1; u<=5; u++){
            System.out.println("outer: " + u);

            //Inner loop
            for (int r=1; r<=4; r++){
                System.out.println("inner: " + r);
            }
        }
    }
}

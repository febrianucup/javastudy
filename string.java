public class string {
    public static void main(String[] args) {
        

        String alpabhet="abcdrfghij";
        String number="12345678";

        //indexof-index (the position) of the first occurrence of a specified text in a string (including whitespace)
        System.out.println(alpabhet.indexOf("c"));

        //typeuppercase untuk mengubah string menjadi huruf besar
        System.out.println(alpabhet.toUpperCase());
        //typelowercase untuk mengubah string menjadi huruf kecil
        System.out.println(alpabhet.toLowerCase());
        
        //length untuk mengukur panjang sebuah string
        System.out.println(alpabhet.length());

        //concat(), can be used to combine 2 or other 
        System.out.println(alpabhet + "" + number); 
        //or
        System.out.println(alpabhet.concat(number));
    }
}


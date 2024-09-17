import java.util.Scanner;

class mengisitabungair{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //input
        double jari_jari, tinggi, kecepatan,waktu;
        double volume;


        System.out.print("masukkan jari jari: ");
        jari_jari=input.nextDouble();
        System.out.print("masukkan tinggi: ");
        tinggi=input.nextDouble();
        System.out.println("masukkan kecepatan: ");
        kecepatan=input.nextDouble();

        //execute
        volume=Math.PI* Math.pow(jari_jari, 2)* tinggi;
        waktu=volume/kecepatan;

        System.out.println("waktu yang dibutuhkan adalah: " + String.format("%.2f", waktu) + " detik");
    }
}
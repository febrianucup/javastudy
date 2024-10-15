
import java.util.Scanner;

public class GameLevelUp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int exp, mana, health, level;

        System.out.print("Masukkan Level: ");
        level=input.nextInt();
        System.out.print("Masukkan Exp: ");
        exp=input.nextInt();
        System.out.print("Masukkan Health Potion: ");
        health=input.nextInt();
        System.out.print("Masukkan Mana Potion: ");
        mana=input.nextInt();


        if(level==1){
            if(exp>1000){
                System.out.println("Dapat Naik level");
            }else{
                System.out.println("Tidak Dapat Naik Level");
            }
        }else if(level==2){
            if(exp>3000 && health>=1){
                System.out.println("Dapat Naik level");
            }else{
                System.out.println("Tidak Dapat Naik Level");
            }
        }else if(level==3){
            if(exp>5000 && health>=1 && mana>=1){
                System.out.println("Dapat Naik level");
            }else{
                System.out.println("Tidak Dapat Naik Level");
            }
        }else{
            System.out.println("Tidak Dapat Naik Level");
        }
    }
}

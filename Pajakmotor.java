
import java.util.Scanner;

public class Pajakmotor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Masukkan tipe kendaraan: ");
        String tipeKendaraan=input.nextLine();
        System.out.print("Masukkan kapasitas mesin (cc): ");
        int kapasitasMesin=input.nextInt();
        double pajak=0;

        if(tipeKendaraan.equalsIgnoreCase("motor")){
            if(kapasitasMesin<150){
                pajak=0.01;
            }else if(kapasitasMesin>=150 && kapasitasMesin<=250){
                pajak=0.02;
            }else if(kapasitasMesin>250){
                pajak=0.05;
            }
        }else if(tipeKendaraan.equalsIgnoreCase("mobil")){
            if(kapasitasMesin<1000){
                pajak=0.03;
            }else if(kapasitasMesin>=1000 && kapasitasMesin<=2000){
                pajak=0.05;
            }else{
                pajak=0.07;
            }
        }

        System.out.println("total pajak adalah: " + pajak);
    }
}

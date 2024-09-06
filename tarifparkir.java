import java.util.Scanner;

public class tarifparkir {
    public static void main(String[] args) {
        String platnomer;
        int jumlahjam;
        double harga;
        Scanner s = new Scanner (System.in);
        System.out.print("masukkan nomor plat:");
        platnomer= s.nextLine();
        System.out.print("jumlah jam:");
        jumlahjam =s.nextInt();

        if (jumlahjam >0 && jumlahjam <=1){
             harga= 3000;
        }else if ( jumlahjam >1 && jumlahjam <= 4){
            harga = 7000;
        }else if ( jumlahjam > 4){
            harga=10000;
        }else {
            harga = 0.;
            System.out.println("sistem salah");
        }
       System.out.println(platnomer);
       System.out.println("tarif parkir anda:"+ harga);

        
        






    }
}

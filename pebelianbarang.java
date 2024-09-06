import java.util.Scanner;

public class pebelianbarang {
    public static void main(String[] args) {
        double total,diskon,potonganharga;

        Scanner input = new Scanner (System.in);
        System.out.println("masukkan total:");
        total = input.nextDouble();

        if (total> 150000) {
        potonganharga = 0;
        diskon = 0.1 *total;
        total -=diskon;
        } else {
            potonganharga = 5000;
            diskon = 0;
            total -=potonganharga;

        }
        System.out.println("diskon:"+ diskon);
        System.out.println("potongan harga:"+potonganharga);
        System.out.println("total hat=rga:"+ total);

        

    }
}

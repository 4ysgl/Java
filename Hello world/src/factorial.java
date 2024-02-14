import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        // FAKTORİYEL HESAPLAMA
        Scanner scan= new Scanner(System.in);
        System.out.println("faktoriyelini hesaplamak istedığiniz sayıyı girin:" );
        int sayi=scan.nextInt();

        int fact=1;
        for (int i = 1; i<=sayi; i++){

            fact= fact *i;
        }
         System.out.println("faktorıyel degerı: "+fact);




    }
}

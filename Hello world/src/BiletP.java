import java.util.Scanner;

public class BiletP {
    public static <and> void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        double biletF=50;
        for  (int i = 0; i<3; i++)
        {
            System.out.println("yaş giriniz" );
            int yas=scan.nextInt();

            if (yas<=10)
            {
                System.out.println("bilet ücretsiz ");
            }
            else if (yas>=11 && yas<=40) {
                biletF = biletF *0.75;
                System.out.println("bilet ücreti indirimli %25:" + biletF);

            }
            else if (yas>40 && yas<75)
            {
                biletF=biletF/2;

                System.out.println("bilet % 50 ındırımlı: "+biletF);
            }
            else {
                System.out.println("yesil kartlı");
            }
            
        }
        

    }
}

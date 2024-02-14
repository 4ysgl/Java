import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in); // ınput
        int sayi ;
        int toplam=0 ;
        do {
            System.out.println("sayıları gırınız" );
             sayi =scan.nextInt();
             toplam =toplam + sayi;

        }while (sayi>0);  // kosulu sagladıgı surede kod calısmaya devam eder
        System.out.println("toplam: "+toplam);
    }
}

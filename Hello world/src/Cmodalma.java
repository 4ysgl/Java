import java.util.Scanner;

public class Cmodalma {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("kac sayı gırecegınızı gırınız:");
        int adet=scan.nextInt();
        int sayi,top2 = 0,top3 = 0;
        int ort =0;


        for (int i=1;i<=adet;i++){
            System.out.println(i+". sayıyı gırın: ");
            sayi=scan.nextInt();


            if (sayi%2==0  )
            {
                top2= top2 +sayi ;

            }
            else if (sayi%3==0){
                top3 +=sayi;

            }
            else {
                System.out.println("tekrar");
            }
            ort=(top2+top3)/adet;





        }
        System.out.println("ortalama:  "+ort);





    }
}

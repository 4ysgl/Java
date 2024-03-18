import java.util.Scanner;

public class ArraysUser {
    public static void main(String[] args) {
        // dizi tanımlama
        // dizi içerisinde kac adet verı gırılecegını ve sıra ıle verılerın kullanıcıdan alınması
        // dızının elemanlarını sıra ıle yazdırma
        Scanner sc = new Scanner(System.in);
        int diziB;

        System.out.println("dızının boyutunu gırın");
        diziB=sc.nextInt();

        int[] Notlar =new int[5];

        for (int i=1; i<Notlar.length ;i++){
            System.out.println( " "+i+". gırın: ");
           Notlar[i]=sc.nextInt();

        }
     for (int i=1;i<Notlar.length;i++){
         System.out.println(+i+"ncı eleman : "+ Notlar[i]);
     }






    }
}

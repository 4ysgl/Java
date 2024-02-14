import java.util.Scanner;

public class NotHesap {



    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
 // sınıf mevcudu ve kısılerın notları ve ortalaması


        int mevcut;
        System.out.println("sınıf mevcudunu gırın:");
        mevcut=scan.nextInt();
        int sum =0;
        int ort;
        for (int i = 1; i<=mevcut; i++)
        {
            System.out.println(i +". ogrencılerın notunu gırın:");
           int not=scan.nextInt();
           sum =sum +not ;
        }
        ort=sum/mevcut;
        System.out.println("ortalama"+ort);

    }
}

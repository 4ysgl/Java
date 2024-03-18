import java.util.Scanner;

public class Arrays4 {

    public static void main(String[] args) {
        int [ ] ihtiyac= new int[]{1,4,5,9,15,80};
        Scanner sc=new Scanner(System.in);
        int totaLN=sc.nextInt(); // ELDE KAC ADET DEFTER OLDUGUNU GIRILIYOR

        int Counter=0; //GIDERILEN IHTIYAC SAYISINI OGRENMEK ICIN SAYAC TANIMLIYORUZ

        for (int i=0; i <=ihtiyac.length;i++)  //DIZININ ELEMANLARINI TEK TEK CAGIRIP DEFTER ADEDINDEN CIKARIYORUZ
        {
            if(ihtiyac[i]<=totaLN)  // EGER SIRADAKI DIZI ELEMANI KALAN DEFTER ADETINDEN KUCUKSE
            {
                totaLN=totaLN-ihtiyac[i]; // DEFTER ADEDINE CIKARIP ATIYORUZ
                Counter++; // SAYACI DA SIRA ILE ARTTIRIYORUZ
            }
            else break;

        }
        if (Counter==ihtiyac.length)
            // DONGUDEN CIKTIKTAN SONRA EGER IHTIYAC DIZISISNIN ICERISINDEKI ELEMAN SAYISI
            // COUNTER A ESITSE TUM IHTIYACLAR KARSILANMIS DEMEKTIR
        {
            System.out.println(Counter+ "OGRENCILERIN TUM IHTIYACI KARSILANDI");
        }
        else System.out.println(   Counter +" OGRENCININ IHTIYACI KARSILANDI");
    }
}

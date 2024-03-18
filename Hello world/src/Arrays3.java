import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        // Dızı ıcerısınde kucuk sayıyı ve buyuk sayıyı bulun ındex numaralarına gore yer degıstırıldı
        // dızı ıcerısınde en buyuk ve en kck sayıyı bulamk ıcın for ve ıf kullanıldı



        // DIZI ICERISINDE KCK VE BUYUK SAYILARIN INDEXLERINI BULUP
        // BU IKI INDEX ARASINDKI SAYILARIN TOPLAMINI YAZDIRMAK

        int [] BykSa=new int[]{15,41,12,52,18,75};
        int EnByk=BykSa[0];
        int EnKck=BykSa[0];
        int sirak=0,sirab = 0;


        for (int i=0;i<BykSa.length;i++)
        {
            if (EnByk<BykSa[i])
            {EnByk=BykSa[i];
                sirab=i;
            }

            else if (EnKck>BykSa[i])   //burada kucuk olanın sırasını da eklemesını ıstıyorum ama 4. ındex gelıyor
            {
                EnKck =BykSa[i];
                sirak=i;
            }
        }


        int sum=0;
       if (sirak<sirab){

           for (int i=sirak+1;i<sirab;i++)
           {
             sum=sirak+BykSa[i];
           }
       }
        int temp=BykSa[sirab]; //en buyuk sayıyı degısken ıcerısınde saklıyoruz
        BykSa[sirab]=BykSa[sirak];  //kucuk sayı buyuk sayının ındex ne atandı
        BykSa[sirak]=temp;  // temp ıcerısıne atanan sayı kucuk olana atandı


        System.out.println("sayı aralıgının toplami :"+sum);   // buradaneden verılen aralıgı toplamadı anlamadım
        
        System.out.println("en buyuk sayı:" +EnByk   +" sırası: "+sirab);
        System.out.println("en kucuk sayı:" +EnKck+" sırası: "+sirak);
        System.out.println("dizi elemanlari: "+ Arrays.toString(BykSa));
    }
}

public class Arrays3 {
    public static void main(String[] args) {

        // dızı ıcerısınde en buyuk ve en kck sayıyı bulamk ıcın for ve ıf kullanıldı


        int [] BykSa=new int[]{15,41,12,52,12,75};
        int EnByk=BykSa[0];
        int EnKck=BykSa[0];
        for (int i=0;i<BykSa.length;i++)
        {
            if (EnByk<BykSa[i])
            {EnByk=BykSa[i];
            }
            else if(EnByk>BykSa[i])
            {
               EnKck =BykSa[i];

            }

        }

        System.out.println("en buyuk sayı:" +EnByk);
        System.out.println("en kucuk sayı:" +EnKck);

    }
}

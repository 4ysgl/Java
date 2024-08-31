public class forD {
    public static void main(String[] args) {

        int n=10;
        int toplam=0;
        int toplamC=0;
        int toplamT=0;


  for (int i=1;i<=n;i++)

      if ( i %2==0)
          toplamC=toplamC +i;
       else
           toplamT=toplamT +i;
        System.out.println("ciftler toplamı" +toplamC);
        System.out.println("tekler toplamı " + toplamT);
    }




}





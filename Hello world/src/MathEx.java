public class MathEx
{
    public static void main(String[] args) {
  // math.class

        double pi=Math.PI;
        System.out.println( "pi sayısı:"+pi);

        double randomS=Math.random();
        System.out.println("random s:"+randomS);

        int randomSInt= (int) (randomS*100);
        System.out.println("random sayının ınt cevırılmesı ="+ "  "+randomSInt);


    // abs()  mutlak degerı

        int y1=45;
        int y2 =56;
        int yasF=y1-y2;
        yasF=Math.abs(yasF);
        System.out.println("yas farkı: "+yasF);


    // max ()  // ıkı sayının karsılastırılması  double float int olarak degıstırılebılır


        int a=55;
        int b=77;
        int maxs=Math.max(a,b);
        System.out.println("max sayımız: "+maxs );



    }
}

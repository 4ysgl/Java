public class basicCom {
    public static void main(String[] args) {
    String str="hello world";
    int number;
    String ss,s1,s2;



    number=str.length();    //length() değisken içerisinde kac karakter oldugunu getirir.
    ss=str.substring(3,7);  //substring(x,y)   degiskende aralık vererek verı getırmesını ısteyebılırız
    str=str.replace ("l","9") ;   // karakter değişim
    int find=str.indexOf("");



        System.out.println("str:"+str);
        System.out.println("length:" +number);
        System.out.println("aralık verme: "+ss);
        System.out.println("index bulma:"+find);

    }
}

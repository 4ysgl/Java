import com.sun.jdi.connect.Connector;

public class MathEx2 {
    public static void main(String[] args) {

    //mod alma %  - a nın  b ye bolumunden kalanı bulma

        int a=45;
        int b=8;
        int bolm=a%b;
        System.out.println("kalan: "+ bolm);


    // integer veriyi strınge cevırme

        String str= String.valueOf(a);
        System.out.println("str : " +str);

        str=str.substring(1,2)+str.substring(0,1);
        System.out.println("str: "+str);

       




    }
}

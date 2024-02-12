public class StringEx {
    public static void main(String[] args) {

        // toUpperCase() metodu secılen degıskendekı karakterleron harflerını buyumesı ıcın kullanılır
        // İndexOf() metodu girilen karakterın degısken ıcınde kacıncı ındexte oldugunu getırır


      String str="hello myself";
      int s;
      s=str.indexOf(" ");

        System.out.println("karakterın ındex numarası:"+s);
        String s1,s2;

        s1=str.substring(0,s);
        s2=str.substring(s+1);
        str=s1+" "+s2;
        str=str.toUpperCase();
        System.out.println("byk harfler "+str);


    }
}

public class CurveSystem {

    public static void main(String[] args) {

        // en yuksek notu bul
        // en yuksek notun 100 e kac paunla tamamlandıhını bul
        // dızının tum elemanlarına bu not ekle

        int[] Notlar=new int[]{20,15,82,63,47,9};
        int enYuksekN=0;
        for (int i = 0; i <Notlar.length; i++)
        {
            if (Notlar[i]>enYuksekN){

                enYuksekN=Notlar[i];
            }
        }
        int ekNot=100-enYuksekN;
        for (int i=0;i< Notlar.length;i++){
            Notlar[i]=Notlar[i]+ekNot;

        }
        for (int i=0;i< Notlar.length;i++) {
            System.out.println(Notlar[i]);

        }
    }
}

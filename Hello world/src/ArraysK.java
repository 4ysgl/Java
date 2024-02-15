public class ArraysK {


    public static void main(String[] args) {
int [] numbers = new int[]{20,50,50,15,50,50};
int sum=0;
int sumB=0;

int BasariS=0;
int BasarisizS=0;

double bOrt,BsizOrt;

for (int i = 0; i <numbers.length; i++)
{
    if (numbers[i]>=50)  // dizi icerısınde kosul ıle toplama yapıldı ve basarı sayı
    {
        sum=sum+numbers[i];
        BasariS++;
    }
    else if (numbers[i]<50){
        sumB=sumB+numbers[i];
        BasarisizS++;

    }

}     bOrt= (double) sum /BasariS;
        BsizOrt= (double) sumB /BasarisizS;
        System.out.println("basarılı olanların ortalaması: "+bOrt);
        System.out.println("basarılı olanların ortalaması: "+BsizOrt);
        System.out.println("BASARILI OLANLARIN PUAN TOPLAMI:"+sum);
        System.out.println("BASARISIZ OLANLARIN PUAN TOPLAMI:"+sumB);
    }
}

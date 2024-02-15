public class ArraysT
{
    public static void main(String[] args) {

        int [] list=new int[]{1,5,6,8,6,4,5};
        int sum=0;

        for (int i=0;i<list.length;i++)
        {
          sum=sum+ list[i];

        }
        double ort=sum/list.length;

        System.out.println("dizimin ortalaması: "+ort);
        System.out.println("toplam:"+ sum);
    }
}

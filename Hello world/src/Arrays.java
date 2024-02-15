public class Arrays {
    public static void main(String[] args) {



        int [] Arrays= new int[]{1,5,3,4,5};

        int sum= Arrays[2];
        Arrays[2]=Arrays[1];
        Arrays[1]=sum;

        System.out.println( "eleman:"+Arrays[1]);


    }
}

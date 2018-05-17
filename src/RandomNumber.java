import java.util.Random;

public class RandomNumber {

    public static void main(String args[]){
        RandomNumber r = new RandomNumber();
        int[] a = {1,2,3,4,5};
        int[] f = { 0, 5, 15, 20 ,30};
        int num = r.random(a, f);
        System.out.println("selectd num is " + num);

    }

    public int random(int[] array, int[] f){
        int totalFreq = 0;
        int selected = 0;

        Random rand = new Random();

        for ( int i=0 ; i < array.length ; i++){
            int ran = rand.nextInt();
            System.out.println("ran ==" +ran);
            int r = ran * (totalFreq +  1) ; //f[i]);
            System.out.println("r==" +r);

            if( r>= totalFreq){
                selected = array[i];
                totalFreq +=  1;//f[i];
            }

        }
        System.out.println("selected num is  "+ selected);
        return  selected;


    }
}

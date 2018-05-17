import java.util.Arrays;


public class Test {
    public static void main(String args[]){
        Test t = new Test();
        String[] a = { "aaa"};
        String[] b = { "bbb"};
        int[] result = t.getMinimumDifference(a, b);

        for( int i =0; i< result.length ; i++)
        System.out.println(result[i]);


    }

    public int[] getMinimumDifference(String[] a, String[] b) {
        /*
         * Write your code here.
         */

        int a_len = a.length;
        int b_len = b.length;
        int[] result = new int[a_len];

        for(int i =0; i<a_len; i++){
            String first = a[i];
            String second = b[i];

            if(first.length() != second.length()){
                result[i] = -1;
            }
            else{
                char[] f = first.toCharArray();
                char[] s = second.toCharArray();

                Arrays.sort(f);
                Arrays.sort(s);
                Integer[] letter = new Integer[26];
                Arrays.fill(letter,new Integer(0));


                int count =0;
                for( int j =0 ; j < f.length ; j++){
                    char c = f[j];
                    letter[c -'a'] =  letter[c -'a']  +1;
                }

                for( int k=0 ; k< s.length; k++){
                    char c = s[k];
                    letter[c - 'a'] =  letter[c - 'a'] -1;
                }

                for( int j =0 ; j < f.length ; j++){
                    char c = f[j];
                    if(letter[c -'a'] >=0  ){
                        count = count +letter[c -'a'];
                        letter[c-'a'] = 0;
                    }
                }
                result[i] = count;

            }
        }
        return result;
    }
}

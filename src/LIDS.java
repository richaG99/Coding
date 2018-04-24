import java.util.LinkedList;

public class LIDS {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestSubsequenceLength(final int[] A) {
        if ( A == null || A.length == 0)
            return 0;

        int len = A.length;
        int[] lis = new int[len];
        int[] lds = new int[len];
        for( int i =0; i < len; i++){
            lis[i] = 1;
            lds[i] = 1;
        }

        for ( int i=1; i< len ; i++){
            for ( int j =i-1 ; j >= 0 ; j--){
                if( A[i] > A[j]){
                    lis[i] = Math.max( lis[i], lis[j] + 1);
                }
            }
        }

        for( int i = len-2 ; i >= 0 ; i --){
            for ( int j = i+1 ; j < len ; j++){
                if(A[i] > A[j]){
                    lds[i] = Math.max(lds[i] , lds[j] +1);
                }
            }
        }
        for ( int i =0 ; i < len; i ++){
            System.out.print("LIS ==>");
            System.out.print( lis[i]  );
            System.out.println("=====");
        }
        for ( int i =0 ; i < len; i ++){
            System.out.println("LDS ==>");
            System.out.print( lds[i]  );

        }


        int max_len =1;
        for( int i =0 ; i < len ; i++){
            max_len = Math.max(max_len, (lds[i] + lis[i] -1));
        }
        return max_len;

    }

    public static void main(String args[]){
        int[] A= {1, 11, 2 ,10 ,4, 5, 2, 1} ;
        int[] A2 ={12 ,18, 7, 34, 30, 28, 90, 88};
//        LIDS l = new LIDS();
//        int r = l.longestSubsequenceLength(A2);
//        System.out.println("*****" + r);

    }
}

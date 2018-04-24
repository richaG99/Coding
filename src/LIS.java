import java.util.*;

public class LIS {
    public static void main(String arsgs[]){
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        LIS l= new LIS();
        int res = l.lengthOfLIS(arr);
        System.out.println(res);

    }
//    public ArrayList<Integer> lengthOfLISprint(int[] nums){
//
//    }


    public int lengthOfLIS(int[] nums) {
            int len  = nums.length;
            if( nums == null || nums.length == 0)
                return 0;
            //ArrayList<ArrayList<Integer>> LIS = new ArrayList<ArrayList<Integer>>();
        int[] lis = new int[len] ;

            for( int i =0 ; i<len ; i++){
                lis[i] =1;
            }
            int max_lis = 1;
            for( int i =1 ; i  < len ; i++){
                for( int j = 0 ; j< i ; j++){
                    if( nums[i] > nums[j]){
                        lis[i] = Math.max(lis[i], (lis[j] +1));
                    }
                }
                if(max_lis < lis[i]){
                    max_lis = lis[i];
                }
            }
            return max_lis ;

        }

}


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String args[]){
        int[] a =  {2, 1, -9, -7, -8, 2, -8, 2, 3, -8 } ;
        int target = -1 ;
        Solution s  = new Solution();
        s.trailingZeroes(78);
//        s.threeSumClosest(a, target);
    }

    public int threeSumClosest(int[] A, int B) {
        int len= A.length;
        if(len == 0 || len<3){
            return -1;
        }
        int closest_sum = A[0] + A[1] + A[2] ;
        if(len ==3){
            return closest_sum ;
        }
        Arrays.sort(A);

        int sum;
        int min_diff =  B - closest_sum;
        for ( int i =0 ; i < len -2 ; i++){
            int target = B - A[i];
            int left = i+1;
            int right = len-1;

            while( left < right){
                sum = A[left] + A[right]  + A[i];

                if( sum == B){
                    return sum ;
                }
                int curr_diff = B -sum ;
                if( Math.abs(curr_diff) < Math.abs(min_diff)){
                    min_diff = curr_diff;
                    closest_sum = sum;
                }

                if( sum < target){
                    left++;
                }else if ( sum > target){
                    right-- ;
                }


            }
        }
        return closest_sum;

    }

        public int trailingZeroes(int A) {

            int count = 0;

            long num = 5;

            while (num <= 1L * A) {
                count += ((int) (A / num));
                num *= 5;
            }
            System.out.println(count);
            return count;

        }



}





import java.util.ArrayList;
import java.util.Arrays;

public class Solution_perm {
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

    public static void main(String args[]){
        Solution_perm p = new Solution_perm();
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        p.permute(A);
    }

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {

        if( A == null || A.size() == 0)
            return result ;
        else{

            System.out.println("before call" + result.toString());
            permuteHelper( A, new ArrayList<Integer>() );
            System.out.println("after call" + result.toString());
            return result;
           // int[] a = new int[6] ;
           // Arrays.sort(a);
        }
    }

    public void permuteHelper( ArrayList<Integer> A, ArrayList<Integer> chosen){
      System.out.println("permuteHelper (" + A.toString()+ chosen.toString() + ")" );
        //base case
        if (A.size()==0){
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = (ArrayList<Integer>) chosen.clone();
            System.out.println(chosen);
            result.add(res);
            System.out.println(result);
        }
        else{
            //chose
            for( int i =0; i< A.size(); i++){
                int num = A.get(i);
                chosen.add(num);
                A.remove(i);
                // explore
                permuteHelper(A, chosen);

                //unchose
                A.add(i, num);
                chosen.remove(chosen.size()-1);
                System.out.println(result + "######");
            }
        }


    }
}

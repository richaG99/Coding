import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Subset {

    public static void main(String args[]){
        Subset s = new Subset();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(15);
        arr.add(20);
        arr.add(12);
        arr.add(19);
        arr.add(4);

        s.subsets(arr);
    }



    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new  ArrayList<ArrayList<Integer>>();

        if( A == null || A.size() ==0){
             result.add(new ArrayList<Integer>());
             return result;
        }

        subsetsHelper(A, new ArrayList<Integer>(), result);
        System.out.println(result);

        return  result;
    }


    public void subsetsHelper(ArrayList<Integer> A, ArrayList<Integer> chosen, ArrayList<ArrayList<Integer>> result){
        // base case
        if(A.size() == 0){
            ArrayList<Integer> res = ( ArrayList<Integer> )chosen.clone();
            System.out.println(res);
            result.add(res);
        }
        else{
            //chose
            int to_chose = A.get(0);
            A.remove(0);

            //explore - to chose
            chosen.add(to_chose);
            subsetsHelper(A, chosen, result);

            // explore - to unchose
            chosen.remove(chosen.size()-1);
            subsetsHelper(A, chosen, result);

            // unchose
            A.add(0, to_chose);
        }

    }


}

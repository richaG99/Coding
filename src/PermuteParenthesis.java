import java.util.ArrayList;

public class PermuteParenthesis {

    public static void main(String args[]){
        PermuteParenthesis pn= new PermuteParenthesis();
        pn.generateParenthesis( 4);
    }

    public ArrayList<String> generateParenthesis(int n){
        ArrayList<String> res = new ArrayList<String>();
        generateHelper( "", n, n, res);
        return res;
    }

    public void generateHelper( String prefix, int open, int close, ArrayList<String> res ){
        System.out.println("generateHelper " + ", "+ prefix + "  ,"+ open + " , "+ close  );
        if(open == 0 && close == 0){
            String valid_comb = prefix;
            System.out.println(valid_comb);
            res.add(valid_comb);
        }
        else{
            //chose

            //explore
            if(open > 0)
                generateHelper( prefix + "(", open -1, close, res);

            if(open < close){
                generateHelper( prefix + ")", open, close - 1, res );
            }


            //unchose


        }

    }
}

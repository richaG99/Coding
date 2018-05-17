import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static void main(String args[]){
       String[] s = { "it go will away it",
        "go do art" ,
        "what to will east" };

       Solution2 cl = new Solution2();
       cl.arrayToMap(s);

    }

    static void textQueries(String[] sentences, String[] queries) {
        /*
         * Write your code here.
         *
         *
         */
        ArrayList<HashMap<String,Integer>> mapList = arrayToMap(sentences);
        for ( String query: queries){
            String[] querywords = query.split(" ");
//            for( )
        }




    }

    static int isMatch( String query,  HashMap<String,Integer> mapObj ){
        String[] querywords = query.split(" ");
        for (String word : querywords){

        }
        return 0;
    }



    static ArrayList<HashMap<String,Integer>>  arrayToMap(String[] arr){
        ArrayList<HashMap<String,Integer>> mapList = new ArrayList<HashMap<String, Integer>>();
        for(int i=0 ; i< arr.length; i++){
            String curr= arr[i];
            String[] tokens = curr.split(" ");
            HashMap<String, Integer> token_map  = new HashMap<String, Integer>();
            for(String token: tokens){
                if(token_map.containsKey(token)){
                    token_map.put(token, token_map.get(token) +1) ;
                } else{
                    token_map.put(token, 1);
                }
            }
            mapList.add(token_map);
        }
        return mapList;
    }
    }

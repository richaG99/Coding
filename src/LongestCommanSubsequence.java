public class LongestCommanSubsequence {
    public int LCS_recursive( String a, String b){
         int max_lcs ;
        if( a == null || b == null || a.length() == 0 || b.length() == 0) {
            return 0;
        }
        int a_len = a.length();
        int b_len = b.length();

        if(a.charAt(a_len-1) == b.charAt(b_len-1)){
           max_lcs = 1+  LCS_recursive(a.substring(0, a_len-1), b.substring(0, b_len -1));
        } else {

           max_lcs = Math.max( LCS_recursive(a.substring(0,a_len-1) , b.substring(0, b_len)), LCS_recursive(a.substring(0,a_len) , b.substring(0, b_len-1 ))) ;
        }
        return max_lcs;
    }

//    public int LCS_dynamic_program(String A, String B){
//
//    }


    public static void main(String arsgs[]){
        LongestCommanSubsequence lcs = new LongestCommanSubsequence();
        //"ABCD", String B: "AEBD"
        int res = lcs.LCS_recursive("ABCDA", " ACBDEA" );
        System.out.print(res);

    }


}

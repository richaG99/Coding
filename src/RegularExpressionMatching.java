public class RegularExpressionMatching {

    public static void main(String args[]){
        String indent = "  ";
        RegularExpressionMatching re = new RegularExpressionMatching();
        boolean isMatch = re.isMatch("aab", "c*a*b", indent);
        System.out.println("answer " + isMatch );
    }

    public boolean isMatch(String s, String p, String indent) {
        indent = indent.concat("   ");
        System.out.println(indent + "isMatch( "  + s + "," + p + ")");
        // base case
        if (p.length() == 0) {
            return s.length() == 0;
        }

        // special case
        if (p.length() == 1) {

            // if the length of s is 0, return false
            if (s.length() < 1) {
                System.out.println(indent+ "len 1 case");
                return false;
            }

            //if the first does not match, return false
            else if ((p.charAt(0) != s.charAt(0)) && (p.charAt(0) != '.')) {
                System.out.println(indent+ " len 1 special case");
                return false;
            }

            // otherwise, compare the rest of the string of s and p.
            else {
                return isMatch(s.substring(1), p.substring(1), "  "+ indent);
            }
        }

        // case 1: when the second char of p is not '*'
        if (p.charAt(1) != '*') {
            if (s.length() < 1) {
                return false;
            }
            if ((p.charAt(0) != s.charAt(0)) && (p.charAt(0) != '.')) {
                return false;
            } else {
                return isMatch(s.substring(1), p.substring(1), "  "+ indent);
            }
        }

        // case 2: when the second char of p is '*', complex case.
        else {
            //case 2.1: a char & '*' can stand for 0 element
            if (isMatch(s, p.substring(2), " "+indent)) {
                return true;
            }

            //case 2.2: a char & '*' can stand for 1 or more preceding element,
            //so try every sub string
            int i = 0;
            while (i<s.length() && (s.charAt(i)==p.charAt(0) || p.charAt(0)=='.')){
                if (isMatch(s.substring(i + 1), p.substring(2), "  "+ indent)) {
                    return true;
                }
                i++;
            }
            return false;
        }
    }
//    public boolean isMatch(String input, String pattern){
//        return isMatchHelper(input, pattern );
//
//    }


//    public boolean isMatchHelper(String input, String pattern ){
//        // base case
//        if( pattern.length() == 0){
//            if(input.length() == 0){
//                return true;
//            }else{
//                return false;
//            }
//        }
//        // pattern length 1
//        if(pattern.length() == 1){
//            if (pattern.charAt(0) == input.charAt(0) || pattern.charAt(0) == '.'){
//                return true;
//            }
//            else {
//                return false;
//            }
//        }
//        // pattern length more than 1
//        else{
//            if( pattern.charAt(0)== input.charAt(0) || pattern.charAt(0) == '.'){
//                isMatchHelper(input.substring(1) , input.substring(1));
//            } else if( pattern.charAt(1) == '*') { // check for *
//                // * has 0 repeatation of chars
//                boolean is_zero_repeatation = isMatch(input, pattern.substring(2));
//                if(is_zero_repeatation == true)
//                    return true ;
//                else { // there is some repeatation of chars aaaaab  and a*b
//                    int i =0;
//                    while(i < input.length() && pattern.charAt(0) == )
//
//                }
//            }
//        }
//    }
}

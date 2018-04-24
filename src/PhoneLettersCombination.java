import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneLettersCombination {
    Map<String, String> phoneLetters;
    public PhoneLettersCombination(){
        phoneLetters = new HashMap<String, String>();
        phoneLetters.put("0", "0");
        phoneLetters.put("1", "");
        phoneLetters.put("2", "abc");
        phoneLetters.put("3", "def");
        phoneLetters.put("4", "ghi");
        phoneLetters.put("5", "jkl");
        phoneLetters.put("6", "mno");
        phoneLetters.put("7", "pqrs");
        phoneLetters.put("8", "tuv");
        phoneLetters.put("9", "wxyz");
    }

    public static void main(String args[]){
        PhoneLettersCombination pl = new PhoneLettersCombination();
        pl.generateAllCombinations("345");
    }

    public void generateAllCombinations(String num){
        ArrayList<String> result = new ArrayList<String>();
        generateHelper(num, "",  result);
        System.out.println("after the call" + result.toString());

    }

    public void generateHelper(String num, String chosen, ArrayList<String> res  ){
        System.out.println("generateHelper(" + num + " : " + chosen + ")");
        //base case
        if( num.length() == 0){
            String r = chosen;// because in the parent call we remove the choosen char from chosen string
            System.out.println("*******" +chosen );
            res.add(r);
        }
        else{
            char chosenDigit =  num.charAt(0);
            String posibleStrings = phoneLetters.get(Character.toString(chosenDigit));
            for( int i=0 ; i < posibleStrings.length() ; i++){

                char c = posibleStrings.charAt(i);
                chosen = chosen.concat(Character.toString(c)); // chose

                generateHelper(num.substring(1), chosen, res); // explore

               chosen = (chosen.length() == 1)? "" : chosen.substring(0, chosen.length()-1 ); // unchose

            }
        }
    }



}

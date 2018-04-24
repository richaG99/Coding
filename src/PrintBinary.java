import java.util.ArrayList;

public class PrintBinary {



        public static void main(String args[]){
            PrintBinary pn= new PrintBinary();
            pn.PrintBinary(3);
        }

        public ArrayList<String> PrintBinary(int n){
            ArrayList<String> res =new ArrayList<String>();
            PrintBinaryHelper(n, "", res );
            return res;
        }

        public void PrintBinaryHelper(int n, String prefix, ArrayList<String> res){
            if( n == 0){
                String valid_comb = prefix;
                System.out.println(valid_comb);
                res.add(valid_comb);
            }
            else{
                //chose

                //explore
                PrintBinaryHelper(n-1, prefix + "0", res);
                PrintBinaryHelper(n-1, prefix + "1", res);
                //unchose

            }

        }
    }




import java.util.ArrayList;

public class SubLists {

    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("jane");
        list.add("bob");
        list.add("matt");
        list.add("era");

        int[] nums = {1, 2, 3,4, 5};
        SubLists sl = new SubLists();
        sl.makeGroups(list);
    }

    public void makeGroups(ArrayList<String> list){
        makeGroupHelper(list, new ArrayList<String>());

    }

    public void makeGroupHelper(ArrayList<String> list, ArrayList<String> chosen){
        System.out.println("makeGroupHelper ( "+ list.toString() + ", " + chosen.toString() + ")") ;

        //base case
        if(list.isEmpty()) {
            System.out.println(chosen.toString());
        }
        else{
           // for (int i =0; i< list.size(); i++){
                String first = list.get(0);
                list.remove(0);

                //chose
                chosen.add(first);

                //explore.. include
                makeGroupHelper(list,chosen);

                //exclue
                chosen.remove(chosen.size()-1);
                makeGroupHelper(list, chosen);

                //unchose
                list.add(  0, first);

            }
        }


        // chose
        // explore
        // unchose
    }
//}


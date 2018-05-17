//import java.util.ArrayList;
//
//public class DiceRoll {
//    public static void main(String args[]) {
//        DiceRoll d = new DiceRoll();
//        int desiredSum = 8;
//        d.diceRoll(5, desiredSum);
//    }
//
//    public void diceRoll(int dice, int desiredSum) {
//        diceRollHelper(dice, desiredSum, new ArrayList<Integer>(), 0);
//
//    }
//
//    public void diceRollHelper(int dice, int desiredSum, ArrayList<Integer> chosen, int sumSoFar) {
//        System.out.println("diceRollHelper (" + dice + chosen.toString() + ")");
//        if (dice == 0) {
//            System.out.println(chosen);
//        } else {
//            for (int i = 1; i <= 6; i++) {
//                // too big
//                if (sumSoFar + i + 1 * (dice - 1) <= desiredSum &&
//                        sumSoFar + i + 6 * (dice - 1) >= desiredSum) {
//
//                    chosen.add(i);
//                    diceRollHelper(dice - 1, desiredSum, chosen, (sumSoFar + i));
//                    chosen.remove(chosen.size() - 1);
////                    ArrayList<Integer> arr = new ArrayList<Integer>();
////                    arr.add()
//                }
//            }
//        }
//
//    }
//}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FindAllBoardWords {

    class Pair{
        int i;
        int j;
        Pair(int x, int y){
          this.i =x;
          this.j =y;
        }
    }



    public static void main (String args[]){
        FindAllBoardWords f = new FindAllBoardWords();

        char[][] board = {{'d','o','c','t'},
                          {'m','o','j','o'},
                          {'d','o','g','r'},
                          {'r','u','s','t'},

                        } ;
        ArrayList<String> words = new ArrayList<String>();
        words.add("doctor");
        words.add("dog");
        words.add("rust");
        words.add("doc");
        words.add("mojo");
        words.add("dog");

    }

    public void printValidWords(char[][] B, ArrayList<String> validwords){
        int[] dx = {0, 0, 1, -1};
        int[] dy = {-1, 1, 0, 0};

        int row = B.length;
        int col = B[0].length;

        boolean[][] visited = new boolean[row][col];
        for( int i=0; i< visited.length; i++){
            Arrays.fill(visited[i], false);
        }

        Pair start = new Pair(0,0);
        LinkedList<Pair> q = new LinkedList<Pair>() ;
        q.add(start);
        while(q.isEmpty()){

            Pair p = q.poll();
            for(int k =0; k <4 ;k++){
                int x = p.i + dx[k];
                int y = p.j + dy[k];

                if( x < 0 || x >=row || y < 0 || y >=col || visited[x][y]){
                    continue;
                } else {
                    if(!visited[x][y]){
                        Pair p1 = new Pair(x, y);
                        q.add(p1);
                        visited[x][y] = true;
                    }
                }
            }
        }
    }

    public boolean isValidWord(ArrayList<String> validwords, String input){
        for(int i=0; i< validwords.size(); i++){
            if(validwords.get(i).equalsIgnoreCase(input) ){
                return true;
            }
        }
        return false;
    }
}


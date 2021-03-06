import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Knight {

        class Pair{
            int x,y;
            Pair(int a, int b){
                x=a;y=b;
            }
        }
        public int knight(int N, int M, int x1, int y1, int x2, int y2) {
            int[][] arr= new int[N+1][M+1];
            int[] dx={2,2,1,1,-2,-2,-1,-1};
            int[] dy={1,-1,2,-2,1,-1,2,-2};
            for(int i=0;i<N+1;i++)
                Arrays.fill(arr[i],Integer.MAX_VALUE);
            Queue<Pair> q=new LinkedList<Pair>();
            q.add(new Pair(x1,y1));
            arr[x1][y1]=0;
            while(!q.isEmpty()){
                Pair p=q.poll();
                for(int k=0;k<8;k++){
                    int i=p.x+dx[k];
                    int j=p.y+dy[k];
                    if(i<1 ||i>N || j<1 || j>M)
                        continue;
                    if(arr[i][j]>arr[p.x][p.y]+1){
                        arr[i][j]=arr[p.x][p.y]+1;
                        //System.out.println(arr[i][j]);
                        q.add(new Pair(i,j));
                    }
                }
            }
            if(arr[x2][y2]==Integer.MAX_VALUE) return -1;
            return arr[x2][y2];
        }
    }



public class QuickSort {

    public static void main(String args[]){
        Integer[] arr  = {10,6,20,67, 11,45, 9,34,2,1} ;
        QuickSort q = new QuickSort();
        q.sortArray(arr);
        System.out.print(arr.toString());
    }

    public Object[] sortArray(Integer[] arr){
        if( arr == null)
            return null;
        if(arr.length == 0)
            return null;

        sortArrayHelper(" ",0, arr.length -1,  arr);
        return arr;
    }

    public Integer[] sortArrayHelper(String indent,  int start, int end, Integer[] arr){

        int left = start;
        int right = end ;

        System.out.println( indent+ "  " + start + " , " + end + " ," + arr);

        if( left>right) {
            return arr;
        }

        int pivot = arr[left];


        while(left < right){

            while(arr[left] <= pivot ){
                left++;
            }
            while(arr[right] >= pivot ){
                right --;
            }
            swap( left, right, arr);
            left++;
            right--;

        }
        swap(start, right, arr);
        sortArrayHelper(indent + "  ",  start, left, arr );
        sortArrayHelper(indent+ "  ", left +1, end, arr);

        return arr;
    }

    public void swap( int i, int j, Integer[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

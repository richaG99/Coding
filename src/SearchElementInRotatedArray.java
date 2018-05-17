import java.util.Random;

public class SearchElementInRotatedArray {

    public static void main(String args[]){
        SearchElementInRotatedArray se = new SearchElementInRotatedArray();
        int[] arr = {6, 8,1,2,4,5};
        int[] num = {56, 58, 67, 76, 21,32, 37, 40, 45, 49};
        int[] num2 =  {101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100};
        se.find_element(num2, 202);


    }

    public int find_element(int[] arr, int num){
       int index = find_elementHelper(arr, 0, arr.length -1 , num );
        System.out.println(index);
        return index;
    }

    public int find_elementHelper( int[] arr, int start, int end, int num){
        if ( start >= end){
            if( arr[start] == num){
                return start;
            } else{
                return -1;
            }
        }

        int mid =( start + end) /2 ;
        if( num == arr[mid])
            return mid;
        if( num == arr[start])
            return start;
        if( num == arr[end])
            return end;

        if( arr[start] < arr[mid]){ // first half sorted
            if( arr[start] < num  && num < arr[mid] ){
                end = mid-1;
            } else{
                start = mid+1;
            }

        } else { // second half sorted
            if(arr[mid] < num && num < arr[end]){
                start = mid+1;
            } else {
                end = mid -1;
            }

        }
        return find_elementHelper(arr, start, end, num);

    }

}

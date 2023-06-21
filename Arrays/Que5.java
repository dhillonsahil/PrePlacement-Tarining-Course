package Arrays;

import java.util.Arrays;

public class Que5 {
    public static void main(String[] args) {
        int arr[] = { 4,5,6,0,0,0 };
        int arr2[] = { 1,2,3 };
        merge(arr, arr2);
        System.out.println(Arrays.toString(arr));
    }

    public static void merge(int arr[], int arr2[]) {
        int j = arr2.length - 1;
        for(int i=arr.length-1;i>=0;i--){
            if(j<0)break;
            if(i-j-1 >=0 && arr[i-j-1]>arr2[j]){
                arr[i]=arr[i-j-1];
            }else{
                arr[i]=arr2[j];
                j--;
            }
        }
    }
}

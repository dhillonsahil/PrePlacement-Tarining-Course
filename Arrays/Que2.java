package Arrays;

import java.util.Arrays;

public class Que2{
    public static void main(String[] args) {
        int arr[]={0,1,2,2,3,0,4,2};
        int a=remove(arr, 2);
        System.out.println(a);
        System.out.println(Arrays.toString(arr));
    }
    public static int remove(int arr[],int val){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[count]=arr[i];
                count++;
            }
        }
        return count;
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
package Arrays;

import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int ar[]=twosum(arr, 26);
        System.out.println(Arrays.toString(ar));
    }
    public static int[] twosum(int arr[],int target){
        Map<Integer,Integer> hm =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],i);
        }
        // check 
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target && hm.containsKey(0)){
                return new int[]{i,hm.get(0)};
            }else if(hm.containsKey(target - arr[i])){
                if(hm.get(target -  arr[i])>i){
                    return new int[]{i,hm.get(target-arr[i])};
                }
            }
        }

        return new int[]{0,0};
    }
}

package Arrays;

import java.util.Arrays;

public class DSA_MOCKTEST1 {
    public static void moveZeroes(int[] nums) {
        int count =0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=0 && nums[count]==0){
               nums[count]=nums[i];
               nums[i]=0;
                count++;
            }else if(nums[count]!=0)count++;
            
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

}
package Arrays;

import java.util.*;

public class Que6 {
    public static boolean hasDuplicate(int[] nums) {
       Set<Integer> st= new HashSet<>();
       for(int num:nums){
           if(st.contains(num))return true;
           else{
               st.add(num);
           }
       }
       return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        boolean hasDuplicate = hasDuplicate(arr);
        System.out.println(hasDuplicate); // Output: true
    }
}

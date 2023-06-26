# Q1 : Move Zeros
Answer : 
```java
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
```

# Q2 : First Unique Character
Answer : 
```java
public class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i)) +1);
            }
        }
        // traverse
        int result=-1;
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i)) ==1 ){
                result=i;
                break;
            }
        }

        return result;
    }
    public static void main(String args[]){
        String sa="loveleetcode";
        int idx=firstUniqChar(sa);
        System.out.println(idx);
    }
}
```
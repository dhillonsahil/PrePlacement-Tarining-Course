# Q1 : Array Parition
Answer : 
```java
class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            sum= sum+nums[i];
        }
        return sum;
    }
    public static void main(String args[]){
        int arr[]={1,4,3,2};
        int sum = arrayPairSum(arr);
        System.out.println(sum);
    }
}
```

# Q2 : Distibute Candy
**Answers** : 
```java
package Arrays;
java.import.*;

public class CandyQue{
    public static void main(String args[]){
        int arr[]={1,1,2,2,3,3};

    }
    public static int distribute(int []candyType){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<candyType.length;i++){
           set.add(candyType[i]);
           if(set.size()>candyType.length/2)return candyType.length/2;
        }
        return set.size();
    }
}
```

# Q4 : Can Place Flower
Answer : 
```java
package Arrays;

import java.util.Arrays;

public class Ass2_Flowers {
    public static void main(String[] args) {
        int arr[] = { 0,0,1,0,0 };
        boolean a = canPlaceFlowers(arr, 1);
        System.out.println(Arrays.toString(arr));
        System.out.println(a);
    }

     public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)return true;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1]==0)){
                n--;
                flowerbed[i]=1;
                if(n==0)return true;
            }
        }
        return false;
    }
}
```


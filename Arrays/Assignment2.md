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

# Q3 : Longset Harmonous Array
Answer ; 
```java
public class Solution {
    public static int findLHS(int[] nums) {
        HashMap <Integer, Integer> ai  = new HashMap<>();
        for(int i:nums){
            ai.put(i, ai.getOrDefault(i,0)+1);
        }
        int max = 0;
         for (int key : ai.keySet()) {
            if (ai.containsKey(key+1)) {
                int count = ai.get(key) + ai.get(key + 1);
                max = Math.max(max, count);
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[]= {1,3,2,2,5,2,3,7};
        int result= findLHS(arr);
        System.out.println(result);
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

# Q5 :  maximum Product of three numbers
Answer :
```java
public class Solution {
    public static int maximumProduct(int[] nums) {
        int min1,min2,max1,max2,max3;
        max1 = max2 = max3 = Integer.MIN_VALUE;
        min1 =min2 = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
                max3=max2;
                max2=max1;
                max1=nums[i];
            }else if(nums[i]>max2){
                max3=max2;
                max2=nums[i];
            }else if(nums[i]>max3){
                max3=nums[i];
            }

            // for -ve values or smallest values
            if(min1>nums[i]){
                min2=min1;
                min1=nums[i];
            }else if(min2>nums[i]){
                min2=nums[i];
            }
        }

        int case1 =min1*min2*max1;
        int case2= max1*max2*max3;
        return Math.max(case1,case2);
    }
    public static void main(String args[]){
        int arr[]={-100,1,-89,4,32,4,11,99};
        int result=maximumProduct(arr);
        System.out.println(result);
    }
}
```

# Q6 : Binaray Search
Answer : 
```java
public class Solution {
    public static int search(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target);
    }
    public static int binarySearch(int nums[],int low,int high,int target){
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]<target){
            low=mid+1;
        }else{
            high=mid-1;
        }
        return binarySearch(nums,low,high,target);
    }
    public static void main(String args[]){
        int arr={-1,0,3,5,9,12};
        int taret = 9;
        int result=search(arr,target);
        System.out.println(result);
    }
}
```

# Q7 : Monotonic array
Answer : 
```java
public class Solution {
    public static  boolean isMonotonic(int[] nums) {
        if(nums.length==1)return true;
        boolean flag=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                continue;
            }else{
                flag=false;
                break;
            }
        }
        if(flag)return true;

        flag=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                continue;
            }else{
                return false;
            }
        }
        return true;
        
    }
     public static void main(String args[]){
        int arr[]={1,2,2,3,4};
        boolean result=isMonotonic(arr);
        System.out.println(result);
    }
}
```

# Q8 : Smallest Range 1
```java
public class Solution {
    public static int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (min > n) {
                min = n;
            }
            if (max < n) {
                max = n;
            }
        }
        int diff = max - min;
        if (diff <= k + k) {
            return 0;
        } else {
            return diff - (k + k);
        }
    }
    public static void main(String args[]){
        int arr[]={1,3,6,9};
        int k=3;
        int result =smallestRangeI(arr,k);
        System.out.println(result);
    }
}
```
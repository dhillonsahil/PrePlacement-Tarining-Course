# Q1 : Two Sum
Answer  : 
```java
package Arrays;

import java.lang.reflect.Array;
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

```
# Q2 : Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val. Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things: - Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums. - Return k.
**Answer** :
```java
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
```

# Q3 : Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order. You must write an algorithm with O(log n) runtime complexity.
Answer:
```java
package Arrays;

public class Que3 {
    public static void main(String[] args) {
        int arr[]={1,3,6,7};
        int a=Search(arr, 0, arr.length, 7);
        System.out.println(a);
    }
    public static int Search(int arr[] ,int l , int h, int target){
        int a=0;
        while(l<=h){
            if(h==l)return l;
            int m = l + (h-l)/2;
            if(arr[m]==target)return m;
            if(arr[m]<target){
                l=m+1;
            }else if(arr[m]>target){
                h=m;
            }
        }

        return a;
    }
}

```

# Q4 : Plus One
Answer : 
```java
package Arrays;

import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        int arr[] = { 9,9 };
        int a[] = plus(arr); 
        System.out.println(Arrays.toString(a));
    }

    public static int[] plus(int digits[]) {
        int i=digits.length-1;
        while(i>=0){
            if(digits[i]!=9){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;
            i--;
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }

}

```
# Q5 : Merge two Sorted List
Answer : 
```java
package Arrays;

import java.util.Arrays;

public class Question5 {
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

```

# Q6: Find Duplicates
Answer ; 
```java
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
```

# Q7 : Move Zeros
Answer : 
```java
package Arrays;

import java.util.Arrays;

public class Que7 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 3, 1, 2 };
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZero(int nums[]){
         int count =0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=0 && nums[count]==0){
               nums[count]=nums[i];
               nums[i]=0;
                count++;
            }else if(nums[count]!=0)count++; }
    }
}
```

# Q8 : 💡 You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.You are given an integer array nums representing the data status of this set after the error.Find the number that occurs twice and the number that is missing and return them in the form of an array.

Answer : 
```java
package Arrays;

import java.util.Arrays;

public class MissingRepeating {
    static int[] findTwoElement(int arr[], int n) {
        int n1 = n*(n+1)/2;
        int n2=0;
        int s1=n*(n+1)*(2*n+1)/6;
        int s2=0;
        for(int i=0;i<n;i++){
            n2+=arr[i];
            s2+=arr[i]*arr[i];
        }
        
        int n3=n1-n2;
        int s3=s1-s2;
        int z = s3/n3;
        int x= (z-n3)/2;
        int y=z-x;
        return new int[]{x,y};
    }
    public static void main(String[] args) {
        int arr[]={4,3,6,2,1,1};
       int[] ns= findTwoElement(arr, 6);
       System.out.println(Arrays.toString(ns));
    }
}
```
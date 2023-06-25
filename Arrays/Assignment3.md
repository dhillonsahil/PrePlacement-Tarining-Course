# Q1 : 3Sum Closest
Answer : 
```java
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestNumber=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
               int sum = nums[i]+nums[k]+nums[j];
               if(target==sum){
                   return sum;
               }else if(Math.abs(target-sum)<Math.abs(target-closestNumber)){
                   closestNumber=sum;
               }

               if(sum<=target){
                   while(j<k && nums[j]==nums[j+1])j++;
                   j++;
               }else{
                   while(j<k && nums[k]==nums[k-1])k--;
                   k--;
               }
            }
        }
        return closestNumber;
    }
}
```

# Q2 : 4Sum
Answer : 
```java
public class Solution{
    public static void main(String args[]){
        int arr= {-2,0,1,2,-1,0};
        List<list<Integer>> list = new ArrayList<>();
        System.out.println(list)
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();

        // creating list and sorting the array
        Arrays.sort(nums);
        int n=nums.length;
        System.out.println(Arrays.toString(nums));
        // starting loop to get values
        
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                // starting k and l two pointers
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    int sum= nums[i]+nums[j]+nums[k]+nums[l];
                    // if sum is equal to target save in List
                    if(sum<target){
                        k++;
                    }else if(sum>target){
                        l--;
                    }else{
                        List<Integer> ll = new ArrayList<>();
                        ll.add(nums[i]);ll.add(nums[j]);ll.add(nums[k]);ll.add(nums[l]);
                        if(!list.contains(ll)){
                            list.add(ll);
                        }
                        while(k<l && nums[k]==nums[k+1])k++;
                        while(k<l && nums[l]==nums[l-1])l--;
                        k++;
                        l--;
                    }
                }
                while(j+1<nums.length-2 && nums[j+1]==nums[j])j++;
            }
            while(i+1<nums.length-3 && nums[i+1]==nums[i])i++;
        }

        return list;
    }
}
```
# Q3 :
Answer : 
```java
public class Solution {
    public static void nextPermutation(int[] nums) {
        int idx1=-1;
        int idx2=-1;
        for(int i=nums.length-2 ; i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx1=i;
                break;
            }
        }
        // if no breaking point
        if(idx1==-1){
            reverse(nums,0);
        }else{
            for(int i=nums.length-1;i>0;i--){
                if(nums[i]>nums[idx1]){
                    idx2=i;break;
                }
            }

            swap(nums,idx1,idx2);
            // step 3 reverse the rest right half
            reverse(nums,idx1+1);
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}
```

# Q4 : Serch Target or return index to be inserted
Answer  : 
```java
public class Solution {
    public static int searchInsert(int[] nums, int target) {
        return Search(nums,0,nums.length,target);
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
    public static void main(string args[]){
        int arr[]={5,14,9,2,7,21,36};
        int target=17;
        int idx=searchInsert(arr,target);
        System.out.println(idx);
    }
}
```

# Q5 : Plus One
Answer :
```java
public class Solution {
    public int[] plusOne(int[] digits) {
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
    public static void main(String args[]){
        int arr[]={1,2,3};
        int result[]=plusOne(arr);
        System.out.println(Arrays.sort(result));
    }
}
```

# Q6 : Single Element
Answer : 
```java
public class FindSingleElement{
    public static void main(String args[]){
        int arr[]={4,1,2,1,2};
        int result=findSingle(arr);
        System.out.println(result);
    }
    public static int findSingle(int arr[]){
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=res^arr[i];
        }
        return res;
    }
}
```

# Q7 : Missing Ranges
Answer : 
```java
import java.util.*;
public class MissingNumbers {
    public static void main(String[] args) {
        int arr[]={0,1,3,50,75};
        int low=0;
        int high=99;
        List<List<Integer>> ll = findRange(arr, low, high);
        System.out.println(ll);
    }
    public static List<List<Integer>> findRange(int arr[],int low, int high){
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            // if 1st element is greater than low or both
            if(i==0 && arr[i]>low){
                if(arr[i]>high){
                    if(low!=high){
                        list.add(Arrays.asList(low,high));
                    }
                }else{
                    // if not greater than high
                    list.add(Arrays.asList(low,arr[i]));
                }
            }
            // now using elif 
            else if(arr[i]==low+1){
                low=arr[i];
            }else if(arr[i]==low){
                // low=low+1;
                continue;
            }
            else if(arr[i]!=low+1 && arr[i]<high){
                // 2nd here
                list.add(Arrays.asList(low+1,arr[i]-1));
                low=arr[i];
            }else if(arr[i]>high){
                list.add(Arrays.asList(low+1, high));
            }
        }
        if(arr[arr.length-1]<high){
            list.add(Arrays.asList(arr[arr.length-1]+1,high));
        }

        return list;
    }
}

```


# Question 8 : Check Intersecting Intervals
```java
import java.util.*;;
public class MeetingsInterval{
    public static void main(String[] args) {
        int arr[][]={
            {0,30},{15,20},{5,10}
        };
        boolean flag=checkIntersections(arr);
        System.out.println(flag);
    }
    public static boolean checkIntersections(int [][]intervals){
        // sorting
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0], b[0]));
        System.out.println(Arrays.deepToString(intervals));
        for(int i=0;i<intervals.length-1;i++){
            if(intervals[i][1]<intervals[i+1][0]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
```
# 1 Convert 1 d array to 2d array
Answer : 
```java
public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != n * m) {
            return new int[][]{};
        }
        int[][] res = new int[m][];
        for(int i = 0; i < m; i ++) {
            res[i] = Arrays.copyOfRange(original, i * n, i * n + n);
        }
        return res;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        int m=2,n=2;
        int res[][]=construct2DArray(arr,m,n);
    }
}
```

# Q2 : Arrange Coins
Answer :
```java
class Solution {
    public int arrangeCoins(int n) {
        int low=0;
        int high=n;
        while(low<=high){
            int  middle = low+ (high-low)/2 ;
            long temp = ((long) middle *(middle+1))/2 ;
            if(temp<n){
                low=middle+1;
            }else if(temp>n){
                high=middle-1;
            }else{
                return middle;
            }
        }
    return high;
    }
}
```


# Q3 : return square in sorted order
Answer :
```java
import java.util.*;
public class Solution {
    public int[] sortedSquares(int[] nums) {
        int result[]=new int[nums.length];
        int i=0,j=nums.length-1;
        for(int k=j;k>=0;k--){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                result[k]=nums[i]*nums[i];
                i++;
            }else{
                result[k]=nums[j]*nums[j];
                j--;
            }
        }
        return result;
    }
    public static void main(String args[]){
        int arr[]={-4,-1,0,3,10};
        int result[]=sortedSquares(arr);
        System.out.println(Arrays.toString(result));
    }
}
```


# Q4: Difference of arrays
Answer :
```java
import java.util.*;
public class Ass4_2 {
    public static void main(String[] args) {
        int nums1[]={1,2,3};
        int nums2[]={2,4,6};
        // my code
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
       
        List<List<Integer>> list= new ArrayList<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            set2.add(num);
        }
        List<Integer> l1 = new ArrayList<>();
        for(int num:set1){
            if(!set2.contains(num)){
                l1.add(num);
            }
        }
        List<Integer> l2 = new ArrayList<>();
        for(int num:set2){
            if(!set1.contains(num)){
                l2.add(num);
            }
        }
        list.add(l1);
        list.add(l2);
       System.out.println(list);
    }   
}
```

# Q5 : Distance Values of Array
Answer : 
```java
public class Solution {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for(int i=0;i<arr1.length;i++){
            boolean flag=false;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    flag=true;
                }
            }
            if(!flag)count++;
        }
        return count;
    }
    public static void main(String args[]){
        int arr1[]={4,5,8};
        int arr2[]={10,9,1,8};
        int d=2;
        int count =findTheDistanceValue(arr1,arr2,d);
        System.out.println(count)
    }

}
```

# Q6 : 
Answer : 
```java
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ll= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int m=Math.abs(nums[i]);
            if(nums[m-1]>0)
                nums[m-1]=-nums[m-1];
            else {
                ll.add(Math.abs(nums[i]));
            }
        }
        return ll;
    }
}
```

# Q7 : 
Answer : 
```java
class Solution {
    public int findMin(int[] nums) {
        int l=0,h=nums.length-1;
        while(l<h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]>nums[h])
                l=mid+1;
            else
                h=mid;
        }
        return nums[h];
    }
}
```

# Q8 :
Answer :
```java
import java.util.*;
public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        int len=changed.length;
        Arrays.sort(changed);
        if(changed.length%2!=0)return new int[]{};
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int i:changed){
            hm.put(i,hm.getOrDefault(i, 0)+1);
        }
        int res[]=new int[len/2];

        int k=0;
        for(int i=0;i<len;i++){
            int ele=changed[i];
            if(hm.containsKey(ele)){
                if(hm.containsKey(2*ele)){
                    res[k++]=ele;
                    hm.put(ele, hm.get(ele)-1);
                    hm.put(ele*2, hm.get(ele*2)-1);

                    if(hm.get(ele)<=0)hm.remove(ele);
                    if(hm.containsKey(2*ele) && hm.get(ele*2)<=0)hm.remove(ele*2);
                }else{
                    return new int[]{};
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,2,6,8};
        int a[]=findOriginalArray(arr);
        System.out.println(a);
    }
}
```
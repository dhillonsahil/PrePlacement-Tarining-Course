# Q1 : Intersection of Arrays
Answer :
```java
import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int[] A = { 3, 3, 3 };
        int B[] = { 3, 3, 3 };
        int C[] = { 3, 3, 3 };
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int MaxLen= Math.max(A.length,Math.max(B.length,C.length));
        // checking
        for (int i = 0; i < MaxLen; i++) {
            if(i<A.length){
                if(i==0){
                    add(A, i, hm, al);
                }else if(i>0 && A[i]!=A[i-1]){
                    add(A, i, hm, al);
                }
            }
            if (i < B.length) {
                if(i==0){
                    add(B,i,hm,al);
                }else if (i > 0 && B[i] != B[i - 1]) {
                    add(B,i,hm,al);
                }
                

            }
            if (i < C.length) {
                if(i==0){
                    add(C,i,hm,al);
                }else if (i > 0 && C[i] != C[i - 1]) {
                    add(C,i,hm,al);
                }
                
            }
        }

        System.out.println(al);
    }
    public static void add(int []arr,int i, HashMap<Integer,Integer> hm, ArrayList<Integer> al){
        if(hm.containsKey(arr[i])){
            int a = hm.get(arr[i]);
            if(a==2){
                al.add(arr[i]);
            }else{
                hm.put(arr[i], a+1);
            }
        }else{
            hm.put(arr[i], 1);
        }
    }
}
```

# Q2: Difference
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

# Q3 : Transpose a Matrix
Answer :
```java
import java.util.*;
public class Solution {
    public static int[][] transpose(int[][] matrix) {
        int m=matrix.length ; int n= matrix[0].length;
        int result[][]=new int[n][m];
        for(int i=0;i< n;i++){
            for(int j=0;j< m;j++){
                result[i][j]=matrix[j][i];
            }
        }


    
       return result; 
    }
    public static void main(String args[]){
        int arr[][]={
            {2,4,-1},{-10,5,11},{18,-7,6};
        }
        int [][]result=transpose(arr);
        System.out.println(Arrays.deepToString(result))
    }
}
```

# Q4 : Array Partition max sum of min(a,b)
Answer :
```java
public class Solution {
    public static int arrayPairSum(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            sum= sum+nums[i];
        }
        return sum;
    }
    public static void main(String args[]){
        int arr[]={1,4,3,2};
        int result=arrayPairSum(nums);
        System.out.println(result);
    }
}
```

# Q5 : Arrange Coins
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

# Q6 : return square in sorted order
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

# Q7 :
Answer : 
```java
public class Solution {
    public static int maxCount(int m, int n, int[][] ops) {
        int x=m,y=n;
        for(int []operation:ops){
            x=Math.min(x,operation[0]);
            y=Math.min(y,operation[1]);
        }
        return x*y;
    }
    public static void main(String args[]){
        int ops[][] ={{2,2},{3,3}};
        int m=3;
        int n=3;
        int res=maxCount(m,n,ops);
        System.out.println(res);
    }
}
```

# Q8 :
Answer : 
```java
import java.util.*;
public class Solution {
    public int[] shuffle(int[] nums, int n) {
        if(n==1)return nums;
        int result[]=new int[2*n];
        int r=0;
        for(int i=0;i<n;i++){
            result[r++]=nums[i];
            result[r++]=nums[n+i];
        }
        return result;
    }
    public static void main(String args[]){
        int arr[]={2,5,1,3,4,7};
        arr=shuffle(3);
        System.out.println(Arrays.toString(arr));
    }   
}
```
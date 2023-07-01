# Q1 : 
Answer :
```java
class Solution {
    public int[] diStringMatch(String s) {
        int res[]=new int[s.length()+1];
        int L=0;
        int H=s.length();
        for(int i=0;i<res.length;i++){
            if(L==H){
                res[i]=L;
                break;
            }
            if(s.charAt(i)=='I'){
                res[i]=L;
                L++;
            }else{
                res[i]=H;
                H--;
            }
        }

        return res;
    }
}
```

#  Q2 : 
Answer : 
```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;int n=matrix[0].length;
        int low=0,high=m*n-1;
        while(low<=high){
            int midIdx=low + (high-low)/2;
            int middle = matrix[midIdx/n][midIdx%n];
            if(middle==target){
                return true;
            }else if(middle<target){
                low=midIdx+1;
            }else{
                high=midIdx-1;
            }
        }
        return false;
    }
}
```

# Q3 : 
Answer : 
```java
class Solution {
    public boolean validMountainArray(int[] arr) {\
        if (arr.length < 3)
            return false;
        boolean inc = true, dec = false,check=false;
        for (int i = 0; i < arr.length-1; i++) {
            int ai=arr[i];
            int aai=arr[i+1];
            if (arr[i] == arr[i + 1])
                return false;
            if (inc) {
                if (arr[i] < arr[i + 1]) {
                    continue;
                } else {
                    if(i==0)return false;
                    dec = true;
                    inc = false;
                }
            }else if(dec){
                if(arr[i]<arr[i+1])return false;
                else continue;
            }
        }
        if(inc==true && dec==false)return false;
        else return true;
    }
}
```

# Q4 : 
Answer ; 
```java
class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) nums[i] = -1;
        }
        int sum = 0; 
        int max = 0; 
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i]; 
            if(sum == 0) {
                max = Math.max(max, i+1);
            }
            if(map.containsKey(sum)){ 
                int last = map.get(sum); 
                max = Math.max(max, i - last); 
            }
            else{ 
                map.put(sum, i);
            }
        }
        return max;
    }
}
```

# Q5 : 
Asnwer : 
```java
package Arrays;
import java.util.*;
public class MiniMumProductSum{
    public static void main(String[] args) {
        int num1[]={2,1,4,5,7};
        int num2[]={3,2,4,8,6};
        int result=getMaxSum(num1, num2);
        System.out.println(result);
    }
    public static int getMaxSum(int num1[],int num2[]){
        Arrays.sort(num1);
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for(int i:num2){
            pq.add(i);
        }
        int sum=0;
        for(int i=0;i<num1.length;i++){
            sum+=num1[i]*pq.remove();
        }

        return sum;
    }
}
```

# Q6 : 
Answer : 
```java
class Solution {
    public int[] findOriginalArray(int[] changed) {
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
}
```

# Q7 : 
Answer : 
```java
package Arrays;
import java.util.*;

public class SpiralMatrix {
    
    public static void main(String[] args) {
        int n = 5;

        int arr[][]=new int[n][n];

        int top=0;
        int bottom=n-1;
        int right=n-1;
        int left=0;

        int num=n*n;
        int num1=1;
        while(top<bottom && left<right){
            // row from left to right (top row)
            for(int i=left;i<=right;i++){
                arr[top][i]=num1++;
            }

            // right row top to bottom
            for(int i=top+1;i<=bottom;i++){
                arr[i][right]=num1++;
            }

            // bottom row right to left
            for(int i=right-1;i>=left;i--){
                arr[bottom][i]=num1++;
            }

            // left row bottom to top
            for(int i=bottom-1;i>top;i--){
                arr[i][left]=num1++;
            }
            top++;
            right--;
            left++;
            bottom--;
        }
if (top == bottom && left == right) {
            arr[top][right] = num1;
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
```

# Q8 :
answer :
```java
package Arrays;
public class MatrixMultiplication {
    public static int[][] multiplySparseMatrices(int[][] mat1, int[][] mat2) {
        int m = mat1.length;
        int k = mat1[0].length;
        int n = mat2[0].length;
        
        int[][] result = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                if (mat1[i][j] != 0) {
                    for (int l = 0; l < n; l++) {
                        if (mat2[j][l] != 0) {
                            result[i][l] += mat1[i][j] * mat2[j][l];
                        }
                    }
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Example usage
        int[][] mat1 = { {1, 0, 0}, {-1, 0, 3} };
        int[][] mat2 = { {7, 0, 0}, {0, 0, 0}, {0, 0, 1} };

        int[][] result = multiplySparseMatrices(mat1, mat2);
        
        // Print the result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

```
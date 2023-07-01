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
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
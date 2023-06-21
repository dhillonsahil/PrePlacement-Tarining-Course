package Arrays;

import java.util.Arrays;

public class Que4 {
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

package Arrays;

import java.util.Arrays;

public class Que8 {
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
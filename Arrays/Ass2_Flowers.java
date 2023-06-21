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
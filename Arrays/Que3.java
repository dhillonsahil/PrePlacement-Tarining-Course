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

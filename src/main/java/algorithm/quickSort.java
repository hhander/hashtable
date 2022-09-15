package algorithm;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        quickSort1(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    public static void quickSort1(int[] arr,int left,int right)
    {
        int l = left;
        int r = right;
        int mid = (left + right)/2;
        int midValue = arr[mid];
        while(l<r)
        {
            while(arr[l]<midValue)
            {
                l++;
            }
            while(arr[r]>midValue)
            {
                r--;
            }
            if(l>=r)
            {
                break;
            }
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;

            if(arr[l] == midValue)
            {
                r--;
            }

            if(arr[r] == midValue)
            {
                l++;
            }
        }
        if(l == r)
        {
            l++;
            r--;
        }
        if(l<right)
        {
            quickSort1(arr,l,right);
        }

        if(r>left)
        {
            quickSort1(arr,left,r);
        }

    }
}

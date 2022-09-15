package algorithm;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        mergeSort(arr,0,arr.length-1,new int[arr.length]);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int arr[],int left,int right,int[] tmp)
    {
        if(left<right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid, tmp);
            mergeSort(arr, mid + 1, right, tmp);
            merge(arr, left, mid, right, tmp);
        }

    }

    public static void merge(int arr[],int left,int mid,int right,int[] tmp)
    {
        int i = left;
        int j = mid +1;
        int t = 0;


        while(i<=mid && j<=right)
        {
            if(arr[i]<=arr[j])
            {
                tmp[t] = arr[i];
                t++;
                i++;
            }
            else
            {
                tmp[t] = arr[j];
                t++;
                j++;
            }
        }

        if(i<=mid)
        {
            while(i<=mid)
            {
                tmp[t] = arr[i];
                i++;
                t++;
            }
        }

        if(j<=right)
        {
            while(j<=right)
            {
                tmp[t] = arr[j];
                t++;
                j++;
            }
        }

        int tmpLeft = left;
        t = 0;
        while(tmpLeft <= right)
        {
            arr[tmpLeft] = tmp[t];
            tmpLeft++;
            t++;
        }
    }
}

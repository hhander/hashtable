package algorithm;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {11,22,3,44,55,66,77,8};
        radixSortMethod(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void radixSortMethod(int[] arr)
    {
        int max = Arrays.stream(arr).max().getAsInt();
        int maxCount = (max + "").length();
        int div = 1;
        while(maxCount!=0)
        {

            int[][] buckets = new int[10][arr.length];
            int[] bucketCountNums = new int[10];//十个捅的计数count   每个数代表桶里数的数量
            for (int i = 0; i < arr.length; i++) {
                int tmp = (arr[i]/div) % 10;
                buckets[tmp][bucketCountNums[tmp]] = arr[i];
                bucketCountNums[tmp]++;
            }
            int index = 0;
            for (int i = 0; i < bucketCountNums.length; i++) {
                if(bucketCountNums[i]!=0)
                {
                    for (int j = 0; j < bucketCountNums[i]; j++) {
                        int i1 = buckets[i][j];
                        arr[index++] = i1;
                    }
                }
            }
            maxCount--;
            div *= 10;
        }
    }

}

package sort;

import static sort.exch.swap;

public class BubbleSort {
//冒泡排序，时间复杂度为n2，空间复杂度为O1

    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        for(int i = arr.length-1;i > 0;i--){
            for(int j = 0;j < i;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }

        for(int s:arr){
            System.out.print(s);
        }
    }



}

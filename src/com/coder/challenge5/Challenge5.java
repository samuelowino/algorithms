package com.coder.challenge5;

public class Challenge5 {

    static void miniMaxSum(int[] arr) {
        long sum_a = 0;
        long sum_b = 0;

        int[] sortedArr = sort(arr);

        for (int k = 0; k < sortedArr.length; k++) {
            if (k != 0) {
                sum_b += sortedArr[k];
            }
        }

        for (int j = 0; j < sortedArr.length; j++) {
            if (j != (arr.length - 1)) {
                sum_a += sortedArr[j];
            }
        }

        System.out.println(sum_a + " " + sum_b);
    }

    private static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int next = j + 1;
                if (next <= arr.length - 1 && arr[j] > arr[next]) {
                    int swapVal = arr[j];
                    arr[j] = arr[next];
                    arr[next] = swapVal;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {396285104, 573261094, 759641832, 819230764, 364801279};
        miniMaxSum(arr);
    }

}

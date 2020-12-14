package com.coder.challenge5;

public class Challenge5 {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int sum_a = 0;
        int sum_b = 0;

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

        System.out.println("INPUT arr [" + arr[0] + "] [" + arr[1] + "] [" + arr[2] + "] [" + arr[3] + "] [" + arr[4] + "]");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int next = j + 1;
                System.out.println("\n==j " + j);
                if (next < arr.length - 1 && arr[j] > arr[next]) {
                    int swapVal = arr[j];
                    arr[j] = arr[next];
                    arr[next] = swapVal;

                    System.out.println("arr [" + arr[0] + "] [" + arr[1] + "] [" + arr[2] + "] [" + arr[3] + "] [" + arr[4] + "]");

                }
            }
        }

        System.out.println();
        System.out.println();
        for (int k = 0; k < arr.length; k++) {
            System.out.println("Sorted Arr| " + arr[k]);
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {7 ,69, 2, 221, 8974};
        miniMaxSum(arr);

    }

}

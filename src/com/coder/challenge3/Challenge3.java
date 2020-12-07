package com.coder.challenge3;

public class Challenge3 {

    public static void plusMinus(int[] arr) {
        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        for(int i =0; i< arr.length;i++){
            if(arr[i] == 0){
                zeros++;
            }else if(arr[i] < 0){
                negatives++;
            } else if(arr[i] > 0){
                positives++;
            }
        }

        double size = arr.length;
        double positivesRatio = positives/size;
        double negativesRatio = negatives/size;
        double zerosRatio = zeros/size;

        System.out.println(positivesRatio);
        System.out.println(negativesRatio);
        System.out.println(zerosRatio);

    }
}

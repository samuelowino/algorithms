package com.coder.challenge2;

import java.util.List;

class Challenge2 {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumOfForward = 0;
        int reverseSum = 0;
        int absoluteSum = 0;
        int forwardIndex = 0;
        int reverseIndex = 0;

        for(List<Integer> values: arr){
            if(values.size() >= 1){
                if(reverseIndex == 0 && forwardIndex == 0){
                    reverseIndex = values.size() - 1;
                }

                int forwardVal = values.get(forwardIndex);
                int reverseVal = values.get(reverseIndex);

                sumOfForward = sumOfForward + forwardVal;
                reverseSum = reverseSum + reverseVal;

                forwardIndex++;
                reverseIndex--;
            }

        }

        absoluteSum = reverseSum - sumOfForward;

        return Math.abs(absoluteSum);
    }

}

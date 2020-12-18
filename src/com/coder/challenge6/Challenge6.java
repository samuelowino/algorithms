package com.coder.challenge6;

import java.util.List;

public class Challenge6 {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int tallest = 0;
        int tallestCount = 0;

        for(int i =0; i < candles.size();i++){
            if(tallest < candles.get(i)){
                tallest = candles.get(i);
            }
        }

        for(int i = 0;i< candles.size();i++){
            if(candles.get(i) == tallest){
                tallestCount++;
            }
        }

        return tallestCount;
    }
}

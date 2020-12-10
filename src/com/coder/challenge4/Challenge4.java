package com.coder.challenge4;

public class Challenge4 {

    public static void staircase(int n) {
        int rowCount = 0;
        int tabs = n -1;

        for(int i = n; i > 0; i--){

            for(int t = tabs; t > 0; t--){
                System.out.print(" ");
            }

            for(int j = 0; j<=rowCount; j++){
                System.out.print("#");
            }
            System.out.println();
            rowCount++;
            tabs--;
        }
    }
}

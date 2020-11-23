package com.coder.challenge1;

import java.util.ArrayList;
import java.util.List;

public class Challenge1 {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        compareTriplets(a,b);
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> finalScore = new ArrayList<>();
        //compute score
        int a_score = 0;
        int b_score = 0;

        for (int i = 0; i < a.size(); i++) {
            int aliceScore = a.get(i);
            int bobScore = b.get(i);

            System.out.println("Alice Score " + aliceScore + " bobScore " + bobScore);

            if (aliceScore > bobScore) {
                //grant alice 1
               a_score = a_score + 1;
            } else if (aliceScore == bobScore) {
                //grant both zero at this index 0
                System.out.println("Equal scores ...");

            } else {
                //grant bob 1
                b_score = b_score + 1;
            }

        }

        finalScore.add(0, a_score);
        finalScore.add(1, b_score);

        System.out.println("Final Score " + finalScore);

        return finalScore;
    }
}

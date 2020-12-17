
# Solutions for the Hacker Rank Algorithm Design Challenge

![Image of Yaktocat](logo.jpg)

## Challenge 1

## Triplets Problem

Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).

The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].

If a[i] > b[i], then Alice is awarded 1 point.
If a[i] < b[i], then Bob is awarded 1 point.
If a[i] = b[i], then neither person receives a point.
Comparison points is the total points a person earned.

Given a and b, determine their respective comparison points.

Example

a = [1, 2, 3]
b = [3, 2, 1]
For elements *0*, Bob is awarded a point because a[0] .
For the equal elements a[1] and b[1], no points are earned.
Finally, for elements 2, a[2] > b[2] so Alice receives a point.
The return array is [1, 1] with Alice's score first and Bob's second.

Function Description

Complete the function compareTriplets in the editor below.

compareTriplets has the following parameter(s):

int a[3]: Alice's challenge rating
int b[3]: Bob's challenge rating
Return

int[2]: Alice's score is in the first position, and Bob's score is in the second.
Input Format

The first line contains 3 space-separated integers, a[0], a[1], and a[2], the respective values in triplet a.
The second line contains 3 space-separated integers, b[0], b[1], and b[2], the respective values in triplet b.

Constraints

1 ≤ a[i] ≤ 100
1 ≤ b[i] ≤ 100
Sample Input 0

5 6 7
3 6 10
Sample Output 0

1 1
Explanation 0

In this example:

Now, let's compare each individual score:

, so Alice receives  point.
, so nobody receives a point.
, so Bob receives  point.
Alice's comparison score is , and Bob's comparison score is . Thus, we return the array .

Sample Input 1

17 28 30
99 16 8
Sample Output 1

2 1
Explanation 1

Comparing the  elements,  so Bob receives a point.
Comparing the  and  elements,  and  so Alice receives two points.
The return array is .

## Challenge 2

# Diagonal Difference


Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:
>1 2 3
>
>4 5 6
>
>9 8 9  
>

>The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

## Function description

Complete the  function in the editor below.

diagonalDifference takes the following parameter:

>int arr[n][m]: an array of integers
Return

>int: the absolute diagonal difference
Input Format

The first line contains a single integer, , the number of rows and columns in the square matrix .
Each of the next  lines describes a row, , and consists of  space-separated integers .

## Constraints

### Output Format

Return the absolute difference between the sums of the matrix's two diagonals as a single integer.

Sample Input

>3
>
>11 2   4
>
>4  5   6
>
>10 8   -12
>

Sample Output

>15

### Explanation

The primary diagonal is:

11
   5
     -12
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

     4
   5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15

>Note: |x| is the absolute value of x

# Challenge 3
## Plus Minus

Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Example

> There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:

0.400000
0.400000
0.200000
Function Description

Complete the plusMinus function in the editor below.

plusMinus has the following parameter(s):

int arr[n]: an array of integers
Print
Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.

Input Format

The first line contains an integer, , the size of the array.
The second line contains  space-separated integers that describe .

Constraints



Output Format

Print the following  lines, each to  decimals:

>proportion of positive values
>proportion of negative values
>proportion of zeros
>Sample Input

6
-4 3 -9 0 4 1         
Sample Output

0.500000
0.333333
0.166667
Explanation

>There are  positive numbers,  negative numbers, and  zero in the array.
>The proportions of occurrence are positive: , negative:  and zeros: .
>


# Staircase

This is a staircase of size :

   \#
   
  \##
  
 \###
 
\####


>Its base and height are both equal to . It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size .

### Function Description

Complete the staircase function in the editor below.

staircase has the following parameter(s):

>int n: an integer
Print

Print a staircase as described above.

>Input Format

A single integer, , denoting the size of the staircase.

Constraints

0 < x < 100

>Output Format

Print a staircase of size  using # symbols and spaces.

Note: The last line must have  spaces in it.

Sample Input

6 
Sample Output

       #
      ##
/    ###

/   ####

/  #####

/ ######

## Explanation

> The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of .



#### Challenge 5

## Mini-Max Sum

>Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Example

The minimum sum is  and the maximum sum is . The function prints

16 24
Function Description

Complete the miniMaxSum function in the editor below.

miniMaxSum has the following parameter(s):

arr: an array of  integers
Print

Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.

Input Format

A single line of five space-separated integers.

Constraints


Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

The numbers are , , , , and . Calculate the following sums using four of the five integers:

Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Hints: Beware of integer overflow! Use 64-bit Integer.

Need help to get started? Try the Solve Me First problem
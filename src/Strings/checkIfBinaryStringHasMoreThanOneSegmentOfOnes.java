package Strings;
//https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
//1784. Check if Binary String Has at Most One Segment of Ones
//Easy
//Given a binary string s ​​​​​without leading zeros, return true​​​ if s contains at most one contiguous segment of ones. Otherwise, return false.
//Output: false
//Explanation: The ones do not form a contiguous segment.
//Input: s = "110"
//Output: true
public class checkIfBinaryStringHasMoreThanOneSegmentOfOnes {
    public static void main(String[] args) {
        System.out.println(checkOnesSegment("1001"));
    }
    public static boolean checkOnesSegment(String s) {
        return(!s.contains("01"));
    }
}

package Sorting;

import java.util.Arrays;

//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
//1491. Average Salary Excluding the Minimum and Maximum Salary
//You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
//Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.
//Input: salary = [4000,3000,1000,2000]
//Output: 2500.00000
//Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
//Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
public class AverageSalary {
    public static void main(String[] args) {
        int[] arr = {4000,2000,1000,3000};
        System.out.println(average(arr));
    }
    public static double average(int[] arr) {
        double avg = 0;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length -1; i++) {
            avg += arr[i];
        }
    return avg / (arr.length - 2);
    }
}

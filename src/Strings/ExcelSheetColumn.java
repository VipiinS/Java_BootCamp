package Strings;
//https://leetcode.com/problems/excel-sheet-column-title/
//168. Excel Sheet Column Title
//Easy
//Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
//A -> 1
//B -> 2
//C -> 3
//...
//Z -> 26
//AA -> 27
//AB -> 28...
//Input: columnNumber = 1
//Output: "A"
//Input: columnNumber = 28
//Output: "AB"
//Input: columnNumber = 701
//Output: "ZY"
public class ExcelSheetColumn {
    public static void main(String[] args) {
        System.out.println(convertToTitle(28));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        StringBuilder fin = new StringBuilder();

        while(columnNumber > 0){
            int rem = (columnNumber - 1) % 26; // the remainder will be tha alphabet after 26th alphabet
            ans.append((char)('A' + rem));
            columnNumber = (columnNumber - 1) / 26;
        }
        for (int i = ans.length() - 1; i >=0 ; i--) { // the 'ans' will be reversed,hence it is reversed again to get the original ans
            fin.append(ans.charAt(i));
        }
        return fin.toString();
    }
}

package Strings;
// https://leetcode.com/problems/count-items-matching-a-rule/
import java.util.List;
//You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
//The ith item is said to match the rule if one of the following is true:
//ruleKey == "type" and ruleValue == typei.
//ruleKey == "color" and ruleValue == colori.
//ruleKey == "name" and ruleValue == namei.
//Return the number of items that match the given rule.
public class CountItemsMatchingTheRules {
    public static void main(String[] args) {

    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int check;
        if(ruleKey.charAt(0) == 't') check = 0; // t for 'type'
        else if (ruleKey.charAt(0) == 'c') check = 1; // c for 'color'
        else check = 2;
        for (int i = 0; i < items.size(); i++) {
            if(ruleValue.equals(items.get(i).get(check))) count++;
        }
        return count;
    }
}

package com.wga.java.suanfa;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * LeetcodeService
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/5/5 11:33
 */
@Service
public class LeetcodeService {

    /**
     * Leetcode2
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order and each of their nodes contain a single digit.
     * Add the two numbers and return it as a linked list.
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1) {
            d.next = new ListNode(1);
        }
        return sentinel.next;
    }

    /**
     * Leetcode3
     * Given a string, find the length of the longest substring without repeating characters
     */
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }

    /**
     * Leetcode4
     * Find the median of the two sorted arrays.
     * The overall run time complexity should be O(log (m+n)).
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return 0;
    }

    /**
     * Leetcode5
     * Given a string s, find the longest palindromic substring in s.
     * You may assume that the maximum length of s is 1000.
     * 给定一个字符串s，找出s中最长的回文子串。
     * 可以假设s的最大长度为1000
     */
    private int lo, maxLen;
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < len-1; i++) {
            extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
            extendPalindrome(s, i, i+1); //assume even length.
        }
        return s.substring(lo, lo + maxLen);
    }

    /**
     * 判断是不是回文 j==k "bab"类型  k=j+1 "baab"类型的
     */
    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }

    /**
     * Leetcode6
     * The string "PAYPALISHIRING"
     * is written in a zigzag pattern on a given number of rows like this:
     * (you may want to display this pattern in a fixed font for better legibility)
     * 字符串“PAYPALISHIRING”在给定行数上以之字形书写，如下所示:
     * (您可能想要以固定字体显示此模式，以提高可读性)
     */
    public String convert(String s, int nRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[nRows];
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();

        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
                sb[idx].append(c[i++]);
            for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
                sb[idx].append(c[i++]);
        }
        for (int idx = 1; idx < sb.length; idx++)
            sb[0].append(sb[idx]);
        return sb[0].toString();
    }

    /**
     * Leetcode7
     * Given a 32-bit signed integer, reverse digits of an integer.
     *
     * Example 1:
     *
     * Input: 123
     * Output: 321
     * Example 2:
     *
     * Input: -123
     * Output: -321
     * Example 3:
     *
     * Input: 120
     * Output: 21
     */
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newresult = result * 10 + tail;
            if ((newresult - tail) / 10 != result) {
                return 0;
            }
            result = newresult;
            x/=10;
        }
        return result;
    }
//    public int reverse(int x) {
//        String str = String.valueOf(x);
//        char[] chars = str.toCharArray();
//        boolean isMinus = (chars[0] == '-');
//
//        char[] res = new char[chars.length];
//        int index = 0;
//        boolean startEnd = false;
//        int end = (isMinus ? 1 : 0);
//        for (int i = chars.length - 1; i >= end; i--) {
//            if (chars[i] == '0' && !startEnd) {
//                continue;
//            }
//            startEnd = true;
//            res[index] = chars[i];
//            index++;
//        }
//        String resStr = String.valueOf(res).trim();
//        if (StringUtils.isEmpty(resStr)) {
//            return 0;
//        }
//        return Integer.valueOf(resStr) * (isMinus ? -1 : 1);
//    }


    /**
     * leetcode8
     *The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
     *
     * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
     *
     * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
     *
     * If no valid conversion could be performed, a zero value is returned.
     *
     * Note:
     *
     * Only the space character ' ' is considered as whitespace character.
     * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.
     * Example 1:
     *
     * Input: "42"
     * Output: 42
     * Example 2:
     *
     * Input: "   -42"
     * Output: -42
     * Explanation: The first non-whitespace character is '-', which is the minus sign.
     *              Then take as many numerical digits as possible, which gets 42.
     * Example 3:
     *
     * Input: "4193 with words"
     * Output: 4193
     * Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
     * Example 4:
     *
     * Input: "words and 987"
     * Output: 0
     * Explanation: The first non-whitespace character is 'w', which is not a numerical
     *              digit or a +/- sign. Therefore no valid conversion could be performed.
     * Example 5:
     *
     * Input: "-91283472332"
     * Output: -2147483648
     * Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
     *              Thefore INT_MIN (−231) is returned.
     */
    public int myAtoi(String str) {
        if (str == null || str.isEmpty()) return 0;
        int sign = 1, base = 0, i = 0;
        str = str.trim();
//        while (str.charAt(i) == ' ')
//            i++;
        if (str.charAt(i) == '-' || str.charAt(i) == '+')
            sign = str.charAt(i++) == '-' ? -1 : 1;
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            base = base * 10 + (str.charAt(i++) - '0');
        }
        return sign * base;
        // TODO: 2019/6/21  

//        str = str.trim();
//        char[] chars = str.toCharArray();
//        char[] res = new char[chars.length];
//        for (int i = 0; i < chars.length; i++) {
//            if ((i == 0 && chars[i] == '-') || (chars[i] >= '0' && chars[i] <= '9')) {
//                res[i] = chars[i];
//            } else {
//                break;
//            }
//        }
//        String s = String.valueOf(res).trim();
//        int value = 0;
//        if (!"".equals(s)) {
//            value = Integer.valueOf(s);
//        }
//        return value;
    }
}

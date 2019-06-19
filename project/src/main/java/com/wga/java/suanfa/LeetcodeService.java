package com.wga.java.suanfa;

import org.springframework.stereotype.Service;

import java.util.HashMap;

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

        // TODO: 2019/6/19  
        return 0;
    }
}

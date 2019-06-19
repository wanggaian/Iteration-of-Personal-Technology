package com.wga.suanfa;

import com.wga.java.suanfa.LeetcodeService;
import com.wga.java.suanfa.ListNode;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * LeetcodeServiceTest
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/5/5 14:12
 */
@SpringBootTest
public class LeetcodeServiceTest {

    @Autowired
    private LeetcodeService leetcodeService = new LeetcodeService();

    /**
     * leetcode2
     * 2 -> 4 -> 3
     * 5 -> 6 -> 4
     * 8 -> 0 -> 7
     */
    @Test
    public void addTwoNumbersTest() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode res = leetcodeService.addTwoNumbers(l1, l2);
        System.out.println(res);
    }

    /**
     * Leetcode3
     */
    @Test
    public void lengthOfLongestSubstringTest() {
        String s = "pwwkewij";
        int length = leetcodeService.lengthOfLongestSubstring(s);
        System.out.println(length);
    }

    /**
     * Leetcode4
     */
    @Test
    public void findMedianSortedArraysTest() {

    }

    /**
     * Leetcode5
     */
    @Test
    public void longestPalindromeTest() {
        String s = "bacab";
        String res = leetcodeService.longestPalindrome(s);
        System.out.println(res);
    }

    /**
     * leetcode6
     */
    @Test
    public void convert() {
        String s = "PAYPALISHIRING";
        String res = leetcodeService.convert(s, 4);
        System.out.println(res);
    }

    /**
     * leetcode7
     */
    @Test
    public void reverse() {
        int num = -320;
        int res = leetcodeService.reverse(num);
        System.out.println(res);
    }
}

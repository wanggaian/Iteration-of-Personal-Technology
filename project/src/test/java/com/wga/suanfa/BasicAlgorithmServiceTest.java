package com.wga.suanfa;

import com.wga.java.suanfa.BasicAlgorithmService;
import org.junit.Test;

import java.util.Arrays;

/**
 * BasicAlgorithmServiceTest
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/6/21 15:07
 */
public class BasicAlgorithmServiceTest {

    /**
     * 1 bubble sort test
     */
    @Test
    public void bubbleSortTest() {
        int[] arr = new int[]{1, 3, 9, 6, 2, -5, -9};
        BasicAlgorithmService.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 2 select sort test
     */
    @Test
    public void selectSortTest() {
        int[] arr = new int[]{1, 3, 9, 6, 2, -5, -9};
        BasicAlgorithmService.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 3 insert sort test
     */
    @Test
    public void insertSortTest() {
        int[] arr = new int[]{1, 3, 9, 6, 2, -5, -9};
        BasicAlgorithmService.insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 4 merge sort test
     */
    @Test
    public void mergeSortTest() {
        int[] arr = new int[]{1, 3, 9, 6, 2, -5, -9};
        BasicAlgorithmService.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

package com.wga.java.suanfa;

import org.springframework.stereotype.Service;

/**
 * BasicAlgorithmService
 * 基本算法
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/6/21 14:25
 */
@Service
public class BasicAlgorithmService {

    /**
     * 1
     * bubbleSort
     * 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
     * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
     * 针对所有的元素重复以上的步骤，除了最后一个；
     * 重复步骤1~3，直到排序完成。
     *
     * 稳定性
     * 在相邻元素相等时，它们并不会交换位置，所以，冒泡排序是稳定排序。
     *
     * 适用场景
     * 冒泡排序思路简单，代码也简单，特别适合小数据的排序。但是，由于算法复杂度较高，在数据量大的时候不适合使用。
     *
     * 代码优化
     * 在数据完全有序的时候展现出最优时间复杂度，为O(n)。其他情况下，几乎总是O( n^2 )。
     * 因此，算法在数据基本有序的情况下，性能最好。
     * 要使算法在最佳情况下有O(n)复杂度，需要做一些改进，增加一个swap的标志，
     * 当前一轮没有进行交换时，说明数组已经有序，没有必要再进行下一轮的循环了，直接退出。
     */
    public static void bubbleSort(int[] arr) {
        int temp = 0;
        boolean swap;
        for (int i = arr.length -1; i > 0; i++) {
            swap = false;
            for (int j = 0; j < i; j++) {
                // 0 - i 判断 交换
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            // 一次未交换
            if (!swap) {
                break;
            }
        }
    }

    /**
     * 2 select sort
     * 在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
     * 从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
     * 重复第二步，直到所有元素均排序完毕。
     *
     * 稳定性
     * 用数组实现的选择排序是不稳定的，用链表实现的选择排序是稳定的。
     * 不过，一般提到排序算法时，大家往往会默认是数组实现，所以选择排序是不稳定的。
     *
     * 适用场景
     * 选择排序实现也比较简单，并且由于在各种情况下复杂度波动小，因此一般是优于冒泡排序的。
     * 在所有的完全交换排序中，选择排序也是比较不错的一种算法。
     * 但是，由于固有的O(n^2)复杂度，选择排序在海量数据面前显得力不从心。
     * 因此，它适用于简单数据排序。
     */
    public static void selectSort(int[] arr) {
        int temp, min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // 最小的不是i 交换
            if (min != i) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    /**
     * 3 insert sort
     * 把待排序的数组分成已排序和未排序两部分，初始的时候把第一个元素认为是已排好序的。
     * 从第二个元素开始，在已排好序的子数组中寻找到该元素合适的位置并插入该位置。
     * 重复上述过程直到最后一个元素被插入有序子数组中。
     *
     * 稳定性
     * 由于只需要找到不大于当前数的位置而并不需要交换，因此，直接插入排序是稳定的排序方法。
     *
     * 适用场景
     * 插入排序由于O( n^2 )的复杂度，在数组较大的时候不适用。
     * 但是，在数据比较少的时候，是一个不错的选择，一般做为快速排序的扩充。
     * 例如，在STL的sort算法和stdlib的qsort算法中，都将插入排序作为快速排序的补充，
     * 用于少量元素的排序。又如，在JDK 7 java.util.Arrays所用的sort方法的实现中，
     * 当待排数组长度小于47时，会使用插入排序。
     */
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int position = i;
            while (position > 0 && arr[position - 1] > value) {
                arr[position] = arr[position - 1];
                position--;
            }
            arr[position] = value;
        }
    }

    /**
     * 4 merge sort
     * 将序列每相邻两个数字进行归并操作，形成ceil(n/2)个序列，排序后每个序列包含两/一个元素
     * 若此时序列数不是1个则将上述序列再次归并，形成ceil(n/4)个序列，每个序列包含四/三个元素
     * 重复步骤2，直到所有元素排序完毕，即序列数为1
     *
     * 稳定性
     * 因为我们在遇到相等的数据的时候必然是按顺序“抄写”到辅助数组上的，所以，归并排序同样是稳定算法。
     *
     * 适用场景
     * 归并排序在数据量比较大的时候也有较为出色的表现（效率上），
     * 但是，其空间复杂度O(n)使得在数据量特别大的时候（例如，1千万数据）几乎不可接受。
     * 而且，考虑到有的机器内存本身就比较小，因此，采用归并排序一定要注意。
     */
    public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        internalMergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void internalMergeSort(int[] arr, int[] temp, int left, int right) {
        // left=right ok
        if (left < right) {
            int middle = (left + right) / 2;
            internalMergeSort(arr, temp, left, middle);  // 左子数组
            internalMergeSort(arr, temp, middle + 1, right);  // 右子数组
            mergeSortArray(arr, temp, left, middle, right);  // 合并排序数组
        }

    }

    private static void mergeSortArray(int[] arr, int[] temp, int left, int middle, int right) {
        int i = left;
        int j = middle + 1;
        int k = 0;
        while (i <= middle && j <= right) {
            temp[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
        }
        while (i <= middle) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        // 复制原数组数据
        for (i = 0; i < k; i++) {
            arr[left + i] = temp[i];
        }
    }


    /**
     *  5.quickSort
     *  $O(N*logN)$
     *  从数列中挑出一个元素，称为”基准”（pivot），
     * 重新排序数列，所有比基准值小的元素摆放在基准前面，所有比基准值大的元素摆在基准后面
     * （相同的数可以到任何一边）。在这个分区结束之后，该基准就处于数列的中间位置。
     * 这个称为分区（partition）操作。
     * 递归地（recursively）把小于基准值元素的子数列和大于基准值元素的子数列排序
     *
     * 稳定性
     * 快速排序并不是稳定的。这是因为我们无法保证相等的数据按顺序被扫描到和按顺序存放。
     *
     * 适用场景
     * 快速排序在大多数情况下都是适用的，尤其在数据量大的时候性能优越性更加明显。
     * 但是在必要的时候，需要考虑下优化以提高其在最坏情况下的性能。
     */
    public static void quickSort(int[] arr) {
        qSort(arr, 0, arr.length - 1);
    }

    private static void qSort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        // 获取基准位置
        int index = partition(arr, low, high);
        qSort(arr, low, index - 1);
        qSort(arr, index + 1, high);
    }

    private static int partition(int[] arr, int low, int high) {
        // 基准
        int pivot = arr[low];
        while (low < high) {
            // 找到比基准小的index -> high
            while (low < high && arr[high] >= pivot) --high;
            // 将此值赋予low
            arr[low] = arr[high];
            // 找到比基准大的index -> low
            while (low < high && arr[low] <= pivot) ++low;
            // 将此值赋予high
            arr[high] = arr[low];

            // 至 low = high while不执行退出循环
        }
        // 基准值赋予arr数组内
        arr[low] = pivot;
        // 返回基准位置
        return low;
    }
}

package mergeSortedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * Example 2:
 * <p>
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 * Example 3:
 * <p>
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explanation: The arrays we are merging are [] and [1].
 * The result of the merge is [1].
 * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 */
public class TaskMergeArray {

    public int[] nums1;
    private int[] nums2;

    private int leghtNums1;
    private int leghtNums2;

    public TaskMergeArray(int[] nums1, int m, int[] nums2, int n) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.leghtNums1 = m;
        this.leghtNums2 = n;
    }

    public static void mergeTwoArrays(int[] nums1, int m, int[] nums2, int n) {
        for(int j = 0, i = m; i < n+m; ++i, ++j){
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
        Arrays.stream(nums1).forEach(System.out::println);
    }

    public static void mergeTwoArrays(TaskMergeArray taskMergeArray){
        mergeTwoArrays(taskMergeArray.nums1, taskMergeArray.leghtNums1, taskMergeArray.nums2, taskMergeArray.leghtNums2);
    }

    private static void displayArray(List list) {
        list.stream().forEach(System.out::println);
    }
}

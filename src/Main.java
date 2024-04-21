import mergeSortedArray.TaskMergeArray;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        TaskMergeArray taskMergeArray = new TaskMergeArray(nums1, 3, nums2, 3);
        TaskMergeArray.mergeTwoArrays(taskMergeArray);
    }
}
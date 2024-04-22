import mergeSortedArray.TaskMergeArray;
import removeElement.TaskRemoveElement;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3,3,9};
        int[] nums2 = {2,5,6};
        //TaskMergeArray taskMergeArray = new TaskMergeArray(nums1, 3, nums2, 3);
        //TaskMergeArray.mergeTwoArrays(taskMergeArray);

        TaskRemoveElement taskRemoveElement = new TaskRemoveElement();
        taskRemoveElement.removeElement(nums1, 3);

    }
}
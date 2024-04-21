import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void mergeTwoArrays(int[] nums1, int m, int[] nums2, int n){
        int[] commonArray = new int[n+m];
        List<Integer> temporaryListNum1, temporaryListNum2 = new ArrayList<>(n+m);
        temporaryListNum1 = convertArrayToList(nums1);
        temporaryListNum2 = convertArrayToList(nums2);
        temporaryListNum1.addAll(temporaryListNum2);
        displayArray(temporaryListNum1);

    }

    public static List<Integer> convertArrayToList(int[] array) {
        List<Integer> temporaryListNum1 = new ArrayList<>(array.length);
        Collections.addAll(temporaryListNum1, Arrays.stream(array)
                .boxed()
                .toArray(Integer[]::new));
        return temporaryListNum1;
    }

    private static void displayArray(List list){
        list.stream().forEach(System.out::println);
    }
    public static void toCamelCase(String input){
       if(input.contains("-")){
           String[] inputSplitTab = input.split("-");
           for (int i = 1; i <= inputSplitTab.length; ++i) {
               if( i <= inputSplitTab.length ){
                   char singleCharacter = Character.toUpperCase(inputSplitTab[i + 1].charAt(0));
                   System.out.println(singleCharacter);

               }
           }
       }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 4};
        mergeTwoArrays(nums1, 4, nums2, 4);
    }
}
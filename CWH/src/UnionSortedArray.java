import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionSortedArray {
    public static  int[] unionArray(int[] nums1, int[] nums2) {
        Set<Integer> temp= new HashSet<>(); 
        for(int i =0;i<nums1.length;i++){
            temp.add(nums1[i]);
        }
        for(int i =0;i<nums2.length;i++){
            temp.add(nums2[i]);
        }
        int[] uni = new int[temp.size()];
        int i=0;
        for (Integer element : temp) {
            uni[i]=element;
            i++;
        }
        return uni;
       
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5}; 
        int[] nums2 = {1, 2, 7};
        System.out.println(Arrays.toString(unionArray(nums1,nums2)));
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class UnionSortedArray {
    public static  int[] unionArray(int[] nums1, int[] nums2) {
        ////Bruteforce approch 
        // Set<Integer> temp= new HashSet<>(); 
        // for(int i =0;i<nums1.length;i++){
        //     temp.add(nums1[i]);
        // }
        // for(int i =0;i<nums2.length;i++){
        //     temp.add(nums2[i]);
        // }
        // int[] uni = new int[temp.size()];
        // int i=0;
        // for (Integer element : temp) {
        //     uni[i]=element;
        //     i++;
        // }
        // return uni;

        //pointer method 
        int l1= nums1.length;
        int l2 = nums2.length;
        int i=1;
        int j=0;
        ArrayList<Integer> unionList = new ArrayList<>();
        unionList.add(nums1[0]);
        while (i<l1 && j<l2){
            if(nums1[i] < nums2[j] ){
                System.out.println("under i<j");
                if(unionList.get(unionList.size()-1)!= nums1[i]){
                    System.out.println("adding i "+nums1[i]);
                    unionList.add(nums1[i]);
                }
                i++;
            }
            else if(nums1[i] == nums2[j] ){
                System.out.println("equal");
                if(unionList.get(unionList.size()-1)!= nums1[i]){
                    unionList.add(nums1[i]);
                    System.out.println("adding equals "+nums1[i]);
                }
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){ // nums1[i] > nums2[j]
                System.out.println("under i>j");
                if(unionList.get(unionList.size()-1)!= nums2[j]){
                    System.out.println("adding j "+nums2[j]);
                    unionList.add(nums2[j]);
                }
                j++;
            }

        }
        while(j<l2){ // This loop handles remaining elements in nums2
            if(unionList.get(unionList.size()-1)!= nums2[j]){
                unionList.add(nums2[j]);
            }
            j++;
        }
        while(i<l1){ // This loop handles remaining elements in nums1
            if(unionList.get(unionList.size()-1)!= nums1[i]){
                unionList.add(nums1[i]);
            }
            i++;
        }

        System.out.println(unionList);
        int[] temp = new int[unionList.size()];
        int p=0;
        for(Integer element: unionList){
            temp[p]=element;
            p++;
        }
        return temp;
       
    }
    public static void main(String[] args) {
        int[] nums1 = {1,1,2,3,4,5,6,7};
        int[] nums2 = {2,3,4,4,5};
        System.out.println(Arrays.toString(unionArray(nums1,nums2)));
    }
}

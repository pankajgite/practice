import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class provides a utility to count the frequency of each element in an integer array.
 */
public class countFreArray {
    
   
    public static List<List<Integer>> countFrequencies(int[] nums) {
        // Create a HashMap to store each number and its corresponding frequency.
        // The key is the number from the array, and the value is its count.
        HashMap<Integer, Integer> hash = new HashMap<>();
        
        // Iterate over each number in the input array.
        for(int i=0;i<nums.length;i++){
            // If the number is already in our map, increment its count.
            if(hash.containsKey(nums[i])){
                hash.put(nums[i], hash.get(nums[i])+1);
            }else{
                // If the number is not in the map, add it with a count of 1.
                hash.put(nums[i], 1);
            }
        }
        
        // Create a list of lists to store the final output.
        List<List<Integer>> nestedList = new ArrayList<>();
        
        // Iterate over the keys (the unique numbers) in our frequency map.
        for(int i : hash.keySet()){
            // For each number, create a new inner list.
            List<Integer> innerList = new ArrayList<>();
            // Add the number itself to the inner list.
            innerList.add(i);
            // Add its frequency (the value from the map) to the inner list.
            innerList.add(hash.get(i));
            // Add the completed inner list [number, frequency] to our main list.
            nestedList.add(innerList);
        }
        // Return the final list of frequencies.
        return nestedList;
    }

    public static void main(String[] args) {
        
        // input: nums = [1, 2, 2, 1, 3]

        // Output: [[1, 2], [2, 2], [3, 1]]

        // Explanation:

        // - 1 appears 2 times

        // - 2 appears 2 times

        // - 3 appears 1 time

        // Order of output can vary.
        
        // Define the input array.
        int[] nums = {1, 2, 2, 1, 3};
        // Call the method to count frequencies.
        List<List<Integer>> output = countFrequencies(nums);
        // Print the result to the console.
        System.out.println(output);
    }
}

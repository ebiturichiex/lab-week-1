//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    // Main class
    public class Main {
        // Function to find the two numbers that sum to the target
        public static int[] twoSum(int[] nums, int target) {
            // Iterate over the array with two nested loops
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    // Check if the sum of nums[i] and nums[j] equals the target
                    if (nums[i] + nums[j] == target) {
                        // Return the indices of the two numbers
                        return new int[]{i, j};
                    }
                }
            }
            // If no pair is found, return an empty array (this part won't run as a solution is guaranteed)
            return new int[]{};
        }

        public static void main(String[] args) {
            // Test case as mentioned in question 3
            int[] nums = {-10, -5, -3, -4, -2};
            int target = -7;

            // Call the twoSum function
            int[] result = twoSum(nums, target);

            // Output the result
            if (result.length == 2) {
                System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
            } else {
                System.out.println("No solution found.");
            }
        }
    }



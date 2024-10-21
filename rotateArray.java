public class rotateArray {
    
        public void rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n; // Handle cases where k is greater than n
            reverse(nums, 0, n - 1); // Reverse the whole array
            reverse(nums, 0, k - 1); // Reverse the first k elements
            reverse(nums, k, n - 1); // Reverse the remaining elements
        }
        
        private void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    
        public static void main(String[] args) {
            rotateArray solution = new rotateArray();
            int[] nums = {1, 2, 3, 4, 5, 6, 7};
            int k = 3;
            
            solution.rotate(nums, k);
            
            // Print the rotated array
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
    
    
}

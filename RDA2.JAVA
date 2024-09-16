public RDA2 {
    public static int removeDuplicates(int[] nums) {
        // Edge case: empty array
        if (nums.length == 0) return 0;

        int i = 0; // Initialize index for placement of valid elements

        // Iterate through the array
        for (int j = 0; j < nums.length; j++) {
            // Allow up to 2 occurrences of each element
            if (i < 2 || nums[j] != nums[i - 2]) {
                nums[i++] = nums[j]; // Place element and increment index
            }
        }

        return i; // Return the length of the modified array
    }

    public static void main(String[] args) {
        // Example test cases
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int length1 = removeDuplicates(nums1);
        System.out.println("New length: " + length1); // Output: 5
        System.out.println("Modified array: " + java.util.Arrays.toString(java.util.Arrays.copyOf(nums1, length1)));

        
    }
}

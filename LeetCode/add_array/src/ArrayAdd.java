public class ArrayAdd {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int array1[] = {1,2,5,6};
        int array2[] = sol.twoSum(array1,11);
        for (int a : array2){
            System.out.println(a+" ");
        }
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
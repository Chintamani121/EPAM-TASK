package BytesPart2.Task3;

public class Main {
    static int findKthLargest(int[] nums, int k) {
        int index = nums.length - k;
        return quickSelect(nums, 0, nums.length - 1, index);
    }

    public void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 1;
        System.out.println("" + findKthLargest(nums, k));
    }

    private static int quickSelect(int[] nums, int left, int right, int k) {
        if(left==right) return nums[right];
        int pivot = partition(nums, left, right);
        if (pivot == k) return nums[pivot];
        else if (pivot > k) return quickSelect(nums, left,pivot-1,k);
        else return quickSelect(nums, pivot + 1,right,k);
    }

    private static int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        int j=left;
        for (int i = left+1 ; i <= right; i++) {
            if (pivot >= nums[i]) {
                j++;
                swap(nums,j,i);
            }
        }
        swap(nums,j,left);
        return j;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
         nums[j] = temp;
    }
}

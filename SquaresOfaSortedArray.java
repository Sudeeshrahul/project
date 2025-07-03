public class SquaresOfaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] numsdup = nums;
        for(int i = 0; i <= numsdup.length-1; i++)
        {
            numsdup[i] = i*i;
        }
        return numsdup;
        
    }
    public static void main(String[] args) {
        SquaresOfaSortedArray nums = new SquaresOfaSortedArray();
        int[] nums1 = {-4,-2,0,4,6,10};
        nums.sortedSquares(nums1);
        System.out.println(nums.sortedSquares(nums1));

    }
}

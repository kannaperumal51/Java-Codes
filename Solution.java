
class Solution {
    public static void main(String[] args) {
        int[][] ranges1 = {{1, 2}, {3, 4}, {5, 6}};
        int left1 = 2, right1 = 5;
        boolean result1 = new Solution().isCovered(ranges1, left1, right1);
        System.out.println(result1);
        int[][] ranges2 = {{1, 10}, {10, 20}};
        int left2 = 21, right2 = 21;
        boolean result2 = new Solution().isCovered(ranges2, left2, right2);
        System.out.println(result2); 
    }
    public boolean isCovered(int[][] ranges, int left, int right) {
       
        for (int i = left; i <= right; i++) {
            boolean isCovered = false;
            for (int[] range : ranges) {
                if (i >= range[0] && i <= range[1]) {
                    isCovered = true;
                    break; 
                }
            }
            if (!isCovered) {
                return false;
            }
        }
        return true;
    }
}

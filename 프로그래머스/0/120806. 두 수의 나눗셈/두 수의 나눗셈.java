class Solution {
    public int solution(int num1, int num2) {
        double result1 = (double)num1/num2;
        int result = (int)(result1*1000);
        
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num1 = 3;
        int num2 = 2;
        System.out.println(sol.solution(num1, num2));
    }
}
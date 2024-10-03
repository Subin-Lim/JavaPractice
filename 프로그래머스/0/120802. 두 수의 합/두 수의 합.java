class Solution {
    public int solution(int num1, int num2) {
        int result = 0;
        result = num1+num2;
        return result;
             
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num1 = 2;
        int num2 = 3;
        System.out.println(sol.solution(num1, num2));
    }
}
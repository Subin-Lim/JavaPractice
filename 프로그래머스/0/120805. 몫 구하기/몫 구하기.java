class Solution {
    public int solution(int num1, int num2) {
        int result = num1/num2;
        
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int numo = 10;
        int numt = 5;
        System.out.println(sol.solution(numo, numt));
    }
}
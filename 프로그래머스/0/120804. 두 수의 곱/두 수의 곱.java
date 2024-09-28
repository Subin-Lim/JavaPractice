class Solution {
    public int solution(int num1, int num2) {
        int result = num1*num2;
        
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int numo = 3;
        int numt = 4;
        System.out.println(sol.solution(numo, numt));
    }
}
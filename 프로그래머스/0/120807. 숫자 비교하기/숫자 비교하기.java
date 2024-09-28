class Solution {
    public int solution(int num1, int num2) {
        if(num1==num2){
            return 1;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int numo = 2;
        int numt = 3;
        System.out.println(sol.solution(numo, numt));
    }
}
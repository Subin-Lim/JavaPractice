class Solution {
    public int solution(int n) {
        int result = 0;
        for(int i = 0; i<=n; i++){
            if(i%2==0){
                result += i;
            }
        }
        return result;
             
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        System.out.println(sol.solution(n));
    }
}
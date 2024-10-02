class Solution {
    public int solution(int angle) {
        if(angle <90){
            return 1;
        }else if(angle==90){
            return 2;
        }else if(angle<180){
            return 3;
        }else if(angle==180){
            return 4;
        }else {
            return 5; 
        }         
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int angle = 70;
        System.out.println(sol.solution(angle));
    }
}
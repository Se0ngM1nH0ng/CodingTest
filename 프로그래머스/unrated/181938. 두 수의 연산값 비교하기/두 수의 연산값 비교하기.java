class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int aPlusb = Integer.parseInt(""+a+b);
        int result = 2*a*b;
        
        
        return aPlusb >= result ? aPlusb : result;
    }
}
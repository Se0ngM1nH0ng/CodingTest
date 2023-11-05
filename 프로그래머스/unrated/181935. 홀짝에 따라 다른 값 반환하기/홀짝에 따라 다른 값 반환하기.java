class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 0){ // 짝수
            for(int i=1; i<=n; i++){
                if(i % 2 == 0){
                    answer += Math.pow(i,2);
                }
            } 
        }
        else if(n % 2 == 1){ // 홀수 
            for(int i=1; i<=n; i++){
                if(i % 2 == 1){
                    answer += i;
                }
            }
        }
        return answer;
    }
}
// 홀수는 for문 안에서 if 조건 홀수만 찾기 ! 그리고 다 더하기 
// 짝수는 짝수를 먼저 찾고  Math.pow(밑, 지수) 다 더해주기 
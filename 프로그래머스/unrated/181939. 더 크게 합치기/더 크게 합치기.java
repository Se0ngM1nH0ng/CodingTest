class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String msgA = String.valueOf(a);
        String msgB = String.valueOf(b);
        
        int msgAtoB = Integer.parseInt(msgA + msgB);
        int msgBtoA = Integer.parseInt(msgB + msgA);
        
        if(msgAtoB > msgBtoA || msgAtoB == msgBtoA ){
            answer = msgAtoB;
        }
        else if(msgAtoB < msgBtoA){
            answer = msgBtoA;
        }
        
        return answer;
    }
}

// 1. 형변환 a,b 둘다 -> 합친다 a+b 한번 , b+a 한번
// 2. 둘을 비교해서 큰값 return 
// 3. 마지막으로 int 형변환


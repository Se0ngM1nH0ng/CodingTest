import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // 문자를 쪼개서 배열에 담는다.
        // 그 배열을 for문 돌려 출력하면서 
        // 아스키 코드로 소문자라면 대문자로 
        // 대문자라면 소문자로 !
        
        String[] msg = a.split("");
        char[] charMsg = new char[msg.length];
        char[] result = new char[msg.length];
        
        for(int i=0; i<msg.length; i++){
            charMsg[i] = msg[i].charAt(0);
            
            if(charMsg[i] >= 'A' && charMsg[i] <= 'Z'){
                result[i] = (char)(charMsg[i] + 32);
            }
            else if(charMsg[i] >= 'a' && charMsg[i] <= 'z'){
                result[i] = (char)(charMsg[i] - 32);     
            }
            else{
                result[i] = charMsg[i];
            }
        }
        System.out.println(new String(result));
        // char 타입은 int 로 자동 형변환이 된다. 
        // int 타입 -> char 는 강제 형변환
    }
}
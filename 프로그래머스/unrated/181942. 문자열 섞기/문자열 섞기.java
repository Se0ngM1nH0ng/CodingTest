class Solution {
    public String solution(String str1, String str2) {
        String result = "";

        int minLength = Math.min(str1.length(), str2.length());
    // Math.min(a, b) 함수는 주어진 a와 b 두 개의 숫자 중에서 작은 값을 반환하는 함수입니다. 
        for (int i = 0; i < minLength; i++) { // minLength 만큼
            result += str1.charAt(i); // str1 에 문자열 합치기
            result += str2.charAt(i); // str2 에 문자열 합치기 
        }

        if (str1.length() > str2.length()) { // str1길이가 더 크면 str2가 앞에 있다는 것
            result += str1.substring(minLength);
            // String substring(int beginIndex)
            // beginIndex는 추출을 시작할 인덱스를 나타냅니다. 이 인덱스를 포함하여 그 이후의 문자가 추출됩니다.
        } else if (str2.length() > str1.length()) { // str2의 길이가 더 크면 str1이 앞에 있다는것 
            result += str2.substring(minLength);
        }

        System.out.println('\"'+result+'\"');
        return result;
    }
}

//번갈아 가면서 뽑으면 되지 않을까 
// 앞에 a 가 있다면 b를 
// 앞에 b 가 있다면 a 를 
class Solution {
    public String solution(String s) {
        int length = s.length();
        int mid = length / 2;

        if (length % 2 == 0) {
            // 짝수 길이인 경우: 가운데 두 글자 반환
            return s.substring(mid - 1, mid + 1);
        } else {
            // 홀수 길이인 경우: 가운데 한 글자 반환
            return String.valueOf(s.charAt(mid));
        }
    }
}
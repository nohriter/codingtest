class Solution {
    public int solution(String s) {
        int count = 0;
        int i = 0;

        while (i < s.length()) {
            char x = s.charAt(i);
            int countX = 0;
            int countOther = 0;

            while (i < s.length()) {
                if (s.charAt(i) == x) {
                    countX++;
                } else {
                    countOther++;
                }
                i++;

                if (countX == countOther) {
                    break;
                }
            }

            count++;
        }

        return count;
    }
}
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] firstPart = Arrays.copyOfRange(num_list, 0, n);
        int[] secondPart = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] result = new int[num_list.length];

        System.arraycopy(secondPart, 0, result, 0, secondPart.length);
        System.arraycopy(firstPart, 0, result, secondPart.length, firstPart.length);

        return result;
    }
}
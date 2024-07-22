class Solution {
    public int solution(String binomial) {
      int result = 0;
        
        String[] arr = binomial.split(" ");
        
        int num1 = Integer.parseInt(arr[0]);
        int num2 = Integer.parseInt(arr[2]);
        
         switch (arr[1]) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
        }
        
        return result;
    }
}
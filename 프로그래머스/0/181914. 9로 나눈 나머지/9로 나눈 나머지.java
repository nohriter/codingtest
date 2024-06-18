import java.util.*;

class Solution {
    public int solution(String number) {
        int sum = number.chars()
            .map(Character::getNumericValue)
            .sum();
        
        return sum % 9;
    }
}
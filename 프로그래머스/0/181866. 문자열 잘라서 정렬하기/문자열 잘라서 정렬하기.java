import java.util.*;

class Solution {
    public String[] solution(String myString) {        
        String[] parts = myString.split("x");
        
        List<String> filteredList = new ArrayList<>();
        
        for (String part : parts) {
            if (!part.isEmpty()) {
                filteredList.add(part);
            }
        }
        
        String[] result = filteredList.toArray(new String[0]);
        Arrays.sort(result);
        
        return result;
    }
}
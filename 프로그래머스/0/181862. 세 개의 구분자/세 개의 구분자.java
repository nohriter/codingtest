import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        
        List<String> list = new ArrayList<String>();
        
        String[] temp = myStr.split("[abc]");
        
        for(int i=0; i<temp.length; i++) {
            if(temp[i].equals("")){
               continue; 
            }
            list.add(temp[i]);
        }
        
        if(list.size() == 0) {
            list.add("EMPTY");
        }
        
        return list.toArray(new String[0]);
    }
}
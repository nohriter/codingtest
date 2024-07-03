import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();
        boolean flag = false;

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                list = new ArrayList<>(Arrays.asList(str_list).subList(0, i));
                flag = true;
                break;
            } else if (str_list[i].equals("r")) {
                list = new ArrayList<>(Arrays.asList(str_list).subList(i + 1, str_list.length));
                flag = true;
                break;
            }
        }

        if (!flag) {
            return new String[0];
        }
        
        return list.stream().toArray(String[]::new);
    }
}
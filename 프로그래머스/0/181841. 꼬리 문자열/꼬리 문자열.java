class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder tailString = new StringBuilder();

        for (String str : str_list) {
            if (!str.contains(ex)) {
                tailString.append(str);
            }
        }

        return tailString.toString();
    }
}
class Solution {
    public int solution(String[] order) {
        int totalCost = 0;
        
        for (String item : order) {
            if (item.contains("americano") || item.equals("anything")) {
                totalCost += 4500;
            } else if (item.contains("cafelatte")) {
                totalCost += 5000;
            }
        }
        
        return totalCost;
    }
}
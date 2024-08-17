class Solution {
    public String[] solution(String[] picture, int k) {
        int originalHeight = picture.length;
        int originalWidth = picture[0].length();
        String[] enlargedPicture = new String[originalHeight * k];
        int index = 0;

        for (String row : picture) {
            StringBuilder enlargedRow = new StringBuilder();
            for (char pixel : row.toCharArray()) {
                for (int i = 0; i < k; i++) {
                    enlargedRow.append(pixel);
                }
            }
            String enlargedRowString = enlargedRow.toString();
            for (int i = 0; i < k; i++) {
                enlargedPicture[index++] = enlargedRowString;
            }
        }

        return enlargedPicture;
    }
}
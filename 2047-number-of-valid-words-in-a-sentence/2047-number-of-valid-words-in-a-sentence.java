class Solution {

    public int countValidWords(String sentence) {

        String[] words = sentence.trim().split("\\s+");
        int count = 0;

        for (String word : words) {

            if (word.length() == 0) {
                continue;
            }

            if (word.matches("[a-z]+(-[a-z]+)?[!.,]?|[a-z]*[!.,]")) {
                count++;
            }
        }

        return count;
    }
}
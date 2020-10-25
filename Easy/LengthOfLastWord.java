//Runtime: 2 ms, faster than 15.46% of Java online submissions for Length of Last Word.
//Memory Usage: 37.4 MB, less than 17.27% of Java online submissions for Length of Last Word.

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        for(int i = 0; i < s.length(); i++){
            if(!Character.isWhitespace(s.charAt(i)))
               length++;
            else
                length = 0;
        }
        return length;
    }
}
class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        int i = 0;
        int open = 0;
        StringBuilder sb = new StringBuilder();
        while (i < n) {
            char ch = s.charAt(i);
            if (ch == '(') {
                open++;
                sb.append(ch);
            } 
            else if (ch == ')') {
                if (open > 0) {
                    open--;
                    sb.append(ch);
                }
            } 
            else {
                sb.append(ch);
            }
            i++;
        }
        for (int j = sb.length() - 1; j >= 0 && open > 0; j--) {
            if (sb.charAt(j) == '(') {
                sb.deleteCharAt(j);
                open--;
            }
        }
        return sb.toString();
    }
}
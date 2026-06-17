class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];  //don't use paranthesis for array (arr.length). But for string use paranthesis (stringname.length()).
        int i=0;
        while(i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)){
            i++;
        }
        return first.substring(0,i);
    }
}

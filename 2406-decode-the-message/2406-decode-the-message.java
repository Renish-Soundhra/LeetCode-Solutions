class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map=new HashMap<>();
        char alpha='a';
        for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);
            if(!map.containsKey(ch) && ch!=' '){
                map.put(ch,alpha);
                alpha++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<message.length();i++){
            char ch=message.charAt(i);
            if(ch==' '){
                sb.append(' ');
            }
            else{
                sb.append(map.get(ch));
            }
        }
        return sb.toString();
    }
}
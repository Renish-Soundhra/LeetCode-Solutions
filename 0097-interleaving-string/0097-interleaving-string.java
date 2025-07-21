class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int i1=0,i2=0,i3=0;
        Boolean dp[][]=new Boolean[s1.length()+1][s2.length()+1];
        if(s3.length()!=s1.length()+s2.length()) return false;
        return isValid(i1,i2,i3,s1,s2,s3,dp);
    }
    private boolean isValid(int i1,int i2,int i3,String s1,String s2,String s3,Boolean dp[][]){
        if(i3==s3.length()){return true;}
        if(dp[i1][i2]!=null){return dp[i1][i2];}
        if(i1<s1.length() && i2<s2.length() && s1.charAt(i1)==s3.charAt(i3) && s2.charAt(i2)==s3.charAt(i3)){
            boolean result=isValid(i1+1,i2,i3+1,s1,s2,s3,dp);
            if(result){
                dp[i1][i2]=true;
                return true;
            }
            result=isValid(i1,i2+1,i3+1,s1,s2,s3,dp);
            dp[i1][i2]=result;
            return result;
        }
        else if(i2<s2.length() && s2.charAt(i2)==s3.charAt(i3)){
            boolean result= isValid(i1,i2+1,i3+1,s1,s2,s3,dp);
            if(i1<s1.length()){
                dp[i1][i2]=result;
            }
            return result;
        }
        else if(i1<s1.length() && s1.charAt(i1)==s3.charAt(i3)){
            boolean result= isValid(i1+1,i2,i3+1,s1,s2,s3,dp);
            if(i2<s2.length()){
                dp[i1][i2]=result;
            }
            return result;
        }
        else{
            if(i1<s1.length() && i2<s2.length()){
                dp[i1][i2]=false;
            }
            return false;
        }
    }
}
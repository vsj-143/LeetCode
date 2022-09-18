class Solution {
    public boolean rotateString(String s, String goal) {
        String s2=s+s;
        if(s2.indexOf(goal)!=-1 && s.length()==goal.length()){
            return true;
        }
  return false; }
}
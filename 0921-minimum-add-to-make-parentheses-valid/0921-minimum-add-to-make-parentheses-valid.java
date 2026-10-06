class Solution {
    public int minAddToMakeValid(String s) {
        int i =0, j=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                i++;
            }else{
                if(i>0){
                    i--;
                }else{
                    j++;
                }
            }
        }
        return j+i;
        
    }
}
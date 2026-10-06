class Solution {
    public boolean isValid(String s) {
        Stack<Character> S = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            //   opneing
            if(ch=='(' || ch == '[' || ch == '{'){
                S.push(ch);
            }else{  //closing
                if(S.isEmpty()){
                    return false;
                }
                if((S.peek() == '(' && ch == ')') ||
                 (S.peek() == '[' && ch == ']') ||
                 (S.peek() == '{' && ch == '}')){
                    S.pop();
                 } else{
                    return false;
                 }
            }
        }
        return S.isEmpty();
    }
}
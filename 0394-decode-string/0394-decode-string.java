class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        int number = 0;
        StringBuilder curr = new StringBuilder();

        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            // case1
            if(Character.isDigit(ch)){
                number = number*10 + (ch-'0');
            }
            else if(ch == '['){ // case 2
                countStack.push(number);
                stringStack.push(curr);

                number = 0;
                curr = new StringBuilder();
            }
            else if(ch ==']'){//case3
                int repeat = countStack.pop();
                StringBuilder prev = stringStack.pop();
                //
                for(int j =1; j<= repeat; j++){
                    prev.append(curr);
                }
                //sabse important
                curr = prev;
            }
            else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}
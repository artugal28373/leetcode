class Solution {
    public boolean isOpening(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }
                                                  
    public boolean isMatching( char ch1, char ch2) {
        if( ch1 == '(' && ch2 == ')') return true;
        if( ch1 == '{' && ch2 == '}') return true;
        if( ch1 == '[' && ch2 == ']') return true;
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length(); i++ ) {
            char ch = s.charAt(i);
            if( isOpening(ch) ) {
                st.push(ch);
            } else {
                if( st.isEmpty() ) {
                    return false;
                }
                if( !isMatching(st.peek(), ch)) {
                    return false;
                }
                st.pop();
                
            }
           
        }
        return st.isEmpty();
    }
}

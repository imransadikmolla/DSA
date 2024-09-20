class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty())
                st.push(ch);
            else{
             char peek=st.peek();
            if(( ch==')' && peek=='(' ) ||( ch=='}' && peek=='{' ) || ( ch==']' && peek=='['))
                st.pop();
            else
                st.push(ch);
                }
                                     }    
        if(st.isEmpty())
            return true;
        else
            return false;
    }
}

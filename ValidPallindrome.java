class ValidPallindrome {
    public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        while(start<=end)
        {
            char s1=s.charAt(start);
            char s2=s.charAt(end);
            if(!(Character.isDigit(s1) || Character.isAlphabetic(s1)))
            {
                start++;
            }
             else if(!(Character.isDigit(s2) || Character.isAlphabetic(s2)))
            {
                end--;
            }
            else{
            if(Character.toLowerCase(s1)==Character.toLowerCase(s2))
            {
                start++;
                end--;
            }
            else{
                return false;
            }
            }
        }
        return true;
    }
}

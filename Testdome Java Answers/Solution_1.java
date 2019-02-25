public class Palindrome {
    public static boolean isPalindrome(String word) {
        String fword = word;
        String bword = "";
        for(int i = fword.length() -1; i >=0; i--)
        {
            bword = bword + fword.charAt(i);
        }  
        return fword.equalsIgnoreCase(bword);
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
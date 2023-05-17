public class App {
    public static void main(String[] args) throws Exception {
        String str = "AmmA";
        System.out.println("Is \"" + str + "\" palindrome: " + isPalindrome(str));
    }

    public static boolean isPalindrome(String str)
    {
        String rev = "";
 
        boolean ans = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
 
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
}

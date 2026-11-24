// check if a number is a palindrome using recursion

public class NBRQustion3 {
    public static void main(String[] args) {
        Palindrome checkpal = new Palindrome();
        boolean result = checkpal.Checkpalindrome(121, 0);
        System.out.println(result);

    }
}
class Palindrome{
    
    int Original;
    public boolean Checkpalindrome(int number,int reverse ){
        Original = number;
      return helper(number,0);


    }
    private boolean helper(int number,int reverse){
        if(number == 0) return reverse == Original;

        int lastDigit = number % 10;
        reverse = reverse * 10 + lastDigit;
        return helper(number/ 10, reverse);
    }
}
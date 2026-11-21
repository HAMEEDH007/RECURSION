public class FoRquestion10 {
    public static void main(String[] args) {
        sumOfDigit sum = new sumOfDigit();
        int result = sum.sumofdigit(123,0);
        System.out.println(result);
    }
}
class sumOfDigit{
    public int sumofdigit(int number,int sum){
        if(number == 0)return sum;
        return sumofdigit(number /10, sum + (number % 10));

    }
}
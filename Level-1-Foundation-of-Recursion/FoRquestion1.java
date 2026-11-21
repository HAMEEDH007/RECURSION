// Print numbers from 1 to n using recursion.

public class FoRquestion1 { 
    public static void main(String[] args) {
        number num = new number();
        num.fun();
    }
}
class number{
    int number = 0;
    public int fun(){
        if(number == 10)return number;
        number++;
         System.out.println(number);
        fun();
       
        return number;
    }
}
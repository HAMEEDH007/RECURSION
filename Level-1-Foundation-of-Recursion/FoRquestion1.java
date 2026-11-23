// Print numbers from 1 to n using recursion.

public class FoRquestion1 { 
    public static void main(String[] args) {
        number num = new number();
        num.fun(1);
    }
}
class number{
    int number = 1;
    public void fun(int number){
        if(number == 11)return;
        System.out.println(number);
        number++;
         
        fun(number);
       
        return;
    }
}
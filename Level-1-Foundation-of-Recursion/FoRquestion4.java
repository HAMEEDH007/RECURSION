// Print only odd numbers from 1 to n recursively 
public class FoRquestion4 {
    public static void main(String[] args) {
        Odd odd = new Odd();
        odd.fun2(1,10);
    }
}
class Odd{
    
    public void fun2(int number,int n ){
        if(number >n){return;}
        if(number % 2 != 0){
            System.out.println(number);
        }
        fun2(number + 1,n);
        
    }
}
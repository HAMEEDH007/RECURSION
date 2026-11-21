public class FoRquestion3 {
    public static void main(String[] args) {
        Even even = new Even();
        even.fun2();
    }
}
class Even{
    int number = 0;
    public int fun2(){
        if(number == 10)return number;
        number++;
        if(number % 2 == 0){
            System.out.println(number);
        }
        fun2();
        return number;
    }
}
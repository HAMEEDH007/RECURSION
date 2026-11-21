public class FoRquestion2 {
    public static void main(String[] args) {
        number num = new number();
        num.fun();
    }
}

class number{
    int number = 10;
    public int fun(){
        if(number == 1) return number;
        System.out.println(number);
        number--;
        fun();
       
        
        return number;
    }
}
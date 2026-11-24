// Reverse a number recursively.

public class NBRQustion2 {
    public static void main(String[] args) {
        Reverse rev = new Reverse();
        int result = rev.reverse(1234, 0);
        System.out.println(result);
    }
}

class Reverse{
    int lastDigt =0;
    public int reverse(int number,int reverse){
        if(number == 0) return reverse;
        lastDigt = number % 10;
        reverse = reverse * 10 + lastDigt;
        return reverse(number /10,reverse);

    }
}
// Calculate the sum of the first n odd numbers recursively. 

public class NBRQustion9 {
    public static void main(String[] args) {
        SumOdd sum = new SumOdd();
        int result = sum.calculate(5);
        System.out.println(result);
    }
}

class SumOdd{
    public int calculate(int n){
        if(n == 0) return 0;
        return (2*n-1)+calculate(n-1);
    }
}
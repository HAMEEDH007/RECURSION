// Calculate the sum of the first n even numbers recursively. 
public class NBRQustion8 {
    public static void main(String[] args) {
        SumEven sum = new SumEven();
        int result = sum.calculate(5);
        System.out.println(result);
    }
}

class SumEven{
    public int calculate(int n){
        if(n == 0) return 0;
        return (2*n)+calculate(n-1);
    }
}
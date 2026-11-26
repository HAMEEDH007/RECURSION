// Find the product of digits of a number recursively

public class NBRQustion5 {
    public static void main(String[] args) {
        digitProduct df = new digitProduct();
        int result = df.dProduct(123);
        System.out.println(result);
    }
}

class digitProduct{
    int product = 1;
    int lastdigit = 1;

    public int dProduct(int number){
        if(number == 0) return 1;
        return (number % 10) * dProduct(number / 10);
    }
}
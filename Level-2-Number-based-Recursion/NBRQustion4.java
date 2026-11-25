// Find a GCD(HCF) of two numbers using Euild's algorithm recursively

public class NBRQustion4 {
    public static void main(String[] args) {
        GCD gcd = new GCD();
        int result = gcd.findGCD(48, 18);
        System.out.println(result);
    }
}

class GCD{
    public int findGCD(int first,int second){
        if(second == 0){
            return first;
        }

        return findGCD(second, first % second);
    }
}
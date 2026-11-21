public class FoRquestion7 {
    public static void main(String[] args) {
        Pow pow = new Pow();
        int result = pow.pow(2, 05);
        System.out.println(result);
    }
}

class Pow{
    public int pow(int x ,int n){
        if(n == 0) return 1;
        return x * pow(x, n -1);

    }
}
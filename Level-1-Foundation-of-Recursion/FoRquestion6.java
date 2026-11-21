public class FoRquestion6 {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        int result = fact.fact(1,1);
        System.out.println(result);
    }
}
class Factorial{
    public int fact(int first,int second){
        if(second == 11) return first;
        return fact(first *second,second + 1);
    }
}
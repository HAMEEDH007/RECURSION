public class FoRquestion5 {
    public static void main(String[] args) {
        sumNaturalNumber sumNatural = new sumNaturalNumber();
        int result = sumNatural.func(0,10);
        System.out.println(result);
    }
}
class sumNaturalNumber{
    public int func(int sum,int natural){
        if(natural < 0)return sum;
        return func(sum+(natural), natural -1);
        
    }
}
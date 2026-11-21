public class FoRquestion8 {
    public static void main(String[] args) {
        Fibbonnaci fabbo = new Fibbonnaci();
        int result = fabbo.fabbo(0, 1,0);
        System.out.println(result);
    }
}


class Fibbonnaci{
    
     public int fabbo(int first, int second,int count){
        if(count == 9) return first;
        
        return fabbo(second,first + second,count+1);
     }
}
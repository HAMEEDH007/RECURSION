public class NBRQustion1 {
    public static void main(String[] args) {
        Digitcount countt = new Digitcount();
        int result = countt.count(1234,0);
        System.out.println(result);
    }
}
class Digitcount{
    
    public int count(int number,int count ){
        
        if(number == 0)return count;
        count++;
        return count(number / 10,count);
    }
}
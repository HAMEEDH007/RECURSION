// Convert a number to binary recursively.

public class NBRQustion6 {
    public static void main(String[] args) {
        binaryNo binary = new binaryNo();
        binary.convert(10);
    }
}

class binaryNo{
    public void convert(int number ){
        if(number == 0) return;
        convert(number / 2);
        System.out.print(" "+number % 2);
    }
}
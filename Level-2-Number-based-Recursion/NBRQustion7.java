// Print digits of a number in words recursively(e.g.. 123 ---> "One Two Three")

public class NBRQustion7 {
    public static void main(String[] args) {
        Words words = new Words();
        words.printWords(1232);
    }
}

class Words{
    public void printWords(int number){
        if(number == 0) return;

        printWords(number / 10);

        int digit = number % 10;

        switch (digit) {
            case 0 -> System.out.print("ZERO ");
            case 1 -> System.out.print("ONE ");
            case 2 -> System.out.print("TWO ");
            case 3 -> System.out.print("THREE ");
            case 4 -> System.out.print("FOUR ");
            case 5 -> System.out.print("FIVE ");
            case 6 -> System.out.print("SIX ");
            case 7 -> System.out.print("SEVEN ");
            case 8 -> System.out.print("EIGHT ");
            case 9 -> System.out.print("NINE ");
        }
    }
}
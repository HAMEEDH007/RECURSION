public class FoRquestion9 {
    public static void main(String[] args) {
        FabboSeries fabbo = new FabboSeries();
        fabbo.fabbo(0, 1, 0);
    }
}

class FabboSeries{
    public void fabbo(int first,int second,int count){
        if(count == 10)return;

        System.out.println(second + " ");

        fabbo(second, first+second, count+1);
    }
}
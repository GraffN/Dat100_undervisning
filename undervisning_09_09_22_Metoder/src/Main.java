public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        bytte(13,45);
        bytte(20,3);
    }
    private static void bytte(int x,int y){
        System.out.println("x = " + x + "y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + "y = " + y);
    }
}
import java.sql.SQLOutput;

public class Ex {
    public static void main (String[] args){
        int res = division(10, 0);
        System.out.println(res);
    }

    public static int division (int x, int y) {
        if (y == 0) {
            return (int) -1e9;
        }

        return (x / y);
    }
}

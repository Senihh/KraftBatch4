package day_21;

public class C01_ {

    public static void main(String[] args) {

        int x = max2(5,10)*10;
        System.out.println(x);
        System.out.println("................");
        System.out.println(max(6, 8));
        System.out.println(max2(5,9));
        System.out.println(x);
    }

    public static int seven() {
        return 7;
    }

    public static int seven2() {

        int i = 0;
        while (true) {
            i++;
            if (i == 5) {
                continue;
            } else if (i == 7) {
                break;
            }
            System.out.println(i);
        }
        return i;
    }

    public static int max(int x, int y) {
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        return max;
    }

    public static int max2(int x, int y) {

        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}
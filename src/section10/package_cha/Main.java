package section10.package_cha;

import static section10.package_cha.Series.fib;

public class Main {
    public static void main(String[] args) {
        int fib_num = 5;
        for (int i=0;i<fib_num;i++){
            System.out.println(fib(i) + " ");
        }
        System.out.println(fib(6));
    }
}

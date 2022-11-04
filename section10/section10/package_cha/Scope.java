package section10.package_cha;

import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        X x = new X(new Scanner(System.in));
        x.x();
    }


}



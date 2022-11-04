package section10.package_cha;

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Enter a number: ");
        this.x = x.nextInt();
    }

    public void x(){
        for (int x =1;x<13;x++){
            System.out.println(x + " times " + x + " equals " + x *this.x);

        }
    }
}

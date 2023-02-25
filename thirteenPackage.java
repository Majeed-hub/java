import java.util.Scanner;

import calci.math;

public class thirteenPackage {
    public static void main(String[] args) {
        int a,b,ans;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter operator:");
        ch=sc.next().charAt(0);
        math o1 = new math();
        ans=o1.values(a, b, ch);
        System.out.println(ans);

    }
}

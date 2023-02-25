import java.util.Scanner;

class area {
    public static void main(String[] args) {
        final double pi = 3.142;
        double r,area,circum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of circle:");
        r=sc.nextDouble();
        area = pi * (r*r);
        circum = 2*pi*r;
        System.out.println("Area of circle = "+ area);
        System.out.println("Circumference of circle = "+circum);
    }
}
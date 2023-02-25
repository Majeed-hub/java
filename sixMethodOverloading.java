public class sixMethodOverloading {
    public static void main(String[] args) {
        Sum S = new Sum();
        System.out.println("Total = " + S.total(70, 90));
        System.out.println("Total = " + S.total(50,60,90));
        System.out.println("Total = " + S.total(7.5, 8.9));
    }
}

class Sum{
    int total(int i, int j){
        return i+j;
    }
    int total(int a,int b,int c){
        return a+b+c;
    }
    Double total(Double x, Double y){
        return x+y;
    }
}

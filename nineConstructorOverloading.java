public class nineConstructorOverloading {
    public static void main(String[] args) {
        room r1 = new room();
        System.out.println("Area of r1 object = " + r1.findArea());
        
        room r2 = new room(5);
        System.out.println("Area of r2 object = " +r2.findArea());
        
        room r3 = new room(5,7);
        System.out.println("Area of r3 object = " +r3.findArea());
    }
}

class room{
    int length,breadth;
    room(){
        length=0;
        breadth=0;
    }
    room(int l){
        length=1;
        breadth=1;
    }
    room(int l, int b){
        length=l;
        breadth=b;
    }
    int findArea(){
        return length*breadth;
    }
}

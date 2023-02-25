public class eightSingleInheritence {
    public static void main(String[] args) {
        room2 obj = new room2(10, 20, 30);
        int rarea,vol;
        rarea=obj.area();
        vol=obj.volume();
        System.out.println("Area = " + rarea);
        System.out.println("Volume = " + vol);
    }
}

class room1{
    int length,breadth;
    room1(int l, int b){
        length=l;
        breadth=b;
    }
    int area(){
        return length*breadth;
    }
}

class room2 extends room1{
    int ht;
    room2(int l,int b,int h){
        super(l, b);
        ht=h;
    }
    int volume(){
        return length*breadth*ht;
    }
}

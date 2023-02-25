public class tenMethodOverriding {
    public static void main(String[] args) {
        SBI s = new SBI();
        AXIS a = new AXIS();
        System.out.println("Interest Rate of SBI = " + s.getInterestRate());
        System.out.println("Interest Rate of AXIS = " + a.getInterestRate());
    }
}

class bank{
    int getInterestRate(){
        return 0;
    }
}
class SBI extends bank{
    int getInterestRate(){
        return 9;
    }
}
class AXIS extends bank{
    int getInterestRate(){
        return 7;
    }
}

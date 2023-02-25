package calci;

public class math{
    public int values(int x,int y,char choice){
        switch (choice) {
            case '+':
                return x+y;
        
            case '-':
                return x-y;
        
            case '*':
                return x*y;
        
            case '/':
                return x/y;
        
            default:
                System.out.println("Invalid");
                break;
        }
        return choice;
    }
    
}

class threePrime {
    public static void main(String[] args) {
        int n= Integer.parseInt(args[0]);
        int i,j;
        for(i=0;i<n;i++){
            for(j=2;j<i;j++){
                if(i%j==0)
                    break;
            }
            if ((i==j)|| (i==1)) {
                System.out.println(i);
            }
        }
    }
}

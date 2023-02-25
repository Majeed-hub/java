public class fiveSorting {
    public static void main(String[] args) {
        int i,j,n;
        n=args.length;
        int arr[] = new int[n];

        for(i=0;i<n;i++){
            arr[i]=Integer.parseInt(args[i]);
        }

        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("After Sorting");
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}

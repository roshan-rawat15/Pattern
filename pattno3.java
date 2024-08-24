public class pattno3 {
    public static void main(String[] args) {
        int n =5;
        int no = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(no+" ");
                no++; //no = no+1
            }
            System.out.println();
        }
    }
    
}

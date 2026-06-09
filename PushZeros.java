public class PushZeros{
    public static void main(String[] args) {
        int[] a = {0,1,2,0,0,0};
        int n = 6;
        int[] b = new int[n];
        int k = 0;
        for(int i=0; i<n; i++){
            if(a[i]!=0){
                b[k++] = a[i];
            }
        }
        for(int i=0; i<n; i++){
            if(a[i] == 0){
                b[k++] = a[i];
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(b[i]+" ");
        }

    }
}




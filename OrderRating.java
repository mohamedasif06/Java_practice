import java.util.Scanner;
public class OrderRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] orders = new int[5];
        
        int i=0;
        while(i<5){
            System.out.print("Rating for order "+(i+1)+" : ");
            int c = sc.nextInt();
            boolean terminate = false;
            if(c<=0 || c>5){
                System.out.println("Invalid Rating.");
                terminate = true;
                
            }
            if(!terminate){
                orders[i] = c;
                i++;
            }
            
        }
        int tot = 0;
        
            for(i=0; i<5; i++){
                    tot += orders[i]; 
            }
            
            float avg = (float)tot/5;
            System.out.printf("Average Rating: %.1f\n",avg);
            if(avg > 3.8){
                System.out.println("Offer available.");
            }else{
                System.out.println("Offer not available.");
            }
        
        
    }
}

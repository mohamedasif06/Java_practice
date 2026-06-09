import java.util.*;
public class FuelConsp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of litres: ");
        float l = sc.nextFloat();
        System.out.println("Distance covered: ");
        float d = sc.nextFloat();
        if(d <= 0 || l <= 0){
            System.out.println("Invalid.");
        }
        else{
            float hundred_kms = (l/d) * 100;
            //converting to miles
            float miles = d * 0.6214f;
            //converting to gallons
            float gallons  = l * 0.2642f;
            float mpg = miles/gallons;
            System.out.printf("For 100kms: %.2f \n", hundred_kms);
            System.out.printf("miles/gallons: %.2f\n",mpg);
        }
    }
}

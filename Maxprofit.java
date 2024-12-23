import java.util.*;
public class Maxprofit{
    public static int Maxprofits(int price[]){
        int Maxprofit = 0;
        int minprice  = Integer.MAX_VALUE;
        
        for(int i =1;i<price.length;i++){
            // profit = selling price - cost price
            if(price[i]<minprice){
                 minprice = price[i];
            }
            int profit = price[i]-minprice;

            Maxprofit = Math.max(Maxprofit, profit);
        }
        return Maxprofit;
    }
    public static void  main(String args[]){
        int price[] = {7,1,5,3,6,4};
       System.out.println(Maxprofits(price));
        

    }
}

import java.util.Scanner;


public class Invoice {
    
    public static void main(String[]args) {
        
        Scanner input = new Scanner (System.in);
            
        System.out.print ("Part number: " );
          String partNumber = input.nextLine();
           
        System.out.print ("Discription: " );
          String discription = input.nextLine();
           
        System.out.print ("quantity: " );
          int quantity = input.nextInt();
       
        System.out.print ("Price: " );
          double price = input.nextDouble();
      
        double getInvoicesAmount = quantity * price;
        
        if (quantity < 0){
                quantity = 0;
        }
        
        if (price < 0){ 
            price = 0.0;
        }
        System.out.println("total invoice ammount is $"+ getInvoicesAmount);
    }
}
   
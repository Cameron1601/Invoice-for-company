package invoiceproject;


import java.util.Scanner;

public class InvoiceTest{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String partNumber;
        String partDescription;
        int quantity;
        double price;
        
        //Creating 2 invoice Objects  
        Invoice invoiceOne = new Invoice();
        Invoice invoiceTwo = new Invoice();
        
        //Invoice one detail
        System.out.println("Invoice 1");
        System.out.print ("Enter the part number: ");
        partNumber = input.nextLine();
        
        System.out.print("Enter the part description: ");
        partDescription = input.nextLine();
        
        System.out.print("Enter the quantity: ");
        quantity = input.nextInt();
        
        System.out.print("Enter the price: ");
        price= input.nextDouble();
        
        System.out.println("");
        
        //Set functions for invoice One
        
        invoiceOne.setPartNumber(partNumber);
        invoiceOne.setPartDescription(partDescription);
        invoiceOne.setQuantity(quantity);
        invoiceOne.setPricePerItem(price);
        
        // invoice Two details
        
        System.out.println("Invoice 2");
        System.out.print ("Enter the part number: ");
        input.nextLine();
        partNumber = input.nextLine();
        
        System.out.print("Enter the part description: ");
        partDescription = input.nextLine();
        
        System.out.print("Enter the quantity: ");
        quantity = input.nextInt();
        
        System.out.print("Enter the price: ");
        price= input.nextDouble();
        
        //Set function for Invoice Two
        
        invoiceTwo.setPartNumber(partNumber);
        invoiceTwo.setPartDescription(partDescription);
        invoiceTwo.setQuantity(quantity);
        invoiceTwo.setPricePerItem(price);
        
        //Print invoice One Info
        System.out.println ("Invoice One Information");
        System.out.println("part number: " + invoiceOne.getPartNumber());
        System.out.println("Description: " + invoiceOne.getPartDescription());
        System.out.println("Quantity: " + invoiceOne.getQuantity());
        System.out.println("Price: $" + invoiceOne.getPricePerItem());
        System.out.printf("invoice total ammount: $%.2f", invoiceOne.getInvoiceAmount());
        System.out.println();
        
        // invoice Two info
        
        System.out.println ("Invoice Two Information");
        System.out.println("part number: " + invoiceTwo.getPartNumber());
        System.out.println("Description: " + invoiceTwo.getPartDescription());
        System.out.println("Quantity: " + invoiceTwo.getQuantity());
        System.out.println("Price: $" + invoiceTwo.getPricePerItem());
        System.out.printf("invoice total ammount: $%.2f", invoiceTwo.getInvoiceAmount());   
    }
}

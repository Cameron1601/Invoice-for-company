package invoiceproject;

// Invoice Class for InvoiceTest to use

public class Invoice{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice()
    {  //setting default values
        partNumber = "None";
        partDescription = "None";
        quantity = 0;
        pricePerItem = 0.0;
    }
    
    // Get Methods
    
    public String getPartNumber(){
        return partNumber;
    }
    
    public String getPartDescription(){
        return partDescription;
    }
     
    public int getQuantity(){
        return quantity;
    }
      
    public double getPricePerItem(){
        return pricePerItem;
    }
    
    // Set Methods
    
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    
    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }
 
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public void setPricePerItem(double pricePerItem){
        this.pricePerItem = pricePerItem;
    }
    
    // Return Invoice Ammount
    
    public double getInvoiceAmount(){
        return quantity * pricePerItem;
    } 
}
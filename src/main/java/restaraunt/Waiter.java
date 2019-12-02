package restaraunt;

import javax.swing.JOptionPane;

public class Waiter {
     
    static double orderTotal = 54.98;
    private double totalSales;
    private double totalCard;
    private double totalCash;
    private double id;                
        
    public Waiter(double idNum) {
        totalSales = 0;
        totalCard = 0;
        totalCash = 0;
        id = idNum;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getTotalCard() {
        return totalCard;
    }

    public void setTotalCard(double totalCard) {
        this.totalCard = totalCard;
    }

    public double getTotalCash() {
        return totalCash;
    }

    public void setTotalCash(double totalCash) {
        this.totalCash = totalCash;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }
    
    //This method will be called by the POS.java to process cash payments and output change due
    public String handleCashPayment(double paymentAmount){  
        //TO-DO: Think about how to grab an actual order total
        //TO-DO: Consider where to destroy the order stuff
        double totalCashPayment;
        double changeDue;
        totalCashPayment = paymentAmount;                                   //this will grab the double thats passed in
        if(totalCashPayment > 0 && totalCashPayment >= orderTotal){         //this makes sure that the amount is both positive, and at least equal to the order amount 
            changeDue = orderTotal - totalCashPayment;                      //calculate change due   
            changeDue = Math.abs(changeDue);                                //get rid of the negative sign
            String changeDueText = String.format("$" + "%.2f", changeDue);  //capture the double in a formatted string
            return changeDueText;                                           //return the formatted string
        }
        return "Woops";                                                     //if it fails return this
    }
    
    //This method will be called by the POS.java to process credit card payments and output results
    public String handleCreditPayment(double paymentAmount){
        double totalCardAmount = paymentAmount + orderTotal;                    //totalCardAmount will grab the paymentAmount (tip) and add it to order total
        String totalCardString = String.format("$" + "%.2f", totalCardAmount);  //format the string
        return totalCardString;                                                 //return formatted string
    }     
    
    public void updateReportCash(double amount){
        double reportAmount = amount;
        
        totalSales += reportAmount;
        totalCash += reportAmount;
        
    }
    
    public void updateReportCard(double amount){
        double reportAmount = amount;
        
        totalSales += reportAmount;
        totalCard += reportAmount;
    }
    
    public void runReport(String name){
        String serverName = name;
        JOptionPane.showMessageDialog(null, "Server: " + serverName + "\nTotal Sales: " + totalSales + "\nCard Sales: " + totalCard + "\nCash Sales: " + totalCash);
    }
}

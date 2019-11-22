package restaraunt;
public class Waiter {
     
    static double orderTotal = 54.98;
    
    public Waiter() {
        double totalSales;
        double totalCard;
        double totalCash;
        double cardTips;
    }
    
    Waiter testServer = new Waiter();
    
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
    
}

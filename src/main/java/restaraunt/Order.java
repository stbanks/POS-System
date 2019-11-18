package restaraunt;
import java.util.ArrayList;

public class Order {
    private Table relatedTable;
    private Waiter relatedWaiter;
    private Customer relatedCustomer;
    private ArrayList<Food> order = new ArrayList<Food>();


    public Order(Table table,  ArrayList<Food> foodList, Customer customer){
        relatedTable = table;
        order = foodList;
        relatedCustomer = customer;
        


    }
    public Customer getCustomer(){
        return relatedCustomer;
    }
    
   
}

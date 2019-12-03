package restaraunt;
import java.util.ArrayList;

public class Order {
    private int tableId;
    private Waiter relatedWaiter;
    private int seatId;
    private ArrayList<Food> order = new ArrayList<Food>();


    public Order(int tableId,  ArrayList<Food> foodList, int seatId){
        this.tableId= tableId;
        this.order = foodList;
        this.seatId = seatId;
        


    }
    public void addToOrder(int tableId, Food tempList, int customerId){
     
    }
  
    public ArrayList<Food> getOrder(){
        return order;
    }
}

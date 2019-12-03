package restaraunt;
import java.util.ArrayList;

public class Order {
     int tableId;
     int seatId;
     ArrayList<Food> order = new ArrayList<>();


    public Order(int tableId,  ArrayList<Food> foodList, int seatId){
        this.tableId= tableId;
        order = foodList;
        this.seatId = seatId;
        


    }public Order(int tableId,  int seatId){
        this.tableId= tableId;
        this.seatId = seatId;
        


    }
    
    public void addToOrder(Food tempFood){
     this.order.add(tempFood);
    }
  
    public void setOrder(ArrayList<Food> foodTempList){
        order = foodTempList;
    }
    
    public ArrayList<Food> getOrder(){
        return order;
    }
    public void updateOrder(ArrayList<Food> tempList){
        
        this.order = tempList;
    }
    
    public void clearOrder(){
        this.order.clear();
    }
    
    public void removeFromOrder(Food remove){
       order.remove(remove);
    }
            
}

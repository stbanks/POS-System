package restaraunt;

public class Table {
 
    private int id;
    private int tableNumber;                //Should we separate id(perhaps being for server of the table) and tableNumber, just to identify which table has been selected
    private int seats;
    private Order order;
    //TO-DO: Make sure that when "Send/Exit" is pressed, it creates a table. This table should be able to be brought back up when that table is pressed again,
    //and shouldn't be accessible by other servers. Perhaps create a table with a placeholder order and make sure it can be pulled up again after "send/exit".
    //TO-DO: Work the payment process to make sure it can essentially 'destroy' the table after it has been paid for

    //constructor
    public Table(int Id, int tblNum, int Seats) {
        id = Id;
        seats = Seats;
        tableNumber = tblNum;   //grab the table number passed in eg. "50", "60", etc
    }

    public Table getTable(){
        return this;
    }

    public int getSeats() {
        return seats;
    }
  

    public int getId() {
        return id;
    }

    public void setOrder(Order order)
    {
        this.order = order;
    }
    public void setSeats(int newSeats){
        this.seats = newSeats;
    }
  


    public Order getOrder() {
        return order;
    }

}
//made a change here
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaraunt;

/**
 *
 * @author MSI RMA
 */

public class Customer {
    private Order relatedOrder;
    private Table relatedTable;
    private Waiter relatedWaiter;
    
    public Customer(Order order, Table ascTable, Waiter ascWaiter){
        relatedOrder = order;
        relatedTable = ascTable;
        relatedWaiter = ascWaiter;
        
    }
    
    public Order getOrder(){
        return relatedOrder;
    }
    public void setOrder(Order order){
        relatedOrder = order;
    }
    public Table getTable(){
        return relatedTable;
    }
    public void setTable(Table table){
        relatedTable = table;
    }
}

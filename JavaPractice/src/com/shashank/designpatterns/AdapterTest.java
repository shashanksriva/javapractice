package com.shashank.designpatterns;

public class AdapterTest {
    
    public static void main(String...strings) {
        ZomatoOrderI order = getOrderObject();

        if (order instanceof ZomatoOrderI) {
            order.getOrder();
        }
        
    }
    
    private static ZomatoOrderI getOrderObject() {
        //Fetch order from network or a file
        return null;
    }

}

interface ZomatoOrderI{
    
    String getOrder();
}

class ZomatoOrderImpl implements ZomatoOrderI {

    @Override
    public String getOrder() {
        return "Order from Zomato";
    }
    
}

class SwiggyOrder {
    
    public String getSwiggyOrder() {
        return "Order from Swiggy";
    }
    
}

class SwiggyOrderAdapter implements ZomatoOrderI{
    
    SwiggyOrder swiggyOrder;
    
    public SwiggyOrderAdapter(SwiggyOrder order) {
        this.swiggyOrder = order;
    }

    @Override
    public String getOrder() {
        return swiggyOrder.getSwiggyOrder();
    }
    
}
package com.shashank.designpatterns;

public class PizzaOrderMachine {

 public static void main(String...strings) {
        
        PizzaI pizza = new FarmHousePizza();
        
        pizza = new FreshTomato(pizza);
        pizza = new FreshCorns(pizza);
        pizza = new OnionRings(pizza);
        pizza = new FreshTomato(pizza);
        
        System.out.println("--------- Order Summary --------------");
        System.out.println("Pizza info: " + pizza.getDescription());
        System.out.println("Total Pizza cost: "  + pizza.getCost());
        
    }
}

interface PizzaI {

    String getDescription();
    
    int getCost() ;

}

class FarmHousePizza implements PizzaI {

    String description = "Farm house Pizza";
    
    public String getDescription() {
        return description + "(" + getCost() + ")";
    }

    public int getCost() {
        return 300;
    }

}
 
class CountrySpecial implements PizzaI{

    @Override
    public String getDescription() {
        return "Country Special";
    }

    @Override
    public int getCost() {
        return 0;
    }
    
}

abstract class Toppings implements PizzaI {
    
    public Toppings(PizzaI pizza) {
        
    }
    
}

class FreshTomato extends Toppings {

    private PizzaI pizza;

    public FreshTomato(PizzaI pizza) {
        super(pizza);
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Tomato" + "(" + getCost() + ")";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 30;
    }
    
}

class OnionRings extends Toppings {

    private PizzaI pizza;

    public OnionRings(PizzaI pizza) {
        super(pizza);
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Onion Rings" + "(" + getCost() + ")";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }
}

class FreshCorns extends Toppings {
    
    private PizzaI pizza;

    public FreshCorns(PizzaI pizza) {
        super(pizza);
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Fresh Corns" + "(" + getCost() + ")";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 40;
    }
    
}


/**
class FarmHousePizza implements Pizza {
    
    public CheesePizza(Capscicum caps, Jalapeno jal, Tomato tomato, Olives olives,.. //so on) {
        
    }

    public String getDescription() {
        return "Paneer" + caps.getDescription() + jal.getDescription() + //..so on;
    }

    public int getCost() {
            int totalToppingsCost = 0;
            if (hasJalapeno() )
                totalToppingsCost += jalapenoCost;
            if (hasCapsicum() )
                totalToppingsCost += capsicumCost;

            // similarly for other toppings
            return totalToppingsCost;
    }
    
}

**/
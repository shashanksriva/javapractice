package com.shashank.designpatterns;

import java.util.Scanner;

public class ATMChainOfResponsibility {

    private DispenserLink chain1;

    public ATMChainOfResponsibility() {
        // Initialise the chain
        chain1 = new Rs2000Dispenser();
        DispenserLink chain2 = new Rs500Dispenser();
        DispenserLink chain3 = new Rs200Dispenser();
        DispenserLink chain4 = new Rs100Dispenser();

        // Set links of responsibility chain
        chain1.setNextDispenserHandler(chain2);
        chain2.setNextDispenserHandler(chain3);
        chain3.setNextDispenserHandler(chain4);
    }

    public static void main(String[] args) throws Exception{
        ATMChainOfResponsibility atmDispenser = new ATMChainOfResponsibility();
        
        int amount = 0;
        System.out.println("Enter amount to dispense");
        Scanner input = new Scanner(System.in);
        amount = input.nextInt();
        if (amount % 100 != 0) {
            System.out.println("Amount should be in multiple of 100s.");
        }
        input.close();
        // process the request
        atmDispenser.chain1.dispenseHandler(new Rupees(amount));

    }
}


final class Rupees {
    
    private int amount;

    public Rupees(int amount) {
        this.amount = amount;
    }
    
    public int getAmount() {
        return amount;
    }
}

interface DispenserLink {
    
    void setNextDispenserHandler(DispenserLink dispLink);
    
    void dispenseHandler(Rupees rs);
}


class Rs2000Dispenser implements DispenserLink {
    

    private DispenserLink link;
    private final int denomination = 2000;

    @Override
    public void setNextDispenserHandler(DispenserLink dispLink) {
        this.link = dispLink;
    }

    @Override
    public void dispenseHandler(Rupees rs) {
        if(rs.getAmount() >= denomination){
            int num = rs.getAmount()/denomination;
            int remainder = rs.getAmount() % denomination;
            System.out.println("Dispensing "+num+ " " + denomination + "note");
            if(remainder !=0) this.link.dispenseHandler(new Rupees(remainder));
        }else{
            this.link.dispenseHandler(rs);
        }
    }
    
}

class Rs500Dispenser implements DispenserLink {

    private DispenserLink link;
    private final int denomination = 500;

    @Override
    public void setNextDispenserHandler(DispenserLink dispLink) {
        this.link = dispLink;
    }

    @Override
    public void dispenseHandler(Rupees rs) {
        if(rs.getAmount() >= denomination){
            int num = rs.getAmount()/denomination;
            int remainder = rs.getAmount() % denomination;
            System.out.println("Dispensing "+num+ " " + denomination + "note");
            if(remainder !=0) this.link.dispenseHandler(new Rupees(remainder));
        }else{
            this.link.dispenseHandler(rs);
        }
    }
    
}

class Rs200Dispenser implements DispenserLink {

    private DispenserLink link;
    private final int denomination = 200;
    

    @Override
    public void setNextDispenserHandler(DispenserLink dispLink) {
        this.link = dispLink;
    }

    @Override
    public void dispenseHandler(Rupees rs) {
        if(rs.getAmount() >= denomination){
            int num = rs.getAmount()/denomination;
            int remainder = rs.getAmount() % denomination;
            System.out.println("Dispensing "+num+ " " + denomination + "note");
            if(remainder !=0) this.link.dispenseHandler(new Rupees(remainder));
        }else{
            this.link.dispenseHandler(rs);
        }
    }
    
}

class Rs100Dispenser implements DispenserLink {

    private final int denomination = 100;
    private DispenserLink link;

    @Override
    public void setNextDispenserHandler(DispenserLink dispLink) {
        this.link = dispLink;
    }

    @Override
    public void dispenseHandler(Rupees rs) {
        if(rs.getAmount() >= denomination){
            int num = rs.getAmount()/denomination;
            int remainder = rs.getAmount() % denomination;
            System.out.println("Dispensing "+num+ " " + denomination + "note");
            if(remainder != 0) 
                this.link.dispenseHandler(new Rupees(remainder));
        }else{
            this.link.dispenseHandler(rs);
        }
    }
}


package com.shashank.designpatterns;

import java.util.Scanner;

public class ATMClient {

    private DispenserLinkI chain1;

    public ATMClient() {
        // Initialise the chain
        chain1 = new Rs2000Dispenser();
        DispenserLinkI chain2 = new Rs500Dispenser();
        DispenserLinkI chain3 = new Rs200Dispenser();
        DispenserLinkI chain4 = new Rs100Dispenser();

        // Set links for Chain of Responsibility
        chain1.setNextDispenserHandler(chain2);
        chain2.setNextDispenserHandler(chain3);
        chain3.setNextDispenserHandler(chain4);
    }

    public static void main(String[] args) throws Exception{
        ATMClient atmDispenserClient = new ATMClient();
        sendRequestToChains(atmDispenserClient);
    }
    
    private static void sendRequestToChains(ATMClient atmDispenser) {
        System.out.println("Enter amount to dispense");
        Scanner input = new Scanner(System.in);
        Rupees amount = new Rupees(input.nextInt());
        if (amount.getAmount() % 100 != 0) {
            System.out.println("Amount should be in multiple of 100s.");
        }
        input.close();
        // process the request by sending the request to first chain
        atmDispenser.chain1.dispenseHandler(amount);
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

interface DispenserLinkI {
    
    void setNextDispenserHandler(DispenserLinkI dispLink);
    
    void dispenseHandler(Rupees rs);
}


class Rs2000Dispenser implements DispenserLinkI {
    
    private DispenserLinkI link;
    private final int denomination = 2000;

    @Override
    public void setNextDispenserHandler(DispenserLinkI dispLink) {
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

class Rs500Dispenser implements DispenserLinkI {

    private DispenserLinkI link;
    private final int denomination = 500;

    @Override
    public void setNextDispenserHandler(DispenserLinkI dispLink) {
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

class Rs200Dispenser implements DispenserLinkI {

    private DispenserLinkI link;
    private final int denomination = 200;
    

    @Override
    public void setNextDispenserHandler(DispenserLinkI dispLink) {
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

class Rs100Dispenser implements DispenserLinkI {

    private final int denomination = 100;
    private DispenserLinkI link;

    @Override
    public void setNextDispenserHandler(DispenserLinkI dispLink) {
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


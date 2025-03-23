class ProgramCappuccino implements CoffeeProgram{
    private CMM cmm;

    public ProgramCappuccino(CMM cmm) {
        this.cmm = cmm;
    }

    @Override
    public String getDesc(){
        return "Cappuccino Coffee";
    }

    @Override
    public double getCost(){
        return 5.00; // Cost of Cappuccino $5/cup
    }
    @Override
    public CoffeeIF makeCoffee(){ //Cappuccino Coffee presets
        CoffeeIF cap = new CFCappuccino();
        cmm.setLED(0); // Running!
        cmm.setTypeLED(5);
        cmm.setGrindingTime(4);
        cmm.setTemp(1050);
        cmm.holdTemp(2);

        cap = new DecoratorCream(cap); // Add Cream
        cmm.setWait(3);
        cmm.setLED(1); // Not running, turn off machine

        // Display the price and add the order to sales
//        cmm.displayPrice(cap);
//        cmm.addSale(cap);
        return cap;
    }
}
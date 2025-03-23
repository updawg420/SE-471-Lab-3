class ProgramEspresso implements CoffeeProgram{
    private CMM cmm;

    public ProgramEspresso(CMM cmm) {
        this.cmm = cmm;
    }

    @Override
    public String getDesc(){
        return "Espresso Coffee";
    }

    @Override
    public double getCost(){
        return 4.00; // Cost of Espresso $4/cup
    }
    @Override
    public CoffeeIF makeCoffee(){ //Espresso Coffee presets
        CoffeeIF eso = new CFEspresso();
        cmm.setLED(0); // Running!
        cmm.setTypeLED(4);
        cmm.setGrindingTime(10);
        cmm.setTemp(250);
        cmm.holdTemp(5);

//      eso = new DecoratorChocolate(eso); // Add chocolate
        cmm.setWait(6);
        cmm.setLED(1); // Not running, turn off machine

        // Display the price and add the order to sales
        //cmm.displayPrice(eso);
//        cmm.addSale(eso);
        return eso;
    }
}
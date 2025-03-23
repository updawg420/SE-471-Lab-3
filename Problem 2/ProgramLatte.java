class ProgramLatte implements CoffeeProgram{
    private CMM cmm;

    public ProgramLatte(CMM cmm) {
        this.cmm = cmm;
    }

    @Override
    public String getDesc(){
        return "Latte Coffee";
    }

    @Override
    public double getCost(){
        return 3.00; // Cost of Latte $3/cup
    }

    @Override
    public CoffeeIF makeCoffee(){ //Latte Coffee presets
        CoffeeIF latte = new CFLatte();
        cmm.setLED(0); // Running!
        cmm.setTypeLED(3);
        cmm.setGrindingTime(6);
        cmm.setTemp(180);
        cmm.holdTemp(8);

        latte = new DecoratorVanilla(latte);// Add vanilla
        latte = new DecoratorChocolate(latte); // Add Chocolate
        latte = new DecoratorCream(latte); // Add Cream
        cmm.setWait(3);
        cmm.setLED(1); // Not running, turn off machine
//        cmm.displayPrice(latte);
//        cmm.addSale(latte);
        return latte;
    }
}
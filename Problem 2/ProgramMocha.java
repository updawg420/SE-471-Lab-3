class ProgramMocha implements CoffeeProgram{
    private CMM cmm;

    public ProgramMocha(CMM cmm) {
        this.cmm = cmm;
    }

    @Override
    public String getDesc(){
        return "Mocha Coffee";
    }

    @Override
    public double getCost(){
        return 2.00; // Cost of Mocha $2/cup
    }
    @Override
    public CoffeeIF makeCoffee(){ //Mocha Coffee presets
        CoffeeIF mocha = new CFMocha();
        mocha = new DecoratorVanilla(mocha); // Add Vanilla
        mocha = new DecoratorCream(mocha);

        cmm.setLED(0); // Running!
        cmm.setTypeLED(2);
        cmm.setGrindingTime(5);
        cmm.setTemp(200);
        cmm.holdTemp(5);
        cmm.setWait(15);
        cmm.setLED(1); // Not running, turn off machine
        //cmm.displayPrice(mocha);
        //cmm.addSale(mocha);
        return mocha;
    }
}
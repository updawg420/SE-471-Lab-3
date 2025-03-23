class ProgramRegular implements CoffeeProgram {
    private CMM cmm;

    public ProgramRegular(CMM cmm) {
        this.cmm = cmm;
    }

    @Override
    public String getDesc(){
        return "Regular Coffee";
    }
    @Override
    public double getCost(){
        return 1.00; // Cost of Regular $1/cup
}
@Override
public CoffeeIF makeCoffee(){ //Regular Coffee presets
    CoffeeIF reg = new CFRegular();
    cmm.setLED(0); // Running!
    cmm.setTypeLED(1);
    cmm.setGrindingTime(8);
    cmm.setTemp(150);
    cmm.holdTemp(2);
    cmm.setWait(15);
    cmm.setLED(1); // Not running
    return reg;
}
}


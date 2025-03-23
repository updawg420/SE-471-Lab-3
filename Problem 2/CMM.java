public class CMM {
    private List < CoffeeIF > salesRecords = new ArrayList <> (); // sales records data
    private CoffeeProgram currProgram; // current program

    public void makeCoffee(){
        if (currProgram != null){
            currProgram.makeCoffee();
        }
    }

    // Built-in Functionalitiess
    public void setGrindingTime(int secs){
        (System.out.println("Grinding time set to " + secs + " seconds");
    }
    public void setTemp(int degree){
        System.out.println("Temperature set to " + degree + " degrees.");
    }
    public void holdTemp(int secs){
        System.out.println("Temperature held for " + secs + " seconds.");
    }
    public void wait(int secs){
        System.out.println("Waiting for " + secs + " seconds.");
    }
    public void setLED(int num){
        System.out.println("LED set to " + (num == 0 ? "Running!" : "Not Running!"));
    }
    public setTypeLED(int num){
        System.out.println("Type LED set to " + num);
    }
    public void displayPrice(CoffeIF coffee){
        System.out.println("Price: $" + coffee.getCost());
    }
}
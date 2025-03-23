import java.util.ArrayList;
import java.util.List;

public class CMM {
    private List <CoffeeIF> salesRecords = new ArrayList <> (); // sales records data
    private CoffeeProgram currProgram; // current program

    public void makeCoffee(){
            currProgram.makeCoffee();

    }
    // Only one coffee program at a time
    public void setProgram(CoffeeProgram program){
        this.currProgram = program;
    }

    public void addSale(CoffeeIF coffee){
        salesRecords.add(coffee);
    }
    public void printSales(){
        System.out.println("\nOrder Total:");
        for (CoffeeIF coffee: salesRecords){
            System.out.println(coffee.getDesc() + " $" + coffee.getCost());
        }
    }


    // Built-in Functionalitiess
    public void setGrindingTime(int secs){
        System.out.println("Grinding time set to " + secs + " seconds");
    }
    public void setTemp(int degree){
        System.out.println("Temperature set to " + degree + " degrees.");
    }
    public void holdTemp(int secs){
        System.out.println("Temperature held for " + secs + " seconds.");
    }
    public void setWait(int secs){
        System.out.println("Waiting for " + secs + " seconds.");
    }
    public void setLED(int num){
        System.out.println("LED set to " + (num == 0 ? "Running!" : "Not Running!"));
    }
    public void setTypeLED(int num){
        System.out.println("Type LED set to " + num);
    }
    public void displayPrice(CoffeeIF coffee){
        System.out.println("Final Price: $" + coffee.getCost());
    }
}
class MochaCoffee implements CoffeeIF{
    @Override
    public String getDesc(){
        return "Mocha Coffee";
    }

    @Override
    public double getCost(){
        return 2.00; // Cost of Mocha $2/cup
    }
}
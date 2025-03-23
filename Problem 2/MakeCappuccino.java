class MakeCappuccino implements CoffeeIF{
    @Override
    public String getDesc(){
        return "Cappuccino Coffee";
    }

    @Override
    public double getCost(){
        return 5.00; // Cost of Cappuccino $5/cup
    }
}
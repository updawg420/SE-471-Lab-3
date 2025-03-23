class MakeEspresso implements CoffeeIF{
    @Override
    public String getDesc(){
        return "Espresso Coffee";
    }

    @Override
    public double getCost(){
        return 4.00; // Cost of Espresso $4/cup
    }
}
class RegularCoffee implements CoffeeIF {
    @Override
    public String getDesc(){
        return "Regular Coffee";
    }

    @Override
    public double getCost(){
        return 1.00; // Cost of Regular $1/cup
    }
}
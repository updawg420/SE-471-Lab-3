class DecoratorChocolate extends DecoratorCondiment {
    protected CoffeeIF coffee;

    public DecoratorChocolate(CoffeeIF coffee){
        super(coffee);
    }
    @Override
    public String getDesc(){
        return super.getDesc() + ", Chocolate";
    }
    @Override
    public double getCost(){
        return super.getCost() + 1.00; // Adding cost of Chocolate
    }
}
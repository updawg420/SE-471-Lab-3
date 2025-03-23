class DecoratorVanilla extends DecoratorCondiment {
    protected CoffeeIF coffee;

    public DecoratorVanilla(CoffeeIF coffee){
        super(coffee);
    }
    @Override
    public String getDesc(){
        return super.getDesc() + ", Vanilla";
    }
    @Override
    public double getCost(){
        return super.getCost() + 0.50; // Adding cost of Vanilla
    }
}
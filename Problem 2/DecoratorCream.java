class DecoratorCream extends DecoratorCondiment {
    protected CoffeeIF coffee;

    public DecoratorCream(CoffeeIF coffee){
        super(coffee);
    }
    @Override
    public String getDesc(){
        return super.getDesc() + ", Cream";
    }
    @Override
    public double getCost(){
        return super.getCost() + 0.25; // Adding cost of Cream
    }
}
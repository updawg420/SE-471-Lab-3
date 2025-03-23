abstract class DecoratorCondiment implements CoffeeIF {
    protected CoffeeIF coffee;

    public DecoratorCondiment(CoffeeIF coffee){
        this.coffee = coffee;
    }
    @Override
    public String getDesc(){
        return coffee.getDesc();
    }
    @Override
    public double getCost(){
        return coffee.getCost();
    }
}
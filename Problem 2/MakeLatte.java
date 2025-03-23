class MakeLatte implements CoffeeIF{
    @Override
    public String getDesc(){
        return "Latte Coffee";
    }

    @Override
    public double getCost(){
        return 3.00; // Cost of Latte $3/cup
    }
}
public class Sprinkles extends ToppingsDecorator { //Sprinkles is now a topping
    IceCream iceCream; //the ice cream that the sprinkles will decorate
    //constructor that allows user to choose which ice cream to decorate
    public Sprinkles(IceCream iceCream){
        this.iceCream = iceCream;
    }
    //adds + topping to the instance variable ice cream toString
    public String toString(){
        return iceCream.toString() + " + Sprinkles";
    }
    //returns the cost of total ice cream and topping
    public double getCost(){
        return iceCream.getCost() + .2;
    }
}

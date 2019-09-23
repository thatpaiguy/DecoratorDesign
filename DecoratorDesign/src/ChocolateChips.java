public class ChocolateChips extends ToppingsDecorator {
    IceCream iceCream;
    public ChocolateChips(IceCream iceCream){
        this.iceCream = iceCream;
    }
    public String toString(){
        return iceCream.toString() + " + Chocolate Chips";
    }
    public double getCost(){
        return iceCream.getCost() + .3;
    }
}

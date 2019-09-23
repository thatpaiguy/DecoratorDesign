public abstract class IceCream { //base ice cream class
    protected String description;
    //methods that will be overridden
    public String toString( ){
        return description;
    }
    public abstract double getCost();
}

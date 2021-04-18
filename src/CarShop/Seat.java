package CarShop;

public class Seat extends CarImpl implements Sellable{

    private Double price;

    protected Seat(String model, String color, Integer horsePower, String produced, Double price) {
        super(model, color, horsePower, produced);
        this.price = price;

    }

    @Override
    public Double getPrice() {
        return price;
    }

    public String toString(){
        return super.toString() + System.lineSeparator()
                + super.getModel() + " sells for " + price;
    }
}

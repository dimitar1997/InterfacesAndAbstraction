package CarShop;

public class Audi  extends CarImpl implements Rentable{
    private Integer minRentDay;
    private  Double pricePerDay;

    protected Audi(String model, String color, int horsePower, String produced,
                int minRentDay, Double pricePerDay) {
        super(model, color, horsePower, produced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }


    @Override
    public Integer getMinRentDay() {
        return minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return pricePerDay;
    }
    public String toString(){
        return super.toString() + System.lineSeparator()
                + "Minimum rental period of "+ minRentDay +" days. Price per day " +
                pricePerDay;
    }
}

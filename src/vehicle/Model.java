package vehicle;

public class Model implements Vehicle {

	private int price;

    private String description;

    public Model(int price, String description) {
        this.price = price;
        this.description = description;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public String description() {
        return description + ":";
    }
    
    @Override
    public String toString() {
    	return this.getClass().getSimpleName() + ": ";
    }

}

public class Pizza {
    protected String[] toppings;
    protected double price;
    protected String description;

    public Pizza(String[] toppings, int numberOfToppings) {
        this.toppings = toppings;
        price = 14.00 + (2.00 * numberOfToppings);
        description = "";

        for (int i = 0; i < numberOfToppings; i++) {
            description += toppings[i];
            if (i < numberOfToppings - 1) {
                description += ", ";
            }
        }
    }

    @Override
    public String toString() {
        return "Toppings: " + description +
                "\nPizza Price: $" + String.format("%.2f", price);
    }

    public double getPrice() {
        return price;
    }
}

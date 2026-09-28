public class DeliveryPizza extends Pizza {
    private double deliveryFee;
    private String deliveryAddress;

    public DeliveryPizza(String[] toppings, String deliveryAddress,
                         int numberOfToppings) {

        super(toppings, numberOfToppings);

        this.deliveryAddress = deliveryAddress;
        if (price > 18.00) {
            deliveryFee = 3.00;
        } else {
            deliveryFee = 5.00;
        }
    }
    @Override
    public String toString() {
        double totalCost = price + deliveryFee;

        return "Toppings: " + description +
                "\nPizza Price: $" + String.format("%.2f", price) +
                "\nDelivery Address: " + deliveryAddress +
                "\nDelivery Fee: $" + String.format("%.2f", deliveryFee) +
                "\nTotal Cost: $" + String.format("%.2f", totalCost);
    }
}
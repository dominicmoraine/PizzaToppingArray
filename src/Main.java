public class Main {

    public static void main(String[] args) {

        System.out.println("Pizza Order Test");
        System.out.println("----------------");
        String[] regularToppings = {
                "pepperoni",
                "mushrooms",
                "onions"
        };

        Pizza regularPizza = new Pizza(regularToppings, 3);

        System.out.println("\nRegular Pizza:");
        System.out.println(regularPizza);
        String[] deliveryToppings1 = {
                "sausage",
                "green peppers"
        };

        DeliveryPizza deliveryPizza1 =
                new DeliveryPizza(deliveryToppings1,
                        "235 N. National Avenue, Fond du Lac, WI 54935",
                        2);

        System.out.println("\nDelivery Pizza:");
        System.out.println(deliveryPizza1);
        String[] deliveryToppings2 = {
                "pepperoni",
                "bacon",
                "onions",
                "olives"
        };

        DeliveryPizza deliveryPizza2 =
                new DeliveryPizza(deliveryToppings2,
                        "235 N. National Avenue, Fond du Lac, WI 54935",
                        4);

        System.out.println("\nDelivery Pizza:");
        System.out.println(deliveryPizza2);
    }
}

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder("larger")
                .addCheese()
                .addOnions()
                .addTomatoes()
                .setCrustType("thin")
                .build();

        System.out.println(pizza);
    }
}

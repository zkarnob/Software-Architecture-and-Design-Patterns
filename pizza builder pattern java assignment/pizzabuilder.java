class Pizza {
    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;
    private boolean onions;
    private boolean tomatoes;
    private String crustType;

    public Pizza(String size, boolean cheese, boolean pepperoni, boolean mushrooms, boolean onions, boolean tomatoes, String crustType) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.mushrooms = mushrooms;
        this.onions = onions;
        this.tomatoes = tomatoes;
        this.crustType = crustType;
    }

    public boolean hasCheese() {
        return cheese;
    }

    public boolean hasPepperoni() {
        return pepperoni;
    }

    public boolean hasMushrooms() {
        return mushrooms;
    }

    public boolean hasOnions() {
        return onions;
    }

    public boolean hasTomatoes() {
        return tomatoes;
    }

    public String getCrustType() {
        return crustType;
    }

    @Override
    public String toString() {
        StringBuilder toppings = new StringBuilder();
        if (cheese) toppings.append("Cheese, ");
        if (pepperoni) toppings.append("Pepperoni, ");
        if (mushrooms) toppings.append("Mushrooms, ");
        if (onions) toppings.append("Onions, ");
        if (tomatoes) toppings.append("Tomatoes, ");

        return "Size: " + size + ", Crust Type: " + crustType + ", Toppings: " + toppings.toString().trim();
    }
}

class PizzaBuilder {
    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;
    private boolean onions;
    private boolean tomatoes;
    private String crustType;

    public PizzaBuilder(String size) {
        this.size = size;
    }

    public PizzaBuilder addCheese() {
        this.cheese = true;
        return this;
    }

    public PizzaBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    public PizzaBuilder addMushrooms() {
        this.mushrooms = true;
        return this;
    }

    public PizzaBuilder addOnions() {
        this.onions = true;
        return this;
    }

    public PizzaBuilder addTomatoes() {
        this.tomatoes = true;
        return this;
    }

    public PizzaBuilder setCrustType(String crustType) {
        this.crustType = crustType;
        return this;
    }

    public Pizza build() {
        return new Pizza(size, cheese, pepperoni, mushrooms, onions, tomatoes, crustType);
    }
}


class Super {
    private String name;
    private double price;

    public Super(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Продукт: " + name + ", Ціна: " + price;
    }

    // Overloaded method
    public void відобразитиІнформаціюПроПродукт() {
        // реалізація
    }
}
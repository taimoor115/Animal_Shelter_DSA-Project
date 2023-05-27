public abstract class Animal {
    protected String name;
    private int order;

    public abstract String name();

    public Animal(String name) {
        this.name = name;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }
    public boolean isOlderThan(Animal a) {
        return this.order < a.getOrder();
    }
}

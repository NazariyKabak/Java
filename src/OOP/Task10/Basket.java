package OOP.Task10;

public class Basket {
    private Goods [] items;

    public Basket(Goods[] items) {
        this.items = items;
    }

    public Goods[] getItems() {
        return items;
    }

    public void setItems(Goods[] items) {
        this.items = items;
    }
}

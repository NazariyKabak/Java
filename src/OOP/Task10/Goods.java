package OOP.Task10;

public class Goods {
    private String name;
    private int price;
    private int mmr;

    public Goods(String name, int price, int mmr) {
        this.name = name;
        this.price = price;
        this.mmr = mmr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMmr() {
        return mmr;
    }

    public void setMmr(int mmr) {
        this.mmr = mmr;
    }
}

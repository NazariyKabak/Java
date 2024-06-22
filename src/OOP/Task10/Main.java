package OOP.Task10;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
        Goods[] goods= {new Goods("Milk",40,4), new Goods("Coca-cola", 20,10)};
        Category category1=new Category("Drink",goods);
        Category [] categories= {category1};
        for (Category category : categories){
            System.out.println(category.getName());
            for (Goods good : goods){
                System.out.println(good.getName()+" "+good.getPrice());
            }
        }
        Basket basket1 = new Basket(goods);
        User user = new User("Neyzr11", "pass", basket1);
        print(user);

    }
    public static void print(User user){
        System.out.println(user.getLogin());
        System.out.println("Basket items:");
        for (Goods goods : user.getBasket().getItems()){
            System.out.println(goods.getName()+" "+goods.getPrice());
        }
        System.out.println();
    }
}

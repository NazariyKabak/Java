package OOP.Task1;


import com.sun.tools.javac.Main;

public class Start {
    public static void main(String[] args) {
        Start start = new Start();
        start.run();
    }

    private void run() {
        Phone phone1 = new Phone("2222","Samsung", 12);
        Phone phone2 = new Phone("2111","Iphone");
        Phone phone3 = new Phone("22","Samsung S20", 13);
        System.out.println(phone1.getModel());
        phone1.receiveCall("Nazar");
        phone1.sendMessage("0980301928");
        System.out.println(phone1.getNumber());
        phone2.receiveCall("Yarik");
        System.out.println(phone2.getNumber());
        phone3.receiveCall("Igor", "098490");



    }
}

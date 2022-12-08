import Request.Data;

public class Main {
    public static void main(String[] args) {
        Chain obj1 = new Application();
        Chain obj2 = new Presentation();
        Chain obj3 = new Session();
        Chain obj4 = new Transport();
        Chain obj5 = new Network();
        Chain obj6 = new DataLink();
        Chain obj7 = new Physical();

        obj1.setNextChain(obj2);
        obj2.setNextChain(obj3);
        obj3.setNextChain(obj4);
        obj4.setNextChain(obj5);
        obj5.setNextChain(obj6);
        obj6.setNextChain(obj7);

        Data request = new Data("data");
        obj1.process(request);
    }
}
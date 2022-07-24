package javarush.seventeen;

public class Table {
    private static byte tableNumber;
    private byte number = ++tableNumber;

    public Order getOrder() {
        return new Order(number);
    }
}

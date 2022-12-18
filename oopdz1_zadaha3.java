public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new HotDrinksVendingMachine();
        Drink p1 = machine.getProduct(0, 100, 0);
        Drink p2 = machine.getProduct(1, 300, 50);
        Drink p3 = machine.getProduct(2, 500, 10);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}

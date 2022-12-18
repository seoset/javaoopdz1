interface VendingMachine {
    Drink getProduct(int name, int volume, int temperature);
}

public class HotDrinksVendingMachine implements VendingMachine {

    private static final String[] names = new String[] {"Чай", "Кофе", "Шоколад"};

    @Override
    public Drink getProduct(int name, int volume, int temperature) {
        if(temperature > 0) return new HotDrink(names[name], volume, temperature);
        else return new Drink(names[name], volume);
    }
}

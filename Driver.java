public class Driver {
    public static void main(String[] args) {
        Room r1 = new Deluxe();
        r1 = new Spa(r1);
        r1 = new Refill(r1);
        r1 = new FoodBar(r1);
        r1 = new Shower(r1);

        System.out.println(r1.getDescription()+ " Costs: $" + r1.cost() );
    }
}

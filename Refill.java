public class Refill extends RoomDecorator{
    MotelRoom room;

    public Refill(MotelRoom room){
        this.room = room;
    }

    public String getDescription() {
        return room.getDescription() + ", AutoRefill of the FoodBar";
    }


    public double cost() {
        return 5 + room.cost();
    }
}

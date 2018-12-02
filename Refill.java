public class Refill extends RoomDecorator{
    Room room;

    public Refill(Room room){
        this.room = room;
    }

    public String getDescription() {
        return room.getDescription() + ", AutoRefill of the FoodBar";
    }


    public double cost() {
        return 5 + room.cost();
    }
}

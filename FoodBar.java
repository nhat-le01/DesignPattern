public class FoodBar extends RoomDecorator{
    Room room;

    public FoodBar(Room room){
        this.room = room;
    }

    public String getDescription() {
        return room.getDescription() + ", FoodBar";
    }


    public double cost() {
        return 10 + room.cost();
    }
}

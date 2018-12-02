public class Shower extends RoomDecorator{
    Room room;

    public Shower(Room room){
        this.room = room;
    }

    public String getDescription() {
        return room.getDescription() + ", Spray Resistant Shower";
    }


    public double cost() {
        return 25 + room.cost();
    }
}

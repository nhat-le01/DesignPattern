public class Spa extends RoomDecorator {
    Room room;

    public Spa(Room room){
        this.room = room;
    }

    public String getDescription() {
        return room.getDescription() + ", Spa";
    }


    public double cost() {
        return 20 + room.cost();
    }
}

public class Shower extends RoomDecorator{
    MotelRoom room;

    public Shower(MotelRoom room){
        this.room = room;
    }

    public String getDescription() {
        return room.getDescription() + ", Spray Resistant Shower";
    }


    public double cost() {
        return 25 + room.cost();
    }
}

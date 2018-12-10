public class Spa extends RoomDecorator {
	MotelRoom room;

    public Spa(MotelRoom room){
        this.room = room;
    }

    public String getDescription() {
        return room.getDescription() + ", Spa";
    }


    public double cost() {
        return 20 + room.cost();
    }
}

public class FoodBar extends RoomDecorator{
    MotelRoom room;

    public FoodBar(MotelRoom room){
        this.room = room;
    }

    public String getDescription() {
        return room.getDescription() + ", FoodBar";
    }


    public double cost() {
    	//issue: cost()
        return 10 + room.cost();
    }
}

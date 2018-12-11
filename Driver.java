import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Driver {
    public static void main(String[] args) {
		double cost;
        Locale locale = new Locale("en", "US");
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        RoachMotel rm = RoachMotel.getInstance();
        rm.createRooms();
        System.out.println(rm);

        //=======================================================================================

        ArrayList amenities2 = new ArrayList();
        amenities2.add("foodbar");

        ArrayList amenities3 = new ArrayList();
        amenities3.add("foodbar");
        amenities3.add("spa");


        ArrayList amenities4 = new ArrayList();
        amenities4.add("foodbar");
        amenities4.add("spa");
        amenities4.add("refillbar");


        ArrayList amenities5 = new ArrayList();
        amenities5.add("foodbar");
        amenities5.add("spa");
        amenities5.add("refillbar");
        amenities5.add("shower");
        //=======================================================================================

        RoachColony rc1 = new  RoachColony("First Colony",100,200);
        MotelRoom r1 = rm.checkIn(rc1,"Suite",amenities5);
        System.out.println(rc1);
        System.out.println(rm);
        rc1.party();
        System.out.println(rc1);
        cost = rm.checkOut(r1,5);
        System.out.println("Cost for room " + r1.name + " is: " + currencyFormatter.format(cost) + "\n");
        System.out.println(rm);

       /* RoachColony rc2 = new RoachColony("Second colony",1000,0.2);
        MotelRoom r2 = rm.checkIn(rc2,"Deluxe",amenities2);
        System.out.println(rc2);
        System.out.println(rm);
        rc2.party();
        System.out.println(rc2);
        cost = rm.checkOut(r2,3);
        System.out.println("cost: " + currencyFormatter.format(cost));
        System.out.println(rm);
        RoachColony rc3 = new RoachColony("third colony",300,0.3);
        MotelRoom r3 = rm.checkIn(rc3,"Regular",amenities3);
        RoachColony rc4 = new RoachColony("fourth colony",400,0.4);
        MotelRoom r4 = rm.checkIn(rc4,"Regular",amenities4);
        RoachColony rc5 = new RoachColony("fifth colony",500,0.5);
        MotelRoom r5 = rm.checkIn(rc5,"Deluxe",amenities5);
        RoachColony rc6 = new RoachColony("sixth colony",600,0.6);
        MotelRoom r6 = rm.checkIn(rc6,"Deluxe",amenities2);
        RoachColony rc7 = new RoachColony("Seventh colony",700,0.7);
        MotelRoom r7 = rm.checkIn(rc7,"Suite",amenities);
        RoachColony rc8 = new RoachColony("eigth colony",800,0.8);
        MotelRoom r8 = rm.checkIn(rc8,"Suite",amenities4);
        RoachColony rc9 = new RoachColony("ninth colony",900,0.9);
        cost = rm.checkOut(r3,3);
        System.out.println("Cost: " + currencyFormatter.format(cost));
        MotelRoom r9 = rm.checkIn(rc9,"Regular",amenities3);*/
    }
}

/**
 * @author Mateo Olmeda
 * @author Peter Park
 * @author Hassan Ishmam
 * @author Nhat Le
 * December 12, 2018
 * Purpose: Driver that tests Project Patterns
 * Inputs:	None
 * Outputs: Prints toString of classes in Project Patterns to test functionality
 */

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
        MotelRoom r1 = rm.checkIn(rc1,"Regular",amenities5);
        System.out.println(rc1);
        System.out.println(rm);
        System.out.println(rc1.party());
        System.out.println(rc1);
        System.out.println("Room " + r1.getName() + " is being checked out of.\n");
        cost = rm.checkOut(r1,5);
        System.out.println("Cost for room " + r1.name + " is: " + currencyFormatter.format(cost) + "\n");
        System.out.println(rm);

        RoachColony rc2 = new  RoachColony("Mateo's Colony",200,.1);
        MotelRoom r2 = rm.checkIn(rc2,"Suite",amenities4);
        System.out.println(rc2);
        System.out.println(rm);

        RoachColony rc3 = new  RoachColony("Peter's Colony",50,.3);
        MotelRoom r3 = rm.checkIn(rc3,"Deluxe",amenities2);
        System.out.println(rc3);
        System.out.println(rm);

        RoachColony rc4 = new  RoachColony("Hassan's Colony",1000,.6);
        MotelRoom r4 = rm.checkIn(rc4,"Suite",amenities3);
        System.out.println(rc4);
        System.out.println(rm);
        System.out.println(rc4.party());
        System.out.println(rc4);
        System.out.println(rc4.party());
        System.out.println(rc4);
        System.out.println(rc4.party());
        System.out.println(rc4);

        RoachColony rc5 = new  RoachColony("Nhat's Colony",1,.5);
        MotelRoom r5 = rm.checkIn(rc5,"Regular",amenities4);
        System.out.println(rc5);
        System.out.println(rm);

        RoachColony rc6 = new  RoachColony("David's Colony",300,.55);
        MotelRoom r6 = rm.checkIn(rc6,"Regular",amenities3);
        System.out.println(rc6);
        System.out.println(rm);

        RoachColony rc7 = new  RoachColony("Natali's Colony",1000,.52);
        MotelRoom r7 = rm.checkIn(rc7,"Regular",amenities2);
        System.out.println(rc7);
        System.out.println(rm);

        RoachColony rc8 = new  RoachColony("Cesar's Colony",2000,10);
        MotelRoom r8 = rm.checkIn(rc8,"Regular",amenities5);
        System.out.println(rc8);
        System.out.println(rm);

        RoachColony rc9 = new  RoachColony("Latif's Colony",200,25);
        MotelRoom r9 = rm.checkIn(rc9,"Regular",amenities3);
        System.out.println(rc9);
        System.out.println(rm);

        RoachColony rc10 = new  RoachColony("Jesse's Colony",200,100);
        MotelRoom r10 = rm.checkIn(rc10,"Regular",amenities4);
        System.out.println(rc10);
        System.out.println(rm);

        System.out.println("Room " + r2.getName() + " is being checked out of.\n");
        cost = rm.checkOut(r2,5);
        System.out.println("Cost for room " + r2.name + " is: " + currencyFormatter.format(cost) + "\n");
        System.out.println(rm);
    }
}

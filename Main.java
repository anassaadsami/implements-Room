package implementsRoom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		Room r1= new Room("room1", 6, 3);
		Room r2= new Room("room2",4, 2);
		Room r3 = new Room("room3", 6, 3);
		Room r4 = new Room("room4",4, 2);
		
		ArrayList<Room> y = new ArrayList<Room>(Arrays.asList(r1, r2 , r3 , r4));
		displayRoomDetail(y);
		System.out.println();
		
		System.out.println(r1.compareTo(r2));   // compare between  r1 area and r2 area depends on area() method in Room class
		
		Collections.sort(y);      // by this method we can sort ArrayList by using implements Comparable
		displayRoomDetail(y);
//		System.out.println(r1);
//		r3.internalRoom  = new Room(4,2);
//		r4.internalRoom  = new Room(2,1);
//		r3.internalRoom.area(); 
//		r4.internalRoom.area(); 
//		System.out.println(r3.area());
//		System.out.println(r4.area());
		
//		int i = r3.compareTo(r4);
//		System.out.println(i);
//		
//		r3.compareTo1(r4);
//		
//		// here for Room1 which have no implements and it works well 
//		System.out.println(r1.name);
//		System.out.println(r1.area());
//		System.out.println(r2.length);
//		System.out.println(r2.width);
//		System.out.println(r2.area());
//		r2.compareTo1(r1);

//		r3.compareTo2(r4);
	}
	public static ArrayList<Room> displayRoomDetail (ArrayList<Room> x) {
		for (Room item : x) {
			System.out.println(item.toString());     // awesome
		}
		System.out.println();
		return x ;
		
	}
	

}

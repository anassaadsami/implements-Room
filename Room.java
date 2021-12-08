package implementsRoom;

public class Room implements Comparable<Room> {
	String name ;
	int length;
	int width;
	int area ;
	Room internalRoom ; // Room class have reference variable of Room class
	
	public Room(int length, int width) { // another constructor
		this.length = length;
		this.width = width;
	}

	public Room(String name ,int lenght, int width) {  // constructor
		this.name = name;
		this.length = lenght;
		this.width = width;
	}

	// method to return the area of room
	public int area() {
		 this.area = this.length * this.width;
		return this.area;
	}

	// this method must be written cause the implements
	// this is very important if we want to compare many objects by it's attributes in array so this is AWESOME
	@Override // method to compare two room
	public int compareTo(Room r) {
		if (this.area ()== r.area())
			return 0;
		else if (this.area() < r.area())     // if we code this.area -----> null(as an instance variable ) not as method 
			return -1;                        // and thats why will equal cause r.area also null
		else
			return 1;
	}
	

	@Override
	public String toString() {
		return "Room [name=" + name + ", length=" + length + ", width=" + width + "]";
	}

	// extra method by me to show it ok if i do my own method to compare
	public void compareTo1(Room r) {
		if (this.area == r.area)
			System.out.println("they are equal");
		else if (this.area < r.area)
			System.out.println(this.name + " is smaller than "+ r.name);
		else
			System.out.println(this.name + " is bigger than "+ r.name);
	}
	public void compareTo2( Room r) {
		if (this.internalRoom.area == r.internalRoom.area)
			System.out.println("they are equal");
		else if (this.internalRoom.area < r.internalRoom.area)
			System.out.println(this.name + " is smaller than "+ internalRoom.name);
		else
			System.out.println(this.name + " is bigger than "+ internalRoom.name);
	}

}

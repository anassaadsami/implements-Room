package implementsRoom;

// i make this class to show if the class does'nt implements Comparable class so we still can compare objects with 
// its own attributes  ???
// we do implements comparable to can compare many objects by it's attributes in array 
public class Room1 {
	String name;
	int length;
	int width;
	int area;

	public Room1(String name, int lenght, int width) { // constructor
		this.name = name;
		this.length = lenght;
		this.width = width;
	}

	// method to return the area of room
	public int area() {
		this.area = this.length * this.width;
		return this.area;
	}

	// extra method by me to show it ok if i do my own method to compare
	public void compareTo1(Room1 r) {
		if (this.area() == r.area())
			System.out.println("they are equal");
		else if (this.area ()< r.area())
			System.out.println(this.name+ " is smaller than " + r.name);
		else
			System.out.println(this.name + " is bigger than " + r.name);
	}

	// another method to compare
	public int compareTo(Room r) {
		if (this.area() == r.area())
			return 0;
		else if (this.area() < r.area())
			return -1;
		else
			return 1;
	}

}

package lab1;

public class test {

	public static void main(String[] args) {
		//Create seat with number 18//
		Seat1 s1 = new Seat1(18);
		//Set the passenger name for seat 18//
		s1.setPassengerName("Mohammad");
		//Print seat info and Check//
System.out.println(s1.toString());
System.out.println(s1.isEmpty());
System.out.println(Seat1.isValid(18));
System.out.println(Seat1.getRow(18));
System.out.println(Seat1.getColumn(18));
//Check invalid seats//
System.out.println(Seat1.isValid(-1));
System.out.println(Seat1.isValid(3));
System.out.println(Seat1.isValid(4));
System.out.println(Seat1.isValid(89));
System.out.println(Seat1.isValid(90));
	}
}

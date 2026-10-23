package lab1;

public class Seat1 {
	//DataFeilds//
		private int seatNumber;
		private String passengerName;
		//no-argument constructor//
		Seat1(){
			
		}
		//Constructor with Seat Number//
		public Seat1(int seatNumber) {
		    this.seatNumber = seatNumber;
			this.passengerName = null;
		}
		//Getters and Setters//
		public int getSeatNumber() {
			return seatNumber;
		}
		public void setSeatNumber(int seatNumber) {
			this.seatNumber = seatNumber;
		}
		public String getPassengerName() {
			return passengerName;
		}
		public void setPassengerName(String passengerName) {
			this.passengerName = passengerName;
		}
		//Check if seat is empty//
		public boolean isEmpty () {
			return this.passengerName == null;
		}
		//Print seat information//
		public String toString () {
			return "Seat Number :" + " " +this.seatNumber +" ,Passenger Name :" +" " +this.passengerName;
		}
		//Check if seat is valid//
		public static boolean isValid (int seatNumber) {
			if(seatNumber<1 || seatNumber>92) {
				return false;
			}
			if(seatNumber==3 || seatNumber==4 || seatNumber==89 || seatNumber==90) {
				return false;
			}
				return true;
		}
		//returns train row if the seat number is valid//
		public static int getRow (int seatNumber) {
			if(isValid(seatNumber)) {
				return (seatNumber-1) / 4+1;
			}
			else {
				return -1;
			}
		}
		//returns train column if the seat number is valid//
		public static int getColumn (int seatNumber) {
			if(isValid(seatNumber)) {
					return (seatNumber-1) % 4+1;
				}
			else {
				return -1;
			}
		}
}


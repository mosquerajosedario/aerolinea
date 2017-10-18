import java.util.Scanner;

public class AeroCarena {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		char newFlight = 's';

		do{
			Plane myPlane = new Plane(50, 1200f);

			myPlane.resetFlight();
			char continueSelling = 's';

			while(continueSelling == 's'){
				myPlane.showAllAvailableSeats();

				System.out.print("Asiento a vender: ");
				int seatNumber = keyboard.nextInt();
			
				myPlane.sellTicket(seatNumber);
				
				System.out.print("Realizar otra venta? (s/n): ");
				continueSelling = keyboard.next().charAt(0);
				}
				float earnings = myPlane.getEarnings();

				System.out.println("Las ganancias del vuelo son $" + String.valueOf(earnings));

				System.out.print("Procesar otro vuelo? (s/n): ");
				newFlight = keyboard.next().charAt(0);

			} while (newFlight == 's');

			System.out.println("Chau");	
	}
}

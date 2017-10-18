public class Plane {
	private boolean seats[];
	private float ticketPrice;
	private float earnings;

	public Plane(int seatsQuantity, float ticketPrice){
		if (seatsQuantity < 1){
			seatsQuantity = 1;
		}

		seats = new boolean[seatsQuantity];
		this.ticketPrice = ticketPrice;
		earnings = 0f;
	}

	public float getTicketPrice(){
		return ticketPrice;
	}

	public void setTicketPrice(float ticketPrice){
		if (ticketPrice >= 0){
			this.ticketPrice = ticketPrice;
		}
	}

	public void showAllAvailableSeats(){
		for (int i = 0; i < seats.length; i++){
			if (!seats[i]) {
				System.out.println("ASIENTO " + i + "LIBRE");
			}
		}
	}

	public void showInvalidSeatMessage(){
		System.out.println("NUMERO DE ASIENTO INVALIDO");
	}

	public boolean isSeatValid(int seatNumber){
		if(seatNumber >= 0 && seatNumber < seats.length){
			return true;
		} else {
			return false;
		}
	}

	public boolean isSeatOccupied(int seatNumber) {
		if (isSeatValid (seatNumber)){
			return seats[seatNumber];
		} else {
			showInvalidSeatMessage();
			return false;
		}
	}

	public void showAllOccupiedSeats(){
		for (int i = 0; i < seats.length ; i++){
			if(seats[i]){
				System.out.println("ASIENTE " + i + "OCUPADO");
				}
			}
		}
	public void sellTicket(int seatNumber) {
		if (!isSeatOccupied(seatNumber)){
			seats[seatNumber] = true;
			earnings += ticketPrice;
		} else {
			showInvalidSeatMessage();
		}
	}
	
	public float getEarnings(){
		return earnings;
	}

	public void resetFlight(){
		earnings = 0;

		for (int i = 0; i < seats.length; i++){
			seats[i] = false;
		}
	}
}

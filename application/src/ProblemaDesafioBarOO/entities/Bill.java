package ProblemaDesafioBarOO.entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public double cover() {
		if (feeding() < 30) {
			return 4.0;
		} else {
			return 0.00;
		}
	}

	public double feeding() {
		return (beer * 5.00) + (barbecue * 7.00) + (softDrink * 3.00);
	}

	public double ticket() {
		if (gender == 'F' || gender == 'f') {
			return 8.00;
		} else {
			return 10.00;
		}
	}

	public double total() {
		return feeding() + ticket() + cover();
	}
}
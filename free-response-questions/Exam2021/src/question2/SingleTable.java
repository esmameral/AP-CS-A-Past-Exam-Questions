package question2;

public class SingleTable {
	private double viewQuality;
	private int height;
	private int numSeats;
	
	public SingleTable(int numSeats, double viewQuality, int height ) {
		super();
		this.viewQuality = viewQuality;
		this.height = height;
		this.numSeats = numSeats;
	}
	public double getViewQuality() {
		return viewQuality;
	}
	public void setViewQuality(double viewQuality) {
		this.viewQuality = viewQuality;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getNumSeats() {
		return numSeats;
	}
	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	

}

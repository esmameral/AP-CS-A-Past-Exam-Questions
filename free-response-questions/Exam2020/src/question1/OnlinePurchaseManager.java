package question1;

import java.util.ArrayList;

public class OnlinePurchaseManager {
	/** An ArrayList of purchased Gizmo objects, instantiated in the constructor. */
	private ArrayList<Gizmo> purchases;

	/**
	 * Returns the number of purchased Gizmo objects that are electronic and are
	 * manufactured by maker, as described in part (a).
	 */
	public int countElectronicsByMaker(String maker) {
		int count = 0;
		for (Gizmo gizmo : purchases) {
			if (gizmo.getMaker().equals(maker) && gizmo.isElectronic())
				count++;
		}
		return count;
		/* to be implemented in part (a) */ }

	public OnlinePurchaseManager() {
		super();
		purchases = new ArrayList<Gizmo>();
	}

	/**
	 * Returns true if any pair of adjacent purchased Gizmo objects are equivalent,
	 * and false otherwise, as described in part (b).
	 */
	public boolean hasAdjacentEqualPair() {

		/* to be implemented in part (b) */
		for (int i = 0; i < purchases.size() - 1; i++) {
			if (purchases.get(i).equals(purchases.get(i + 1)))
				return true;
		}
		return false;

	}

	public Gizmo getCheapestGizmoByMaker(String maker) {
//	 Add a private double instance variable price to the Gizmo class that will hold
//	this Gizmo’s price.
//	 Add an accessor method public double getPrice() that returns this Gizmo’s
//	price.
//	 Modify at least one of the Gizmo’s constructors to take an additional parameter of the
//	type double and set this Gizmo’s price to the value of that parameter. Alternatively
//	add a method public void setPrice(double pr) that sets this Gizmo’s price
//	to pr.
		return null;
	}
// There may be instance variables, constructors, and methods not shown.

	public ArrayList<Gizmo> getPurchases() {
		return purchases;
	}

	public void setPurchases(ArrayList<Gizmo> purchases) {
		this.purchases = purchases;
	}
}

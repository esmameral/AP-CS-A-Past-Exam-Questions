package question1;

import java.util.Objects;

public class Gizmo {
	private String maker;
	private boolean isElectronic;
	private int id;
	
	public Gizmo(String maker, boolean isElectronic, int id) {
		super();
		this.maker = maker;
		this.isElectronic = isElectronic;
		this.id = id;
	}

	/** Returns the name of the manufacturer of this Gizmo. */
	public String getMaker() {
		return maker;
		/* implementation not shown */ }

	/**
	 * Returns true if this Gizmo is electronic, and false otherwise.
	 */
	public boolean isElectronic() {
		return isElectronic;
		/* implementation not shown */ }

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gizmo other = (Gizmo) obj;
		return id == other.id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public void setElectronic(boolean isElectronic) {
		this.isElectronic = isElectronic;
	}
}

package boat;

public class DragonBoat extends Boat {
	private String color = "red";

	public String getColor() {
	return color;
	}

	public void setColor(String color) {
	this.color = color;
	}

	public DragonBoat(String name) {
	super(name);
	}

	public DragonBoat(String name, String color) {
	super(name);
	this.color = color;
	}

	@Override
	public String toString() {
	return "DragonBoat [name=" + getName() + "color=" + color + "]";
	}
}

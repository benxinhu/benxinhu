package boat;

public class LittleBoat extends Boat{
	private String color = "blue";

	public String getColor() {
	return color;
	}

	public void setColor(String color) {
	this.color = color;
	}

	public LittleBoat(String name) {
	super(name);
	}

	public LittleBoat(String name, String color) {
	super(name);
	this.color = color;
	}

	@Override
	public String toString() {
	return "LittleBoat [name=" + getName() + "color=" + color + "]";
	}
	
	@Override
	public void Start(){
		System.out.println("LittleBoat " + getName() + " Fighting");
	}
}

package boat;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boat boat;
		boat = new DragonBoat("Shanghai Team");
		System.out.println(boat);
		boat= new DragonBoat("Zhejiang Team", "yellow");
		System.out.println(boat);
		boat.Start();
		
		boat = new LittleBoat("Shanghai Team");
		System.out.println(boat);
		boat= new LittleBoat("Zhejiang Team", "green");
		System.out.println(boat);
		boat.Start();
	}	

}

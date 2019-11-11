package laboratornuerobotu;

public class Laba1Taxi {
	public static int Rashod(int z, int y) {
		int rashodNa100Kilometrov = z * y;
		return rashodNa100Kilometrov;
		
	}

	public static void main(String[] args) {
		CarCharacteristic [] taxi = new CarCharacteristic[5];
		taxi[0] = new CarCharacteristic("BMW", 1500, 230000, 15);
		taxi[1] = new CarCharacteristic("Renault",2500,150000,10);
		taxi[2] = new CarCharacteristic("Opel",1000,200000,13);
		taxi[3] = new CarCharacteristic("Subaru",2000,280000,20);
		taxi[4] = new CarCharacteristic("BMW", 1500, 230000, 15);	
		for (CarCharacteristic taxis:taxi) {
			System.out.println(taxis);
		}
		int c = Rashod(CarCharacteristic.getCostOfPetrol(), 100);
		System.out.println("Расход топлива на 100 км = " + c + "грн");
	}

}
class CarCharacteristic{
	private String mark;
	private int weight;
	private int cost;
	private int costOfRide;
	private static int costOfPetrol = 36;
	
	public CarCharacteristic(String m, int w, int c) {
		this.mark = m;
		this.weight = w;
		this.cost = c;
	}
	public CarCharacteristic(String m, int w, int c, int co) {
		this(m, w, c);
		this.costOfRide = co;
	}
	@Override
	public String toString() {
		return "CarCharacteristic [mark=" + mark + ", weight=" + weight + ", cost=" + cost + ", costOfRide="
				+ costOfRide + "]";
	}
	public void setMark(String carMark) {
		mark = carMark;
	}
	public String getMark() {
		return mark;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getCostOfRide() {
		return costOfRide;
	}
	public void setCostOfRide(int costOfRide) {
		this.costOfRide = costOfRide;
	}
	public static int getCostOfPetrol() {
		return costOfPetrol;
	}
	public static void setCostOfPetrol(int costOfPetrol) {
		CarCharacteristic.costOfPetrol = costOfPetrol;
	}
}
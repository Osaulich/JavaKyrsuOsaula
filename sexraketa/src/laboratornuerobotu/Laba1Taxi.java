package laboratornuerobotu;

public class Laba1Taxi {

	public static void main(String[] args) {
		Cars taxi1 = new Cars();
		taxi1.setMark("BMW");
		taxi1.setWeight(1500);
		taxi1.setCost(230000);
		taxi1.setCostOfRide(15);
		Cars taxi2 = new Cars();
		taxi2.setMark("Renault");
		taxi2.setWeight(2500);
		taxi2.setCost(150000);
		taxi2.setCostOfRide(10);
		Cars taxi3 = new Cars();
		taxi3.setMark("Opel");
		taxi3.setWeight(1000);
		taxi3.setCost(200000);
		taxi3.setCostOfRide(13);
		Cars taxi4 = new Cars();
		taxi4.setMark("Subaru");
		taxi4.setWeight(2000);
		taxi4.setCost(280000);
		taxi4.setCostOfRide(20);
		System.out.println("Марка - " +taxi1.getMark() + " Вес автомобиля - " +taxi1.getWeight() + " Количество колёс - " +taxi1.getNumOfWheels() + " Цена автомобиля - " +taxi1.getCost() + " ЦенаПоездкиЗа1км - " +taxi1.getCostOfRide() );
		System.out.println("Марка - " +taxi2.getMark() + " Вес автомобиля - " +taxi2.getWeight() + " Количество колёс - " +taxi2.getNumOfWheels() + " Цена автомобиля - " +taxi2.getCost() + " ЦенаПоездкиЗа1км - " +taxi2.getCostOfRide() );
		System.out.println("Марка - " +taxi3.getMark() + " Вес автомобиля - " +taxi3.getWeight() + " Количество колёс - " +taxi3.getNumOfWheels() + " Цена автомобиля - " +taxi3.getCost() + " ЦенаПоездкиЗа1км - " +taxi3.getCostOfRide() );
		System.out.println("Марка - " +taxi4.getMark() + " Вес автомобиля - " +taxi4.getWeight() + " Количество колёс - " +taxi4.getNumOfWheels() + " Цена автомобиля - " +taxi4.getCost() + " ЦенаПоездкиЗа1км - " +taxi4.getCostOfRide() );

	}

}
class Cars{
	private String mark;
	private int weight;
	private int cost;
	private int costOfRide;
	private static int numOfWheels = 4;
	
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
	public static int getNumOfWheels() {
		return numOfWheels;
	}
	public static void setNumOfWheels(int numOfWheels) {
		Cars.numOfWheels = numOfWheels;
	}
	public int getCostOfRide() {
		return costOfRide;
	}
	public void setCostOfRide(int costOfRide) {
		this.costOfRide = costOfRide;
	}
}
package encapsulation;

public class Run {
	public static void main(String[] args) {

		Food food = new Food();
		food.setName("김치찌개");
		food.setKcal(550);
		System.out.println(food);
	}
}

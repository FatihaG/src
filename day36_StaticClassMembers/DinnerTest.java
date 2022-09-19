package day36_StaticClassMembers;

public class DinnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		Dinner mom=new Dinner();
		Dinner kid=new Dinner();
		Dinner dad=new Dinner();
		
		
		System.out.println("Totatl slices:"+ Dinner.pizzaSlice);
		
		dad.takeASlice();
		mom.takeASlice();
		kid.takeASlice();
		
		System.out.println(Dinner.pizzaSlice);
		kid.takeASlice(3);
        dad.takeASlice(2);;
        System.out.println(Dinner.pizzaSlice);

		
		
	}

}

package day_34_constructor_passingObjectToMethod;

public class DiceTest {

	public static void main(String[] args) {

		final int SIX_SIDES=6;
		final int TWENTY_SIDES=20;
		
		Dice a=new Dice(SIX_SIDES);
		Dice b=new Dice(TWENTY_SIDES);
		rollDice(a);
	}

	
	public static void rollDice(Dice d) {
		//rolling a 6 ided dice
		//the dice value is 5
		System.out.println("rolling a "+d.getSides()+ " sided dice");
		//d.roll(); cunku constructor da call yapmis oluyoruz
		
		System.out.println("The dice value: "+ d.getValue());
		
	}
}

package day43_polymorphism;

public class fatihatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		kadin fatiha = new kadin();
		
		
		//System.out.println (fatiha.kafa());
		fatiha.kafa();
		fatiha.goz="yesil";
				System.out.println(fatiha.goz);
				
			System.out.println("****************");	
		
		muslumanKadin fatiha1 = new muslumanKadin () ;
		
		fatiha1.kafa();
		System.out.println(fatiha1.goz);
		
		
		System.out.println("****************");
		
		
	
		
		kadin fatiha2= new muslumanKadin ();
		
		fatiha2.kafa();//saclar
		System.out.println(fatiha2.goz);
		System.out.println(fatiha2.kafa);
		
		System.out.println("****************");
		muslumanKadin fatiha3 =new muslumanKadin();
		
		fatiha3.kafa();//basortusu
		kadin.kafa();  //saclar
		System.out.println(fatiha3.goz);
		System.out.println(fatiha3.kafa);
		System.out.println(fatiha3.sacrengi);
	    
		
		
		
	}

}

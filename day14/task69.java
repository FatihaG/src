package day14;

public class task69 {

	public static void main(String[] args) {
		
    boolean sayi= primeNumber(2);
     
		System.out.println(sayi);
	}

	public static boolean primeNumber(int num) {
	    
		boolean prime=true;
		if (num==0||num==1) {
			prime=false;
		}else {
		for (int i=2;i<=num;i++) {
			if (num%i==0) {
				prime= false;
				break;
			}
			}
	}
	return prime;

 }
}
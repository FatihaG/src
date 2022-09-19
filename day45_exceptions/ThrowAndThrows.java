package day45_exceptions;

public class ThrowAndThrows {

	public static void main(String[] args) throws InterruptedException  {

		System.out.println("Hello World");
		
		//throw new RuntimeException ("This is some exception");
		
		//throw new Exception("Another exception");//checked exception,you need to handle it that's why throws exception
		
		
		String username= " ";
		
		if (username.isEmpty()) {
			throw new RuntimeException("username can not be empty");
		}else {
			System.out.println("valid usename");
		}
		
		sleep3(2);//you need to handle or declare
		
		
	}

	
	public static void sleep (int seconds) throws InterruptedException {
		Thread.sleep(1000);
	}
	
	public static void sleep2 (int seconds) throws InterruptedException {
		sleep(seconds);//kim cagirdiysa methodu o handle etmeli veya declare etmeli
	}
	
	
	public static void sleep3(int seconds) throws InterruptedException {
		sleep2(seconds);
	}
	
	
}

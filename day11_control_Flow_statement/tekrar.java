package day11_control_Flow_statement;

public class tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//task 40
		
		for (int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		//task41
		System.out.println();
		for (int b=5;b<=140;b++) {
			if(b%2==1) {
				System.out.print(b+" ");
			}
		}
	System.out.println();
		//task 42
		int sumE=0;
		int sumO=0;
	for (int e=1;e<100;e++) {
		if (e%2==0) {
			sumE=sumE+e;
			
		}	}
		System.out.println("sum of even: "+ sumE);
	
		for (int O=1;O<100;O++) {
			if(O%2==1) {
				sumO=sumO+O;
			}}
			System.out.println("sum of odd: "+sumO);
		
		//task 43
			
			
			for (int num=1;num<=10;num++) {
				int square=num*num;
				System.out.println(num+"   "+square);
				
			}
				//task 44
			double mph;
		for (int kph=60;kph<=130;kph+=10) {
			
			mph=kph*0.6214;
			System.out.println(kph+"     "+mph);
		}
		
		//task 45
		
		int num1=6;
		int num2=6;
		int repeat=2;
		
		for (int i=1;i<=repeat;i++) {
			if (num1>num2) {
				System.out.println(num1+" is greater than "+num2);
				
			}else if (num2>num1) {
				System.out.println(num2+" is greater than "+num1);
				
			}else {
				System.out.println("they are equal!");
			}
			
			//task46
			
			for (int s=1;s<=10;s++) {
				int sayi=7;
				System.out.println(sayi+"*"+s+ " = "+sayi*s);
			}
			
			
			//task47
			
			int row=7;
			int column=6;
			
			for (int h=1;h<=row;h++) {
				for(int g=1;g<=column;g++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			
			//task 48
			/*int row1=7;
			
			
			for (int h=1;h<=row1;h++) {
				for(int t=1;t<=h;t++) {
					System.out.print("*");
				}
				System.out.println();
			}
			*/
			
			//task 49
	int row1=7;
			
			
			for (int h=1;h<=row1;h++) {
				for(int t=1;t<=h;t++) {
					System.out.print(" ");
				}
				System.out.println("#");
			}
			
			
			
			//task 50
			
			for (int f=1;f<=5;f++) {
				for(int y=1;y<=f;y++) {
					System.out.print(y+" ");
				
			} System.out.println();
			}
		}
		
		//task52
		
		int p=25;
		while (p>10) {
			System.out.println("hello");
			
			p--;
		}
		
		
		//task 53
		int tope=0;
		int q=0;
		while (q<=100) {
			if (q%2==0) {
				
				tope=tope+q;
				
			}
			q++;
		}
		System.out.println("toplam: "+tope);
	}

}

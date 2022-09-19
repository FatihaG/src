package assignments;

public class Lab1 {

	public static void main(String[] args) {
		System.out.println("Question 1");
		stringTimes("Hi",2);
		stringTimes("Hi",3);
		stringTimes("Hi",1);
		
		System.out.println("QUESTION 2");
		love6(6,4);
		love6(4,5);
		love6(1,5);
		love6(12,6);
		System.out.println("Question 3");
		specialEleven(22);
		specialEleven(23);
		specialEleven(24);
		System.out.println("Question 4");
		deerPlay(70,false);
		deerPlay(95,false);
		deerPlay(95,true);
		System.out.println("Question 5");
		caoughtSpeeding(60,false);
		caoughtSpeeding(65,false);
		caoughtSpeeding(65,true);
		
		System.out.println("Question 6");
		cigarParty(30,false);
		cigarParty(50,false);
		cigarParty(70,true);

	}

	public static void stringTimes(String x,int a) {
		
		if (a>0) {
			for (int i=1;i<=a;i++) {
		
			System.out.print(x);
		}
			System.out.println();
		}
		
	}
	

    public static void love6(int num1,int num2) {
    	if (num1==6 ||num2==6||num1+num2==6||num1-num2==6||num2-num1==6) {
    		System.out.println("true");
    	}else {
    		System.out.println("false");
    	}
    }
				
	public static void specialEleven(int num) {
		if (num%11==0 || num%11==1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
				
   public static void deerPlay (int tem,boolean summer) {
	   if (summer==true) {
		   if (tem>=60 && tem<=100) {
			   System.out.println("true");
		   }else {
			   System.out.println("false");
		   }
		   }else if (summer == false) {
			   if (tem>=60&& tem<=90) {
				   System.out.println("true");
				   }else {
					   System.out.println("false");
				   }
		   } 
   }
	
   public static void caoughtSpeeding(int speed,boolean bday) {
	   if (bday==false) {
		   if (speed<=60) {
			   System.out.println("0");
		   }else if (speed>60&&speed<=80){
			   System.out.println("1");
		   }else if (speed >80) {
			   System.out.println("2");
		   }
	   }else if (bday==true) {
		   if (speed<=65) {
			   System.out.println("0");
		   }else if (speed >65&&speed<=85) {
			   System.out.println("1");
		   }else if (speed>85) {
			   System.out.println("2");
		   }
	   }
   }
   
   public static void cigarParty (int numC,boolean weekend) {
	   if (weekend==false) {
		   if (numC>=40&&numC<=60) {
			   System.out.println("true");
		   }else {
			   System.out.println("false");
		   }
	   }if (weekend==true) {
		   if (numC>=40) {
			   System.out.println("true");
		   }else {
			   System.out.println("false");
		   }
	   }
   }
   
   
}

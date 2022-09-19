package day30_wrapperClass;

public class ParsingValues {

	public static void main(String[] args) {

		String numberAsString="2018";
		System.out.println(numberAsString);
		
		int number= Integer.parseInt(numberAsString);
		
		System.out.println(numberAsString);
		
		numberAsString=numberAsString+1;
		
		number=number+1;
		
		System.out.println(numberAsString);
		System.out.println(number);
		
		double number2=Double.parseDouble(numberAsString);
		System.out.println(number2);
		
		int i=10;
		String s=String.valueOf(i);
		System.out.println(s);//it will return "10" string
		
		String s2=Integer.toString(i);
		System.out.println(s2);// it will return "10" string
		
		
		int a=1234321;
		String b=String.valueOf(a);
		System.out.println(b);
		String k="";
		
		for(int j =b.length()-1;j>=0;j--) {
			
			k=k+b.charAt(j);
			
		}
		System.out.println(k);
		
		if(b.equals(k)) {
			System.out.println("oleeeyyyyy");
		}
		
		
	}

}

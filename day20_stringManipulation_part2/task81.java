package day20_stringManipulation_part2;

public class task81 {

	public static void main(String[] args) {
	
		
		String time= "10/10/2019 14:59:00";
		System.out.println(timeStamp(time));
	}
	
	public static String timeStamp(String time) {
		
		time= time.replace("/","").replace(" ","").replace(":", "");
       
		return time;
		
	}

}

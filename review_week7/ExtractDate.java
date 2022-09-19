package review_week7;

public class ExtractDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

	public static String extraMonth(String date) {
		String month=date.substring(0,date.indexOf('/'));
		String day=date.substring(date.indexOf('/')+1,date.lastIndexOf('/'));
		String fixedDate="";
		switch(month) {
		case "01":
			fixedDate="January";
			break;
		case "02":
			fixedDate="February";
			break;
		case "03":
			fixedDate="March";
			break;
		case "04":
			fixedDate="April";
			break;
			
			//etc..date
			
			
			
		}
		return fixedDate+" "+day;
	}
	
}

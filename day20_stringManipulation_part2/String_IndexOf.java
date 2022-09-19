package day20_stringManipulation_part2;

public class String_IndexOf {

	public static void main(String[] args) {
		
		String word1="github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));
		
		System.out.println(word1.indexOf("java"));
		
		String url="www.okta.com";
		int i=url.indexOf(".");
		System.out.println("pos of . "+ i);
		System.out.println(url.charAt(i+1));
		
		
		//find position of '-' and check is space in right and left side
		
		String title="Java - Google search";
		
		int a=title.indexOf("-");
	
		System.out.println(title.charAt(a-1));
		System.out.println(title.charAt(a+1));
		System.out.println("apple");
		
		String country="United States of America";
		int states=country.indexOf("States");
		System.out.println("position of states "+ states);
		
		
		String word2="java,c++,python,tomcat,eclipse";
		
		boolean bool=(word2.contains("c++"));
		System.out.println("contains c++ "+bool);
		
		if (word2.indexOf("c++")>-1) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ isn't there");
		}
			
		}
	

	}


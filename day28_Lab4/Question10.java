package day28_Lab4;

public class Question10 {

	public static void main(String[] args) {

		int[]x= {2,2};
		int[]y= {3,3};
		int[]z= {2,3};
		int[]a= {2,4,56,43,3};
		int[]b= {2,2,2};
		
		System.out.println(twothree(x));
		System.out.println(twothree(y));
		System.out.println(twothree(z));
		System.out.println(twothree(a));
		System.out.println(twothree(b));
		
		
		
	}

	
	
	public static boolean twothree (int[] num) {
		
		
		int two=0;
		int three=0;
		
		for (int i=0;i<num.length;i++) {
			if (num[i]==2) {
				two++;
			} else if (num[i]==3){
				three++;
			}
		}
			if (two==2 || three==2) {
				return true;
			}else {
				return false;
			}
		
		}
	}
	


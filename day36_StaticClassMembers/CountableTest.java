package day36_StaticClassMembers;

public class CountableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int objectCount;
		
		Countable obj1=new Countable();//0+1=1
		Countable obj2=new Countable();//1+1=2
		
		Countable obj3=new Countable();//2+1=3
		
		objectCount=obj1.getInstanceCount();
		
		System.out.println(objectCount);
		System.out.println(Countable.instanceCount);// because it belongs to class.
	}

}

package PeopleArray;

public class Person {
	
	private String name;
	private int age;
	
	public Person(){
		name=null;
		age=0;
	}
	
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return name+"\t"+age+"\n";
	}

}

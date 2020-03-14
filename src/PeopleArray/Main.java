package PeopleArray;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Person array[]= new Person[20];
		Scanner sc = new Scanner(System.in);
		String name;
		int i=0,age;
		System.out.print("Enter a name: ");
		name=sc.next();
		while(!name.equals("EXIT")) {
			System.out.print("Please "+name+" enter your age: ");
			age = sc.nextInt();
			array[i] = new Person(name,age);
			i++;
			System.out.print("Enter a name: ");
			name=sc.next();
		}
		System.out.print("\nName \t Age\n\n\n");
		for(int j=0;j<i;j++)
			System.out.print(array[j]);
		
		sc.close();
	}
	
}

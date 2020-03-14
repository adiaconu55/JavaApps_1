package Matrix;

import java.util.Scanner;

public class MatrixCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Matrix a = new Matrix();
		a.setMat(2,sc);
		a.show();
		System.out.print("Enter your operation ( + : add 2 matrixes, - : subtract 2 matrixes, n : negate a matrix, c : multiply by a constant): ");
		char c;
		c=sc.next().charAt(0);
		
		switch(c) {
		
		case '+': System.out.print("Enter second Matrix:\n"); Matrix b = new Matrix(); b.setMat(2,sc); b.show(); a.plus(b).show(); break;
		case '-': System.out.print("Enter second Matrix:\n"); Matrix d = new Matrix(); d.setMat(2,sc); d.show(); a.minus(d).show(); break;
		case 'n': a.negative(); a.show(); break;
		case 'c': System.out.print("Enter a constant: "); int x=sc.nextInt(); a.multiplyByConstant(x); a.show(); break;
		
		}
		
		sc.close();
	}
	
}

package Matrix;

import java.util.Scanner;

public class Matrix {

	private int matrix[][];
	private int dim;
	
	public Matrix() {
		
		matrix=null;
		dim=0;
	
	}
	
	public Matrix(int dim) {
		this.dim=dim;
		matrix= new int[dim][dim];
	}
	
	public void setMat(int dim,Scanner sc) {
		
		this.dim = dim;
		System.out.print("Enter elements: ");
		matrix = new int[dim][dim];
		for(int i=0;i<dim;i++)
			for(int j=0;j<dim;j++)
				matrix[i][j]=sc.nextInt();
	}
	
	public void show() {
		for(int i=0;i<dim;i++) {
			for(int j=0;j<dim;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.print("\n");
		}
	}
	
	public Matrix plus(Matrix obj){
		System.out.print("\n");
		if(dim==obj.dim) {
			Matrix c= new Matrix(dim);
			c.dim=dim;
			for(int i=0;i<dim;i++)
				for(int j=0;j<dim;j++)
					c.matrix[i][j]=matrix[i][j]+obj.matrix[i][j];
			return c;
		}
		else
			System.out.print("Dimensions are different !");
			return new Matrix();
	}
	
	public Matrix minus(Matrix obj) {
		System.out.print("\n");
		if(dim==obj.dim) {
			Matrix c= new Matrix(dim);
			c.dim=dim;
			for(int i=0;i<dim;i++)
				for(int j=0;j<dim;j++)
					c.matrix[i][j]=matrix[i][j]-obj.matrix[i][j];
			return c;
		}
		else
			System.out.print("Dimensions are different !");
			return new Matrix();
	}
	
	public void negative() {
		for(int i=0;i<dim;i++)
			for(int j=0;j<dim;j++)
				matrix[i][j]*=-1;
	}
	
	public void multiplyByConstant(int c) {
		for(int i=0;i<dim;i++)
			for(int j=0;j<dim;j++)
				matrix[i][j]*=c;
	}
}

package TicTacToe;

public class Board {

	public char[][] matrix;
	
	
	public Board() {
		matrix = new char[3][3];
		int k=0;
		char[] a= {'1','2','3','4','5','6','7','8','9'};
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++) {
				matrix[i][j]=a[k];
				k++;
			}
	}
	
	public void Display() {
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.print("\n");
		}
	}
		
	public int Test() {
		
		for(int i=0;i<3;i++) {
			boolean x=true;
			for(int j=0;j<3;j++) {
				if(matrix[i][0]!=matrix[i][j])
					x=false;
			}
			if(x) {
				if (matrix[i][0]=='X')
					return 1;
				else
					return 2;
			}
		}
		
		for(int j=0;j<3;j++) {
			boolean x=true;
			for(int i=0;i<3;i++) {
				if(matrix[0][j]!=matrix[i][j])
					x=false;
			}
			if(x) {
				if (matrix[0][j]=='X')
					return 1;
				else
					return 2;
			}
		}
		
		if(matrix[0][0]==matrix[1][1] && matrix[0][0]==matrix[2][2]) {
			if (matrix[0][0]=='X')
				return 1;
			else
				return 2;
		}
		if(matrix[0][2]==matrix[1][1] && matrix[0][2]==matrix[2][0]) {
			if (matrix[0][2]=='X')
				return 1;
			else
				return 2;
		}
		
		boolean x=true;
		
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				if(matrix[i][j]!='X' && matrix[i][j]!='O') {
					x=false;
				}
		if(x==true)
			return 3;
				
		return 0;
	}
		
	
}

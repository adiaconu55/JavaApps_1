package TicTacToe;


import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JToggleButton;


public class TicTacToe {

	private JFrame frame;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JLabel label;
	private JLabel player1;
	private JLabel player2;
	private JLabel Score1;
	private JLabel Score2;
	private Board board;
	private JToggleButton Oselect;
	private JToggleButton Xselect;
	private char t;
	private JButton Reset;
	private int Xscore;
	private int Oscore;

	public static void main(String args[]) {
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
	}

	public TicTacToe() {
		
		initialize();
		Xscore=0;
		Oscore=0;
		player1.setText(JOptionPane.showInputDialog(frame,"Enter Player 1 name: ",null)+" :");
		player2.setText(JOptionPane.showInputDialog(frame,"Enter Player 2 name: ",null)+" :");
		board = new Board();

		Listeners();	
	}

	public void initialize() {
		t=' ';
		frame = new JFrame("TicTacToe");
		frame.setBounds(500, 150, 850, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		b1 = new JButton("");
		b1.setForeground(Color.BLACK);
		b1.setFont(new Font("Tahoma", Font.BOLD, 99));
		b1.setBounds(0, 0, 200, 200);
		frame.getContentPane().add(b1);
		
		b2 = new JButton("");
		b2.setFont(new Font("Tahoma", Font.BOLD, 99));
		b2.setBounds(200, 0, 200, 200);
		frame.getContentPane().add(b2);
		
		b3 = new JButton("");
		b3.setFont(new Font("Tahoma", Font.BOLD, 99));
		b3.setBounds(400, 0, 200, 200);
		frame.getContentPane().add(b3);
		
		b4 = new JButton("");
		b4.setFont(new Font("Tahoma", Font.BOLD, 99));
		b4.setBounds(0, 200, 200, 200);
		frame.getContentPane().add(b4);
		
		b5 = new JButton("");
		b5.setFont(new Font("Tahoma", Font.BOLD, 99));
		b5.setBounds(200, 200, 200, 200);
		frame.getContentPane().add(b5);
		
		b6 = new JButton("");
		b6.setFont(new Font("Tahoma", Font.BOLD, 99));
		b6.setBounds(400, 200, 200, 200);
		frame.getContentPane().add(b6);
		
		b7 = new JButton("");
		b7.setFont(new Font("Tahoma", Font.BOLD, 99));
		b7.setBounds(0, 400, 200, 200);
		frame.getContentPane().add(b7);
		
		b8 = new JButton("");
		b8.setFont(new Font("Tahoma", Font.BOLD, 99));
		b8.setBounds(200, 400, 200, 200);
		frame.getContentPane().add(b8);
		
		b9 = new JButton("");
		b9.setFont(new Font("Tahoma", Font.BOLD, 99));
		b9.setBounds(400, 400, 200, 200);
		frame.getContentPane().add(b9);
		
		label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 28));
		label.setBounds(620, 260, 200, 50);
		frame.getContentPane().add(label);
		
		Xselect = new JToggleButton("X");
		Xselect.setForeground(Color.RED);
		Xselect.setFont(new Font("Tahoma", Font.BOLD, 99));
		Xselect.setBounds(650, 50, 150, 150);
		frame.getContentPane().add(Xselect);
		
		Oselect = new JToggleButton("O");
		Oselect.setForeground(Color.BLUE);
		Oselect.setFont(new Font("Tahoma", Font.BOLD, 99));
		Oselect.setBounds(650, 400, 150, 150);
		frame.getContentPane().add(Oselect);
		
		Reset = new JButton("RESET");
		Reset.setFont(new Font("Tahoma", Font.BOLD, 15));
		Reset.setBounds(677, 320, 89, 23);
		frame.getContentPane().add(Reset);
		
		player1 = new JLabel("Player 1 : ");
		player1.setFont(new Font("Tahoma",Font.BOLD,20));
		player1.setBounds(620,130,200,200);
		frame.getContentPane().add(player1);
		
		player2 = new JLabel("Player 2 : ");
		player2.setFont(new Font("Tahoma",Font.BOLD,20));
		player2.setBounds(620,270,200,200);
		frame.getContentPane().add(player2);
		
		Score1 = new JLabel("0");
		Score1.setFont(new Font("Tahoma",Font.BOLD,20));
		Score1.setBounds(750,130,200,200);
		frame.getContentPane().add(Score1);
		
		Score2 = new JLabel("0");
		Score2.setFont(new Font("Tahoma",Font.BOLD,20));
		Score2.setBounds(750,270,200,200);
		frame.getContentPane().add(Score2);
		
		frame.setVisible(true);
	}
	
	public void Listeners() {
		
		Reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				b1.setText("");
				b2.setText("");
				b3.setText("");
				b4.setText("");
				b5.setText("");
				b6.setText("");
				b7.setText("");
				b8.setText("");
				b9.setText("");
				t=' ';
				Xselect.setEnabled(true);
				Oselect.setEnabled(true);
				label.setText("");
				
			}
		});
		
		Xselect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Xselect.isSelected()) {
					t='X';
				}
				if(Oselect.isSelected()) {
					Oselect.setSelected(false);
					t='X';
				}
			}});
		
		Oselect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Oselect.isSelected())
					t='O';
				if(Xselect.isSelected()) {
					Xselect.setSelected(false);
					t='O';
				}
				
			}
		});
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(t=='X') {
				setX(b1);
				board.matrix[0][0]='X';
			}
				else if(t=='O') {
					setO(b1);
					board.matrix[0][0]='O';
				}
			isWin();
			}});
		
b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(t=='X') {
				setX(b2);
				board.matrix[0][1]='X';
			}
				else if(t=='O') {
					setO(b2);
					board.matrix[0][1]='O';
			}
				isWin();	
			}});

b3.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(t=='X') {
			setX(b3);
			board.matrix[0][2]='X';			
		}
		else if(t=='O') {
			setO(b3);
			board.matrix[0][2]='O';	
		}
		isWin();
	}
});

b4.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(t=='X') {
			setX(b4);
			board.matrix[1][0]='X';			
		}
		else if(t=='O') {
			setO(b4);
			board.matrix[1][0]='O';	
		}
		isWin();
	}
});

b5.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(t=='X') {
			setX(b5);
			board.matrix[1][1]='X';			
		}
		else if(t=='O') {
			setO(b5);
			board.matrix[1][1]='O';	
		}
		isWin();
	}
});

b6.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(t=='X') {
			setX(b6);
			board.matrix[1][2]='X';			
		}
		else if(t=='O') {
			setO(b6);
			board.matrix[1][2]='O';		
		}
		isWin();
	}
});

b7.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(t=='X') {
			setX(b7);
			board.matrix[2][0]='X';			
		}
		else if(t=='O') {
			setO(b7);
			board.matrix[2][0]='O';	
		}
		isWin();
	}
});

b8.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(t=='X') {
			setX(b8);
			board.matrix[2][1]='X';			
		}
		else if(t=='O') {
			setO(b8);
			board.matrix[2][1]='O';		
		}
		isWin();
	}
});

b9.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(t=='X') {
			setX(b9);
			board.matrix[2][2]='X';			
		}
		else if(t=='O') {
			setO(b9);
			board.matrix[2][2]='O';	
		}
		isWin();
	}
});
	}

	public void setX(JButton obj) {
		if(obj.getText()!="X" && obj.getText()!="O") {
			obj.setText("X");
			
		}
	}
	
	public void setO(JButton obj) {
		if(obj.getText()!="X" && obj.getText()!="O") {
			obj.setText("O");
		}
	}
	
	public void isWin() {
		if(board.Test()==1) {
			Xselect.setSelected(false);
			Oselect.setSelected(false);
			Xselect.setEnabled(false);
			Oselect.setEnabled(false);
			t=' ';
			Xscore++;
			Score1.setText(Integer.toString(Xscore));
			board = new Board();
			label.setText("X a castigat !");
		}
		else if(board.Test()==2) {
			Xselect.setSelected(false);
			Oselect.setSelected(false);
			Xselect.setEnabled(false);
			Oselect.setEnabled(false);
			t=' ';
			Oscore++;
			Score2.setText(Integer.toString(Oscore));
			board = new Board();
			label.setText("O a castigat !");
		}
		else if(board.Test()==3)
		{
			Xselect.setSelected(false);
			Oselect.setSelected(false);
			Xselect.setEnabled(false);
			Oselect.setEnabled(false);
			t=' ';
			label.setText("Remiza !");
		}
	}
}

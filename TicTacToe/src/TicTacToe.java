import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener {
	Random random = new Random();
	JFrame frame = new JFrame();
	JPanel title_panel = new JPanel();
	JPanel button_panel = new JPanel();
	JLabel textfield = new JLabel();
	JButton[] buttons = new JButton[9];
	boolean player1_turn;
	
	TicTacToe(){
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setSize(800,800);
	   frame.getContentPane().setBackground(new Color(40,40,40));
	   frame.setLayout(new BorderLayout());
	   frame.setVisible(true);
	   
	   textfield.setBackground(new Color(50,50,50));
	   textfield.setForeground(Color.pink);
	   textfield.setFont(new Font("Comic San MS",Font.BOLD,75));
	   textfield.setHorizontalAlignment(JLabel.CENTER);
	   textfield.setText("TIC-TAC-TOE");
	   textfield.setOpaque(true);
	
	   title_panel.setLayout(new BorderLayout());
	   title_panel.setBounds(0,0,800,1000);
	   
	   title_panel.add(textfield);
	   frame.add(title_panel,BorderLayout.NORTH);
	   
	   button_panel.setLayout(new GridLayout(3,3));
	   button_panel.setBackground(new Color(100,100,100));
	   
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public void firstTurn()
	{
		
	}
	
	public void check() {
		
		
	}
	
	public void xWins(int a,int b,int c) {
    }
	
	public void oWins(int a,int b,int c) {
    }
}


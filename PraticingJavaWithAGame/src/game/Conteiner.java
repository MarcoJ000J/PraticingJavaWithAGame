package game;

import javax.swing.JFrame;

import gameModel.Level;

public class Conteiner extends JFrame{
	
	public Conteiner() {
		setSize(1025, 728);
		setResizable(false);
		setLocationRelativeTo(null);
		
		setTitle("Nah haha");
		
		//ADD
		add(new Level());
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String []args) {
		new Conteiner();
	}
	
}
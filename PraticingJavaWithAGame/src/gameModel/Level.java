package gameModel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Level extends JPanel implements ActionListener{
	
	private Image fundo1;
	private Player player;
	private Timer timer; 
	
	public Level() {
		setFocusable(true);
		setDoubleBuffered(true);
		
		ImageIcon ref = new ImageIcon("res\\blackground.jpg");	
		fundo1 = ref.getImage();
				
		player = new Player();
		player.load();
		
		addKeyListener(new TecladoAdapter());
		
		timer = new Timer(5, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		Graphics2D graphics = (Graphics2D) g;
		
		graphics.drawImage(fundo1, 0, 0, null);
		//graphics.drawImage(player.getPlayer(), player.getX(), player.getY(), this);
		
		g.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		player.update();
		repaint();
	}
	
	private class TecladoAdapter extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			player.KeyPressed(e);

		}
		@Override
		public void keyReleased(KeyEvent e) {
			player.KeyRelease(e);
		}
	}
}
package Projetil;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Projetil extends JPanel implements Runnable{
	int largura = 1200;
	int altura = 800;
	final int FPS = 60;
	Thread tiroThread;	
	
	Projetil() {
		this.setPreferredSize(new Dimension(largura, altura));
		this.setBackground(new Color(60,030,180));
		this.setLayout(null);
	}
	
	public void inicio() {
		tiroThread = new Thread(this);
		tiroThread.start();
	}
	
	public class Teclado {
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}

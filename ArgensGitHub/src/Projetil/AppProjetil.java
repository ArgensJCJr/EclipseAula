package Projetil;

import javax.swing.JFrame;

public class AppProjetil extends JFrame{
	public static void main(String[] args) {
		new AppProjetil();
		
	}
	
	AppProjetil (){
		setTitle ("PROJETEIS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		Projetil projetil = new Projetil();
		add(projetil);
		pack();
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
}

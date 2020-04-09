package programacao2.aula09.swing.aovivo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import jogogenius.ComputadorDTO;

public class OuvinteComputador extends Jogo implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Cliquei no botao computador");
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				// esta parte do progrma entre um a thread.
				try {
					for (int i = 0; i < 5; i++) {
						IntroducaoJogoPrincipalGenius.botaoLaranja.setSelected(true);
						Thread.sleep(200);
						IntroducaoJogoPrincipalGenius.botaoLaranja.setSelected(false);
						Thread.sleep(200);
					}
				} catch (Exception e1) {
					System.out.println("Problemas com o metodo sleep da classe Thread");
				}
				// fim
			}
		}).start();

	}

}

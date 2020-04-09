package programacao2.aula09.swing.aovivo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import jogogenius.ComputadorDTO;

public class OuvinteComputadorOLD extends IntroducaoJogoPrincipalGenius implements ActionListener {

	/*
	 * 
	 * Etapa 01 new Thread(new Runnable() {
	 * 
	 * 
	 * } );
	 * 
	 * Etapa 02 new Thread(new Runnable() {
	 * 
	 * @Override public void run() { // Código para o cotão piscar
	 * 
	 * }
	 * 
	 * } );
	 * 
	 * Etapa 03 new Thread(new Runnable() {
	 * 
	 * @Override public void run() { try { // Botoes pra piscar } } catch
	 * (InterruptedException e) { e.printStackTrace(); }
	 * JOptionPane.showMessageDialog(null, "Tente acertar a sequencia.");
	 * 
	 * } }).start();
	 */

	// sem thread
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("Cliquei no botao Computador");
//		for (int i = 0; i < 15; i++) {
//			try {
//				Thread.sleep(200);
//				IntroducaoJogoPrincipalGenius.botaoAzul.setSelected(false);
//				Thread.sleep(200);
//				IntroducaoJogoPrincipalGenius.botaoAzul.setSelected(true);
//			} catch (InterruptedException e1) {
//				e1.printStackTrace();
//			}
//		}
//	}

	// com thread
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Cliquei no botao Computador");

		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 15; i++) {
					try {
						Thread.sleep(200);
						IntroducaoJogoPrincipalGenius.botaoAzul.setSelected(false);
						Thread.sleep(200);
						IntroducaoJogoPrincipalGenius.botaoAzul.setSelected(true);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}
			}

		}).start();
	}

}

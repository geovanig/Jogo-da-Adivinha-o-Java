package com.pratica;

import javax.swing.JOptionPane;

public class Aula {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "          Ol�, vamos jogar!");
		JOptionPane.showMessageDialog(null, "Irei escolher um n�mero entre 0 e 100\n"
				                       + "        Voc� tentar� adivinhar");
		
		int number = (int)(Math.random() * 100);
		int palpite = Integer.parseInt(JOptionPane.showInputDialog("J� escolhi meu n�mero, qual voc� acha que �?"));
		
		int count = 1
				;
		while (true) {
			if (palpite > number) {
				count ++;
				palpite = Integer.parseInt(JOptionPane.showInputDialog("N�o � esse n�mero, chute mais baixo"));
			}else if (palpite < number) {
				count ++;
				palpite = Integer.parseInt(JOptionPane.showInputDialog("N�o � esse n�mero, tente chutar mais alto"));
			}else {
				JOptionPane.showMessageDialog(null, "                  Exato! Escolhi o n�mero "+number+
						                      "\nObrigado por jogar, voc� acertou com "+count+" tentativas");
				break;
			}	
		}
	}
	
}



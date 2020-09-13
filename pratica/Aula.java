package com.pratica;

import javax.swing.JOptionPane;

public class Adivinha {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "          Olá, vamos jogar!");
		JOptionPane.showMessageDialog(null, "Irei escolher um número entre 0 e 100\n"
				                       + "        Você tentará adivinhar");
		
		try {
			int number = (int)(Math.random() * 100);
			int palpite = Integer.parseInt(JOptionPane.showInputDialog("Já escolhi meu número, qual você acha que é?"));
			
			int count = 1;
			
			while (true) {
				if (palpite > number) {
					count ++;
					palpite = Integer.parseInt(JOptionPane.showInputDialog("Não é esse número, chute mais baixo"));
				}else if (palpite < number) {
					count ++;
					palpite = Integer.parseInt(JOptionPane.showInputDialog("Não é esse número, tente chutar mais alto"));
				}else {
					JOptionPane.showMessageDialog(null, "                  Exato! Escolhi o número "+number+
							                      "\nObrigado por jogar, você acertou com "+count+" tentativas");
					break;
				}	
			}
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao digitar o número, reinicie o programa!");
		}
		
	}
	
}
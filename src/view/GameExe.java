package view;

import java.util.Scanner;

import model.Calcular;

public class GameExe {

	static Scanner tecl = new Scanner(System.in);
	static int pontos = 0;
	static Calcular calc;
	
	public static void main(String[] args) {
		GameExe.jogar();
	}

	public static void jogar() {
		System.out.println("Informe o nivel de dificuldade desejado [1, 2, 3 ou 4]: ");
		int difculdade = GameExe.tecl.nextInt();
		
		GameExe.calc = new Calcular(difculdade);
		
		System.out.println("Informe o seultado para a seguinte operação: ");
		
		
		/*Soma*/
		if(calc.getOperacao() == 0) {
			System.out.println(calc.getVal1() + " + " + calc.getVal2());
			int resposta = GameExe.tecl.nextInt();
			
			if(calc.soma(resposta)) {
				GameExe.pontos += 1;
				System.out.println("Você tem " + GameExe.pontos + " ponto(s).");
			}else {
				System.out.println("Resposta errada!");
			}
		}
		
		/*Subtração*/
		else if(calc.getOperacao() == 1) {
			System.out.println(calc.getVal1() + " - " + calc.getVal2());
			int resposta = GameExe.tecl.nextInt();
			
			if(calc.subtracao(resposta)) {
				GameExe.pontos += 1;
				System.out.println("Você tem " + GameExe.pontos + " ponto(s).");
			}else {
				System.out.println("Resposta errada!");
			}
		}
		
		/*Multiplicação*/
		else if(calc.getOperacao() == 2) {
			System.out.println(calc.getVal1() + " * " + calc.getVal2());
			int resposta = GameExe.tecl.nextInt();
			
			if(calc.multiplicacao(resposta)) {
				GameExe.pontos += 1;
				System.out.println("Você tem " + GameExe.pontos + " ponto(s).");
			}else {
				System.out.println("Resposta errada!");
			}
		}else {
			System.out.println("A operação " + calc.getOperacao() + "não é reconhecida.");
		}
		
		System.out.println("Deseja continuar? [1 - sim, 0 - não]");
		int continuar = GameExe.tecl.nextInt();
		
		if(continuar == 1) {
			GameExe.jogar();
		}else {
			System.out.println("Você fez " + GameExe.pontos + " ponto(s).");
			System.out.println("Até a proxima!");
			System.exit(0);
		}
		
	}
}

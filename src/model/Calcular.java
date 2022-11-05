package model;

import java.util.Random;

public class Calcular {
	
	private int nivelDif;
	private int val1;
	private int val2;
	private int operacao;
	private int resultado;
	
	/**
	 * Tem como função randomizar os vlaores 01 e 02
	 * do jogo baseado na dificuldade.
	 * 
	 * @param nivelDif
	 * é a variavel que determina a dificuldade do jogo:
	 * 1 = facil;
	 * 2 = medio;
	 * 3 = dificil;
	 * 4 = ultra;
	 * outros valores = insano.
	 */
	public Calcular(int nivelDif) {
		
		Random alet = new Random();
		
		this.operacao = alet.nextInt(3); // 0 -> somar, 1 -> subtrair, 2 -> multiplicar.
		this.nivelDif = nivelDif;
		
		if(nivelDif == 1) {
			//facil
			this.val1 = alet.nextInt(11); //0 - 10 
			this.val2 = alet.nextInt(11); //0 - 10
		}else if(nivelDif == 2) {
			//medio
			this.val1 = alet.nextInt(101); //0 - 100
			this.val2 = alet.nextInt(101); //0 - 100
		}else if (nivelDif == 3) {
			//dificil
			this.val1 = alet.nextInt(1001); //0 - 1000
			this.val2 = alet.nextInt(1001); //0 - 1000
		}else if(nivelDif == 4) {
			//ultra
			this.val1 = alet.nextInt(10001); //0 - 10000
			this.val2 = alet.nextInt(10001); //0 - 10000
		}else {
			//insano
			this.val1 = alet.nextInt(100001);	//0 - 100000
			this.val2 = alet.nextInt(100001); //0 - 100000
		}
	}
	
	public int getNivelDif() {
		return nivelDif;
	}
	public int getVal1() {
		return val1;
	}
	public int getVal2() {
		return val2;
	}
	public int getOperacao() {
		return operacao;
	}
	public int getResultado() {
		return resultado;
	}

	@Override
	public String toString() {
		String op;
		
		if(this.getOperacao() == 0) {
			op = "Somar";
		}else if(this.getOperacao() == 1) {
			op = "Subtrair";
		}else if(this.getOperacao() == 2) {
			op = "Multiplicar";
		}else if(this.getOperacao() == 3) {
			op = "Divisão";
		}else {
			op = "Operação não reconhecida";
		}
		
		return "Valor 1 = " + this.getVal1() +
				"\nValor 2 = " + this.getVal2()+
				"\nDificuldade: " + this.nivelDif+
				"\nOperação: " + op;
	}
	
	/**
	 * Função de calculo de soma
	 * 
	 * @param resposta é o valor inserida pelo usuário
	 * @return deve exibir os valores, o resultado do calculo somado e se está correto ou não 
	 */
	public boolean soma(int resposta) {
		this.resultado = this.getVal1() + this.getVal2();
		boolean certo = false;
		
		if (resposta == this.getResultado()) {
			System.out.println("Resposta Correta!");
			certo = true;
		}else {
			System.out.println("Resposta Errada!");
		}
		System.out.println(this.getVal1() + " + " + this.getVal2() + " = " + this.getResultado());
		return certo;
	}
	/**
	 * Função de calculo de subtração
	 * 
	 * @param resposta é o valor inserida pelo usuário
	 * @return deve exibir os valores, o resultado do calculo subtraido e se está correto ou não 
	 */
	public boolean subtracao(int resposta) {
		this.resultado = this.getVal1() - this.getVal2();
		boolean certo = false;
		
		if (resposta == this.getResultado()) {
			System.out.println("Resposta Correta!");
			certo = true;
		}else {
			System.out.println("Resposta Errada!");
		}
		System.out.println(this.getVal1() + " - " + this.getVal2() + " = " + this.getResultado());
		return certo;
	}
	/**
	 * Função de calculo de multiplicação
	 * 
	 * @param resposta é o valor inserida pelo usuário
	 * @return deve exibir os valores, o resultado do calculo multiplicado e se está correto ou não 
	 */
	public boolean multiplicacao(int resposta) {
		this.resultado = this.getVal1() * this.getVal2();
		boolean certo = false;
		
		if (resposta == this.getResultado()) {
			System.out.println("Resposta Correta!");
			certo = true;
		}else {
			System.out.println("Resposta Errada!");
		}
		System.out.println(this.getVal1() + " * " + this.getVal2() + " = " + this.getResultado());
		return certo;
	}



}

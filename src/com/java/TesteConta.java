package com.java;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta();
		Conta contaPoupança = new Conta();
		Conta contaInvestimento = new Conta();
		
		contaCorrente.numero = 11;
		contaCorrente.saldo = 20.5;
		contaCorrente.cliente.nome = "Alex";
		contaCorrente.cliente.idade = 34;
		
		contaPoupança.numero = 22;
		contaPoupança.saldo = 30;
		contaPoupança.cliente.nome = "Leandro";
		contaPoupança.cliente.idade = 25;
		
		contaInvestimento.numero = 33;
		contaInvestimento.saldo = 40;
		contaInvestimento.cliente.nome = "Lucas";
		contaInvestimento.cliente.idade = 40;
		
		System.out.println("Conta: " + contaCorrente.numero);
		System.out.println("Saldo: " + contaCorrente.saldo);
		System.out.println("Nome: " + contaCorrente.cliente.nome);
		System.out.println("Idade: " + contaCorrente.cliente.idade);
				 
		
	}

}

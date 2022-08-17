package br.senai.sp.jandira;

import java.util.Scanner;

import br.senai.sp.jandira.model.Conta;

public class App {

	  public static void main(String[] args) {
		  
		Scanner leitor = new Scanner(System.in);
	
		Conta contaDaMaria = new Conta();
		Conta contaDoJoao = new Conta();
		Conta contaDoCleiton = new Conta();
		
		contaDaMaria.numero = "001-8"; 
		contaDaMaria.cliente = "Maria de Jesus";
		contaDaMaria.tipoConta = "Corrente";
		contaDaMaria.saldo = 217.57;
		
		
		contaDoJoao.numero = "001-23"; 
		contaDoJoao.cliente = "João Fernando";
		contaDoJoao.tipoConta = "Poupança";
		contaDoJoao.saldo = 3.33;
		
//		System.out.printf("\nNome do cliente: %s",contaDaMaria.cliente);
//		System.out.printf("\nTipo de conta: %s",contaDaMaria.tipoConta);
//		System.out.printf("\nSaldo da conta: %s\n",contaDaMaria.saldo);
//		
//		System.out.printf("\nNome do cliente: %s",contaDoJoao.cliente);
//		System.out.printf("\nTipo de conta: %s",contaDoJoao.tipoConta);
//		System.out.printf("\nSaldo da conta: %s",contaDoJoao.saldo);
		
//		System.out.print("Qual o nome do cliente?");
//		contaDoCleiton.cliente = leitor.next();
//		System.out.print("Qual o numero da conta?");
//		contaDoCleiton.numero = leitor.next();
//		System.out.print("Qual o tipo de conta?");
//		contaDoCleiton.tipoConta = leitor.next();
//		System.out.print("Qual o saldo da conta?");
//		contaDoCleiton.saldo = leitor.nextDouble();
		
		contaDaMaria.exibirDadosDaConta();
		contaDoJoao.exibirDadosDaConta();
//		contaDoCleiton.exibirDadosDaConta();
		
		contaDaMaria.depositar(59.32);
		contaDaMaria.exibirDadosDaConta();
		
		contaDaMaria.depositar(231.98);
		contaDaMaria.exibirDadosDaConta();
	}
	  

}

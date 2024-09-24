package main;

public class Carro {
	 String modelo;
	 String cor;
	 String placa;
	 int ano;

	    Carro(String modelo, String cor) {
	        this.modelo = modelo;
	        this.cor = cor;
	    }
	}


	class Pessoa {
	    String nome;
	    Carro carro;

	    Pessoa(String nome, Carro carro) {
	        this.nome = nome;
	        this.carro = carro;
	    }

	    void dirigir() {
	        System.out.println(nome + " está dirigindo agora um " + carro.modelo + ",da cor: " + carro.cor);
	    }
	}

	



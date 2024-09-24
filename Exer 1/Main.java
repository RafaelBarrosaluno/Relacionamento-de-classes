package main;

public class Main {
	public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota","Vermelho");
        Carro carro2 = new Carro("Camaro","Verde");
        Pessoa pessoa1 = new Pessoa("João", carro1);
        Pessoa pessoa2 = new Pessoa("João", carro2);
        pessoa1.dirigir();
        pessoa2.dirigir();
    }
}

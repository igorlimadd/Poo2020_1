package carro;

import java.util.Scanner;

public class Carro {
	int nPessoas = 0; //atributos
	int maxPessoas = 5;
	int acelerar = 0;
	String parar = "parar";
	
	void embarcar(int qtd) { //metodos
		if(qtd < 0)
			return;
		if(qtd + this.nPessoas > this.maxPessoas) {
			System.out.println("Nao cabe galera, flw");
			return;
		}
		this.nPessoas += qtd;
		System.out.println("Cai dentro");
	}
	
	void desembarcar(int qtd) {
		if(qtd < 0)
			return;
		if(this.nPessoas < qtd) {
			System.out.println("so tem " + this.nPessoas + " no carro");
			return;
		}
		this.nPessoas -= qtd;
		System.out.println("Pega o beco galera");
	}
	
	void acelerar (int qtd) {
		
		if(qtd + this.acelerar > 0 ) {
			System.out.println("ACELERANDO");	
		}
	}
	void parar () {
		System.out.println("EITA, PAREI");
	}
	void show() {
		System.out.println("Carro: nPessoas = " + this.nPessoas);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Carro carro = new Carro();
		while(true) {
			String line = scanner.nextLine();
			String ui[] = line.split(" ");
			if(ui[0].equals("end")) {
				break;
			}else if(ui[0].equals("show")) {
				carro.show();
			}else if(ui[0].equals("embarcar")) {
				int qtd = Integer.parseInt(ui[1]);
				carro.embarcar(qtd);
			}else if(ui[0].equals("desembarcar")) {
				int qtd = Integer.parseInt(ui[1]);
				carro.desembarcar(qtd);
			}else if(ui[0].equals("acelerar")) {
				int qtd = Integer.parseInt(ui[1]);
				carro.acelerar(qtd);
			}else if(ui[0].contentEquals("parar")) {
				carro.parar();
			}
				
			else {
				System.out.println("Comando invalido");
				
			}
		}
		
		scanner.close();
	}
}



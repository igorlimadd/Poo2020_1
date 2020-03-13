package Leao;

import java.util.Scanner;

public class Leao {
	String rugir = "rugir";
	String cacar = "caçar";
	String fugir = "fuja";
	String matar = "matar";
	
	void rugir() {
		System.out.println("RAAAAW");
					
	}
	void fugir() {
		System.out.println("RUN... RUN... RUN..");
	}
	void cacar() {
		System.out.println("ONDE ESTÁ MINHA PRESA?");
		
	}
	void matar() {
		System.out.println("Voce matou o leao");
	}
	
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Leao leao = new Leao();
		while(true) {
				String line = scanner.nextLine();
				String ui[] = line.split(" ");
				if(ui[0].contentEquals("rugir")) {
					leao.rugir();
				}else if(ui[0].contentEquals("fugir")) {
						leao.fugir();
				}else if(ui[0].contentEquals("caçar")) {
					leao.cacar();
				}else if(ui[0].contentEquals("matar")) {
					leao.matar();
				}else {
					System.out.println("o leao nao entendeu");

				
			}
			

		}

		}
	}
	

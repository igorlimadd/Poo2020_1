package homemdelata;

import java.util.Scanner;

class Coracao {
    int batimentos;
    boolean vida = true;

    public Coracao (int batimentos){ 
        this.batimentos = batimentos;
    }
}
public class Homem {
	Coracao coracao;
	
	void colocar (Coracao coracao) {
		if(this.coracao == null)
			this.coracao = coracao;
		else
			System.out.println("Ja tenho um coração");
	}
	void arrancar () {
		if(this.coracao != null)
			this.coracao = null;
		else
			System.out.println("Nao tenho coração");
	}
	void andar () {
		if(this.coracao == null)
			System.out.println("Nao tenho como andar sem coraçao");
		else
			System.out.println("tec tec tec tec");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Homem homem  = new Homem();
		while(true) {
			String line = scanner.nextLine();
			String ui[] = line.split(" ");
			if(ui[0].equals("end")) {
				break;
			}else if(ui[0].equals("init")) { 
				Coracao coracao = homem.coracao;
				homem.colocar(coracao);
			}else if(ui[0].equals("colocar")) { 
				int batimento = Integer.parseInt(ui[1]);
				Coracao coracao = new Coracao(batimento);
				homem.colocar(coracao);
			}else if(ui[0].equals("arrancar")) {
				homem.arrancar();
			}else if(ui[0].equals("andar")) {
				homem.andar();
			}
		
		}
	}
}

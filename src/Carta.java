public class Carta {

    private char naipe;
    private int valor;

    public Carta () {
        this.naipe = ' ';
        this.valor = 0;
    
    }

    public Carta (char naipe, int valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public String toString() {
        return getNome()+" de "+getNaipe(); 
    }

    public String getNaipe() {

		String naipe;
		
		if (this.naipe == 'C') {
			naipe = "Copas";
		}
		else if (this.naipe == 'E') {
			naipe = "Espadas";
		}
		else if (this.naipe == 'P') {
			naipe = "Paus";
		}
		else if (this.naipe == 'O') {
			naipe = "Ouros";
		} else {
			naipe = "Inválido";
		}
		return naipe;
	}

    public String getNome(){

		String nome = " ";

		if (this.valor == 1) {		
			nome = "As";
		}
		else if (this.valor == 2) {
			nome = "Dois";
		}
		else if (this.valor == 3) {
			nome = "Três";
		}
		else if (this.valor == 4) {
			nome = "Quatro";
		}
		else if (this.valor == 5) {
			nome = "Cinco";
		}
		else if (this.valor == 6) {
			nome = "Seis";
		}
		else if (this.valor == 7) {
			nome = "Sete";
		}
		else if (this.valor == 8) {
			nome = "Oito";
		}
		else if (this.valor == 9) {
			nome = "Nove";
		}
		else if (this.valor == 10) {
			nome = "Dez";
		}
		else if (this.valor == 11) {
			nome = "Valete";
		}
		else if (this.valor == 12) {
			nome = "Dama";
		}
		else if (this.valor == 13) {
			nome = "Rei";
		} 
		return nome;

	}

	public int getValor() {
		return this.valor;
	}



}

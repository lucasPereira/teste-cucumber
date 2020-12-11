package br.iucas.teste.cucumber;

public class Calculadora {

	private Integer primeiro;
	private Integer segundo;

	public Integer somar(Integer primeiro, Integer segundo) {
		return primeiro + segundo;
	}

	public void setPrimeiro(Integer primeiro) {
		this.primeiro = primeiro;
	}

	public void setSegundo(Integer segundo) {
		this.segundo = segundo;
	}

	public Integer somar() {
		return primeiro + segundo;
	}

}

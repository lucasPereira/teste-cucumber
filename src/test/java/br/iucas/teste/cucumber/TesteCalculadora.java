package br.iucas.teste.cucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java8.En;

public class TesteCalculadora implements En {

	private Integer primeiro;
	private Integer segundo;
	private Integer resultado;
	
	public TesteCalculadora() {
		Given("o primeiro número é {int}", (Integer primeiro) -> {
			this.primeiro = primeiro;
		});

		Given("o segundo número é {int}", (Integer segundo) -> {
			this.segundo = segundo;
		});

		When("efetuar a soma", () -> {
			this.resultado = new Calculadora().somar(primeiro, segundo);
		});

		Then("o resultado será {int}", (Integer resultadoEsperado) -> {
			assertEquals(resultadoEsperado, resultado);
		});
	}

}

package com.testemedicamento.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.teste.hospede.entity.Medicamento;

class MedicamentoTest {

	private Medicamento medicamento;

	@BeforeEach
	void setUp() {
		// Arrange
		medicamento = new Medicamento(1L, "rivotril", "tome cuidado para nao ter vício", "02/12/2027");
	}

	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		// Act
		medicamento.setId(2L);
		// Assert
		assertEquals(2L, medicamento.getId());
	}

	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNome() {
		// Act
		medicamento.setNome("dipirona");
		// Assert
		assertEquals("dipirona", medicamento.getNome());
	}

	@Test
	@DisplayName("Testando o getter e setter do campo bula")
	void testBula() {
		// Act
		medicamento.setBula("tomar em dose adequada de acordo com seu peso");
		// Assert
		assertEquals("tomar em dose adequada de acordo com seu peso", medicamento.getBula());
	}

	@Test
	@DisplayName("Testando o getter e setter do campo dataValidade")
	void testDataValidade() {
		// Act
		medicamento.setDataValidade("15/08/2028");
		// Assert
		assertEquals("15/08/2028", medicamento.getDataValidade());
	}

	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testConstructorAll() {
		// Act
		Medicamento novoMedicamento = new Medicamento(3L, "dorflex", "tomar quando a dor muscular", "01/05/2030");
		// Assertion
		assertAll("novoMedicamento", () -> assertEquals(3L, novoMedicamento.getId()),
				() -> assertEquals("dorflex", novoMedicamento.getNome()),
				() -> assertEquals("tomar quando a dor muscular", novoMedicamento.getBula()),
				() -> assertEquals("01/05/2030", novoMedicamento.getDataValidade()));

	}

}

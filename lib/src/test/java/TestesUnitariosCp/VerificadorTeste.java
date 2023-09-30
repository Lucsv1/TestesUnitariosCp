package TestesUnitariosCp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.fiap.verificadorParenteses.Verificador;

public class VerificadorTeste {
	
	@Test
	public void testParenthesesValidation() {
		assertTrue(Verificador.validateParentheses("{[()]}"));
        assertFalse(Verificador.validateParentheses("{[(])}"));
	}

}

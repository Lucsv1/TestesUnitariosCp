package br.com.fipa.ControllerRest;

import com.google.errorprone.annotations.RestrictedApi;

import br.com.fiap.verificadorParenteses.Verificador;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class VerificadorController {

	    @PostMapping("/validate-parentheses")
	    public boolean validateParentheses(@RequestBody String input) {
	        return Verificador.validateParentheses(input);
	    }
	}


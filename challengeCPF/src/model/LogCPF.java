package model;

public class LogCPF {

	public String formataRetorno(boolean cpfValido) {
		if (cpfValido)
			return "Seu CPF é válido para acesso ao sistema";
		else
			return "Seu CPF é inválido para acesso ao sistema";
	}

}

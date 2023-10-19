package console;
import dao.Usuariodao;
import entidade.Usuario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		logar();

	}
	
private static void logar() {
		
		Usuario u = new Usuario();
		u.setNome("maria Souza");
		u.setCpf("10787886935");
		u.setSenha("Gils");
		
		new Usuariodao().cadastrarCliente(u);
		
	}

}

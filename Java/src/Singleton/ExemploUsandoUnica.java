package Singleton;

public class ExemploUsandoUnica {

	public static void main(String[] args) {


		Unica u1 = Unica.getInstancia();
		u1.setMensagem("Classe unica");

		Unica u2 = Unica.getInstancia();

		if (u1 == u2) {

			System.out.println("Os objetos u1 e u2 sao iguais");
			System.out.println(u1);
			System.out.println(u2);
		}
	}

}

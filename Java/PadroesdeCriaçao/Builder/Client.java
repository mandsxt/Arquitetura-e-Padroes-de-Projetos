package Builder;

public class Client {

	public static void main(String[] arg) {
		Car c = new CarBuilder().setWheel(4).setColor("Red").getCar();
		System.out.print(c);
	}
}

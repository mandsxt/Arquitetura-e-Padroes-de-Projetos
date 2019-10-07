package PadraoAdapter;

public class ControlePS5 {

	private SensorPS5 sensorAQueSeConecta;

	public void Conectar(SensorPS5 sensor) {
		this.sensorAQueSeConecta = sensor;
		sensorAQueSeConecta.conectarPS5();
	}

	public static void main(String[] args) {

		
		SensorXbox2 adaptee = new SensorXbox2();
		ControlePS5 target = new ControlePS5();

		AdaptadorPS5ParaXbox2 adapter = new AdaptadorPS5ParaXbox2(adaptee);

		target.Conectar(adapter);
	}
}


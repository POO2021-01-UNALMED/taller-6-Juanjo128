package vehiculos;

public class Camioneta extends Vehiculo {
	public Boolean volco;
	public static int numCamioneta;

	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa,puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		numCamioneta++;
	}
	
	public void setVolco(boolean t) {
		this.volco = t;
	}
	
	public boolean isvolco() {
		return volco;
	}
	
	public static int getCantidadCamionetas() {
		return numCamioneta;
	}
	
	public static void setCantidadCamionetas(int cantidadCamionetas) {
		Camioneta.numCamioneta = cantidadCamionetas;
	}
}

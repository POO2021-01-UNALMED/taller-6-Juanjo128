package vehiculos;

public class Camion extends Vehiculo {
	public int ejes;
	public static int numCamion;

	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre , precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		numCamion++;
	}
	
	public void setEjes(int x) {
		this.ejes = x;
	}
	
	public int getEjes() {
		return this.ejes;
	}
	
	public static int getCantidadCamiones() {
		return numCamion;
	}
	

	public static void setCantidadCamiones(int cantidadCamiones) {
		Camion.numCamion = cantidadCamiones;
	}
}

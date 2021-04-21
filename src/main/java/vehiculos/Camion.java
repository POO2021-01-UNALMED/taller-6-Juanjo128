package vehiculos;

public class Camion extends Vehiculo {
	public int ejes;

	
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
}

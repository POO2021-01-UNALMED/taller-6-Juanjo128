package vehiculos;

public class Automovil extends Vehiculo{
	public int puestos;
	public static int numAutomovil;
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		numAutomovil++;
	}
	
	public void setPuestos(int x) {
		this.puestos = x;
	}
	
	public int getPuestos() {
		return this.puestos;
	}
	

	public  int getCantidadAutomoviles() {
		return numAutomovil;
	}
	
	public static void setCantidadAutomoviles(int cantidadAutomoviles) {
		Automovil.numAutomovil = cantidadAutomoviles;
	}

	

}

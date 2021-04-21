package vehiculos;

public class Vehiculo {
	public String placa;
	public int puertas;
	public int velocidadMaxima;
	public String nombre;
	public int precio;
	public int peso;
	public String traccion;
	public Fabricante fabricante;
	public static int numVehiculos;
	
	

	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		numVehiculos++;
		fabricante.nvehiculos++;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPuertas(int x) {
		this.puertas = x;
	}
	
	public int getPuertas() {
		return this.puertas;
	}
	
	public void setVelocidadMaxima(int x) {
		this.velocidadMaxima = x;
	}
	
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	
	public void setPrecio(int x) {
		this.precio = x;
	}
	
	public int getPrecio(int x) {
		return this.precio;
	}
	
	public void setPeso(int x) {
		this.peso = x;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	public void setNombre(String y) {
		this.nombre = y;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setTraccion(String y) {
		this.traccion = y;
	}
	
	public String getTraccion() {
		return this.traccion;
	}
	
	public void setFabricante(Fabricante y) {
		this.fabricante = y;
	}
	
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	
	public static int getCantidadVehiculos() {
		return numVehiculos;
	}
	
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.numVehiculos = cantidadVehiculos;
	}
	
	public String vehiculosPorTipo() {
		return("Automoviles:" + Automovil.getCantidadVehiculos() + "\n" + "Camionetas:" + Camioneta.getCantidadCamionetas() + "\n" + "Camiones:" + Camion.getCantidadCamiones());
	}
	
	
}

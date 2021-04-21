package vehiculos;

import java.util.ArrayList;

public class Pais {
	protected String nombre;
	public static ArrayList<Pais> paises = new ArrayList<>();
	public int numFabricantes;
	
	public Pais(String x) {
		this.nombre = x;
		paises.add(this);
	}
	
	public static Pais paisMasVendedor() {
		int M = 0;
		int aux = 0;
		for(int i = 0; i<paises.size(); i++) {
			if(paises.get(i).numFabricantes > aux) {
				aux = paises.get(i).numFabricantes;
				M = i;
			}
		}
		return paises.get(M);
	}
	
	public void setNombre(String x) {
		this.nombre = x;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public static ArrayList<Pais> getPaises() {
		return paises;
	}

	public static void setPaises(ArrayList<Pais> paises) {
		Pais.paises = paises;
	}
}

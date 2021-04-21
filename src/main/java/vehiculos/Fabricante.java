package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	public String nombre;
	public Pais pais;
	
	public static ArrayList<Fabricante> fabricantes = new ArrayList<>();
	public int nvehiculos;
	
	public Fabricante(String x) {
		this.nombre = x;
		fabricantes.add(this);
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante max = null;
		int aux = 0;
		for(Fabricante f: fabricantes) {
			if(f.nvehiculos > aux) {
				aux = f.nvehiculos;
				max = f;
			}
		}
		
		return max;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public static ArrayList<Fabricante> getFabricantes() {
		return fabricantes;
	}

	public static void setFabricantes(ArrayList<Fabricante> fabricantes) {
		Fabricante.fabricantes = fabricantes;
	}
}

package ejsHerenciaInterfaz;

public class Pila implements Interfaz1 {
	private int[] datos;
	private int cantidadDatos;

	public Pila(int tamaño) {
		this.datos= new int[tamaño];
	}

	@Override
	public int extraer() {
		int valor=-1;
		if(!this.estaVacia()) {
			cantidadDatos--;
			valor = this.datos[cantidadDatos];
		}
		return valor;
	}

	@Override
	public boolean introducir(int valor) {
		if (!estaLlena()) {
			datos[cantidadDatos] = valor;
			cantidadDatos++;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean estaVacia() {
		if (this.cantidadDatos == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean estaLlena() {
		if (this.cantidadDatos == this.datos.length) {
			return true;
		} else {
			return false;
		}
	}
}

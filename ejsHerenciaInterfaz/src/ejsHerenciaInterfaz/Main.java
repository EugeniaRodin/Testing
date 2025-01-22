package ejsHerenciaInterfaz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila pila=new Pila(3);
		
		System.out.println("Pila vacía: (-1)"+pila.extraer());
		System.out.println("Introducir 3: "+pila.introducir(3));
		System.out.println("Introducir 2:"+pila.introducir(2));
		System.out.println("Extraer 2:"+pila.extraer());
		System.out.println("Pila vacía: (-1)"+pila.extraer());
		
	}

}

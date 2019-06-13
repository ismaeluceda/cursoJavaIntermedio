package ejemplo0;

public class MainEjemplo0 {
	public static void main(String[] args) {
		String opcion = args[0];
		Imprimible ip = null;
		/*
		if (opcion.equals("0")) {
			ip = new ImprimirPantalla();
			ip.imprimir("Cualquier cosa");
		}else {
			ip = new ImprimirFichero();
			ip.imprimir("Cualquier cosa");
		}*/
		
		ip = FabricaImprimibles.fabricar(opcion);
		
		//Hago cosas...
		funcion(ip);
	}

	public static void funcion(Imprimible ifi) {
		ifi.imprimir("Otro valor");
	}
}

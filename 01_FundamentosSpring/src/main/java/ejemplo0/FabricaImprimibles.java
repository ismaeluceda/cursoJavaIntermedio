package ejemplo0;

public class FabricaImprimibles {

		public static Imprimible fabricar(String tipo) {
			switch (tipo) {
			case "fichero":
				return new ImprimirFichero();
			case "pantalla":
				return new ImprimirPantalla();

			default:
				return null;
			}
		}
}

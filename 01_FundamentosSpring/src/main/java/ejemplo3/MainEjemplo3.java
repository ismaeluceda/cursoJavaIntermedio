package ejemplo3;

import java.util.HashMap;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Listas y Mapas

public class MainEjemplo3 {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
	
	public static void main(String[] args) {
		List<Persona> listaPersonas = context.getBean("listaPersonas",List.class);
		System.out.println(listaPersonas);
		
		List<String> listaNombres = context.getBean("listaNombres",List.class);
		System.out.println(listaNombres);
		
		HashMap<String, String> mapaCadenas = new HashMap<>();
		mapaCadenas.put("1234", "felix");
		mapaCadenas.put("qwrty", "marcos");
		System.out.println(mapaCadenas.get("qwrty")); //marcos
		System.out.println(mapaCadenas.get("4321")); //null
		mapaCadenas.put("qwrty", "ana"); //actualiza el valor de la clave
		System.out.println(mapaCadenas.get("qwrty")); //ana
		
		HashMap<String, Persona> mapaPersonas = context.getBean("mapaPersonas",HashMap.class);
		System.out.println(mapaPersonas.get("1234"));

	}
		

}

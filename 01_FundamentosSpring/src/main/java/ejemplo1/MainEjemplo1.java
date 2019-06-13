package ejemplo1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEjemplo1 {

	public static ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
	
	public static void main(String[] args) {
		Persona p1 = (Persona) context.getBean("personaSingleton");
		Persona p2 = context.getBean("personaPrototype",Persona.class);
		
		p1.setNombre("Arturo");
		p1.setEdad(45);
		
		p2.setNombre("Ana");
		p2.setEdad(34);
		
		System.out.println(p2);
		
		List<Persona> listaPersonas = context.getBean("listaPersonas",List.class);
		listaPersonas.add(p2);
		
		metodo();
		
		System.out.println("hola");
		System.out.println(listaPersonas);
		
		Persona p3 = context.getBean("personaSingleton2",Persona.class);
		System.out.println(p3);
		
		Persona p4 = context.getBean("personaSingleton3", Persona.class);
		System.out.println(p4);
		
		Persona p5 = context.getBean("personaSingleton4", Persona.class);
		System.out.println(p5);
		
	}

	private static void metodo() {
			Persona p1 = (Persona)context.getBean("personaSingleton");
			System.out.println(p1);
		
			//se crea una instancia nueva de p2
			Persona p2=context.getBean("personaPrototype", Persona.class);
			System.out.println(p2);
			
			List<Persona> listaPersonas = context.getBean("listaPersonas",List.class);
			listaPersonas.add(p2);
	}
}

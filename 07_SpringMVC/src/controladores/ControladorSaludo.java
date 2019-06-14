package controladores;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import modelo.entidades.Usuario;

//Spring se basa en POJOs Plain Old Java Object

@Controller
public class ControladorSaludo {

		@Autowired
		private Usuario usuarioSesion;
	
		@RequestMapping("verFormulario")
		public String verFormularioSaludo() {
			//aqui ya podemos invocar gestores o lo que necesitemos
			return "formularioSaludo";
		}
		
		//Spring mediante reflection y la inyeccion de dependencias 
		//puede identificar los parametros de entrada de nuestro metodo 
		//en funcion de dichos parametros inyectar el objeto que necesitas
		
		//la anotacion @RequestParam permite inyectar parametros recogidos en la request
		@RequestMapping(name="saludo",method=RequestMethod.GET)
		public ModelAndView procesarSaludo(HttpServletRequest httpRequest,
							HttpSession httpSession,
							ModelAndView mav,
							@RequestParam("nombre") String nombre) {
			
			String nombre1 = httpRequest.getParameter("nombre");
			System.out.println(nombre);
			Usuario usuario = new Usuario();
			usuario.setNombre(nombre);
			usuario.setEdad(18);
			
			usuarioSesion.setNombre(nombre1);
			usuarioSesion.setEdad(20);
			
			//aqui decimos a que vista navegamos
			mav.setViewName("verSaludo");
			//queremos mandarle tambien el usuario
			mav.addObject("usuarioObj", usuario);
			mav.addObject("usuarioSession",usuarioSesion);
						
			return mav;
			
		}
		
		@RequestMapping("verSaludo2")
		public ModelAndView verSaludo2() {
			//aqui ya podemos invocar gestores o lo que necesitemos
			ModelAndView mav=new ModelAndView();
			mav.setViewName("verSaludo2");
			mav.addObject("usuarioSession",usuarioSesion);
			return mav;
		}

}

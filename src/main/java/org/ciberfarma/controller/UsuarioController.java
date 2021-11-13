package org.ciberfarma.controller;

import org.ciberfarma.model.Producto;
import org.ciberfarma.model.Usuario;
import org.ciberfarma.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
public class UsuarioController {

	@Autowired
	private IUsuarioRepository repou;
	
	@GetMapping("/cargar")
	public String cargarPag(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "login";
	}
	
	@PostMapping("/validar")
	public String grabarPag(@ModelAttribute Usuario usuario, Model model) {
		System.out.println(usuario);
		// validar
		Usuario u = repou.findByCorreoAndClave(usuario.getCorreo(), usuario.getClave());
		System.out.println(u);
		if (u == null) {
			model.addAttribute("usuario", new Usuario());
			model.addAttribute("mensaje", "Usuario clave incorrecto");
			return "login";
		} else {
			model.addAttribute("usuario", u);
			return "principal";
		}
		
	}
	
}

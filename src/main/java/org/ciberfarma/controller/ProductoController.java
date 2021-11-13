package org.ciberfarma.controller;

import org.ciberfarma.model.Producto;
import org.ciberfarma.repository.ICategoriaRepository;
import org.ciberfarma.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductoController {

	@Autowired
	private ICategoriaRepository repoc;
	
	@Autowired
	private IProductoRepository repo;
	
	@GetMapping("/cargar")
	public String cargarPag(Model model) {
		model.addAttribute("producto", new Producto());
		// genere listado un listado de la categaria
		model.addAttribute("lstCategorias", repoc.findAll());
		return "crudproductos";
	}
	
	@PostMapping("/grabar")
	public String grabarPag(@ModelAttribute Producto producto) {
		System.out.println(producto);
		
		return "crudproductos";
	}
	
	@GetMapping("/listar")
	public String listadoProducto(Model model) {
		model.addAttribute("lstProductos", repo.findAll());
		model.addAttribute("lstCategorias", repoc.findAll());
		return "listado";
	}
	
	
	@PostMapping("/editar")
	public String buscarProd(@ModelAttribute Producto p, Model model) {
		System.out.println(p);
		model.addAttribute("producto", repo.findById(p.getCodigo()));
		model.addAttribute("lstCategorias", repoc.findAll());
		return "crudproductos";
	}
	
}

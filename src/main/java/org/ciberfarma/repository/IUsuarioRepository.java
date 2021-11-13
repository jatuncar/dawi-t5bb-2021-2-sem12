package org.ciberfarma.repository;

import org.ciberfarma.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{
	// CRUD
	
	// valide si existe un Usuario por correo y clave --> si no existe -> null
	// select * from tb_usuarios where usuario = ? and clave = ?
	Usuario findByCorreoAndClave(String correo, String clave);
	
	
	
}

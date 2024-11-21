package io.github.daylanbueno.authapi.services;

import org.springframework.beans.factory.annotation.Autowired;

import io.github.daylanbueno.authapi.dtos.UsuarioDto;
import io.github.daylanbueno.authapi.repositories.UsuarioRepository;

public interface UsuarioService {
	
	
	
	public UsuarioDto salvar(UsuarioDto usuarioDto);

}

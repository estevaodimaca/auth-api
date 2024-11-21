package io.github.daylanbueno.authapi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.daylanbueno.authapi.dtos.UsuarioDto;
import io.github.daylanbueno.authapi.models.Usuario;
import io.github.daylanbueno.authapi.repositories.UsuarioRepository;
import io.github.daylanbueno.authapi.services.UsuarioService;


@Service
public class UsuarioServiveImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UsuarioDto salvar(UsuarioDto usuarioDto) {
		Usuario entity = new Usuario(usuarioDto.nome(), usuarioDto.login(), usuarioDto.senha());
		Usuario novoUsuario = usuarioRepository.save(entity);
		return new UsuarioDto(novoUsuario.getNome(), novoUsuario.getLogin(), novoUsuario.getSenha());
	}

}

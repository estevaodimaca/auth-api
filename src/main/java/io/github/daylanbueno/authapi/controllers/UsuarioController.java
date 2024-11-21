package io.github.daylanbueno.authapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.daylanbueno.authapi.dtos.UsuarioDto;
import io.github.daylanbueno.authapi.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping
	public UsuarioDto salvar(@RequestBody UsuarioDto usuarioDto) {
		return usuarioService.salvar(usuarioDto);
	}

}

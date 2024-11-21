package io.github.daylanbueno.authapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.daylanbueno.authapi.models.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}

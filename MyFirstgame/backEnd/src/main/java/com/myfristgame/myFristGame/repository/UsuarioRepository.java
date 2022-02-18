package com.myfristgame.myFristGame.repository;

import com.myfristgame.myFristGame.model.UsuarioModel;
import org.hibernate.id.GUIDGenerator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, GUIDGenerator> {

    public Optional<UsuarioModel> findByLogin(String login);
}

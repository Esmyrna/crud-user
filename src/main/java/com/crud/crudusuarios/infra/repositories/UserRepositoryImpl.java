package com.crud.crudusuarios.infra.repositories;

import com.crud.crudusuarios.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepositoryImpl extends JpaRepository<User, Long>, UserRepository {
}

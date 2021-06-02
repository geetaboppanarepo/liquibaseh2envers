package com.geeta.h2envers.repository;

import com.geeta.h2envers.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

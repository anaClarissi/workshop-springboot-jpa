package com.anaclarissi.web_service.repositories;

import com.anaclarissi.web_service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}

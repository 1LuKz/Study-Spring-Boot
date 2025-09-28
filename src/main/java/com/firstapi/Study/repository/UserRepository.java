package com.firstapi.Study.repository;

import com.firstapi.Study.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
}

package com.codeclan.UserFileFolders.UserFileFolders.repository;

import com.codeclan.UserFileFolders.UserFileFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

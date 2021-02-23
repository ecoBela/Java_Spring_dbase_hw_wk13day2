package com.codeclan.example.FilesAndFoldersHw.repositories;

import com.codeclan.example.FilesAndFoldersHw.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}

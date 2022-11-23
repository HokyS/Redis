package com.example.Redis.repositories.jpa;



import com.example.Redis.entities.jpa.PlayerJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepositoryJPA extends JpaRepository<PlayerJPA, Long> {
}
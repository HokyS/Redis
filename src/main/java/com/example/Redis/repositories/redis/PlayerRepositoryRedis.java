package com.example.Redis.repositories.redis;


import com.example.Redis.entities.redis.PlayerRedis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepositoryRedis extends CrudRepository<PlayerRedis, Long> {
}

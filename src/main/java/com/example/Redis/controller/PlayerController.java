package com.example.Redis.controller;


import com.example.Redis.entities.jpa.PlayerJPA;
import com.example.Redis.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;


    @PostMapping("")
    public PlayerJPA createPlayer(@RequestBody PlayerJPA playerJPA) {
        return playerService.create(playerJPA);
    }

    @GetMapping()
    public List<PlayerJPA> readAll() {
        return playerService.readAll();
    }

    @GetMapping("/{id}")
    public PlayerJPA readOne(@PathVariable Long id){
        return playerService.readOne(id);
    }

    @PutMapping("/{id}")
    public PlayerJPA update(@PathVariable Long id, @RequestBody PlayerJPA user) {
        return playerService.update(id, user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        playerService.delete(id);
    }


}

package com.milena.projetofinal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clube")
public class clubecontroller {

    @Autowired
    private class clubeservice{
        Clube service;
    }

    @RestController
    @RequestMapping("/api/clubs")
    public class ClubeController {

        @Autowired
        private ClubeService clubService;

        @PostMapping
        public Clube createClub(@RequestBody Clube club) {
            return clubService.createclube(club);
       }

        @GetMapping("/{id}")
        public Club getClubById(@PathVariable Long id) {
            return clubService.getClubById(id);
        }

        @GetMapping
        public ResponseEntity getAllClubs() {
            Object body;
            return ResponseEntity.ok(body);
        }
    }
}
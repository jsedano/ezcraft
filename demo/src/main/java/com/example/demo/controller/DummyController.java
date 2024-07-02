package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Dummy;
import com.example.demo.service.DummyService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DummyController {

    private final DummyService dummyService;


    @PostMapping("/dummy")
    public ResponseEntity<Dummy> save(@RequestBody Dummy dummy) {
        return ResponseEntity.ok(dummyService.save(dummy));
    }

    @GetMapping("/dummys")
    public ResponseEntity<Iterable<Dummy>> findAll() {
        return ResponseEntity.ok(dummyService.findAll());
    }

    @GetMapping("/dummy")
    public ResponseEntity<Dummy> get(Long id) {
        return ResponseEntity.ok(dummyService.get(id));
    }

    @PatchMapping("/dummy")
    public ResponseEntity<Dummy> update(Long id, @RequestBody Dummy dummy) {
        dummyService.update(id, dummy);
        return ResponseEntity.ok(dummy);
    }

    @DeleteMapping("/dummy")
    public ResponseEntity<Dummy> delete(Long id) {
        return ResponseEntity.ok(dummyService.delete(id));
    }


}

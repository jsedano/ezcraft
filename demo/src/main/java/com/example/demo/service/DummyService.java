package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Dummy;
import com.example.demo.repository.DummyRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DummyService {
    
    private final DummyRepository dummyRepository;

    public Dummy save(Dummy dummy) {
        return dummyRepository.save(dummy);
    }

    public Dummy get(Long id) {
        return dummyRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
    }

    public Dummy delete(Long id) {
        Dummy existingDummy = dummyRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
        dummyRepository.deleteById(id);
        return existingDummy;
    }   

    public void update(Long id, Dummy dummy) {
        dummyRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
        dummy.setId(id);
        dummyRepository.save(dummy);
    }

    public Iterable<Dummy> findAll() {
        return dummyRepository.findAll();
    }
}

package com.inventiv.dreamcase.controller;

import com.inventiv.dreamcase.model.Case;
import com.inventiv.dreamcase.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cases")
public class CaseController {

    @Autowired
    private CaseService service;

    @PostMapping
    public ResponseEntity<Case> create(@RequestBody Case c) {
        return ResponseEntity.ok(service.createCase(c));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Case> read(@PathVariable Long id) {
        return ResponseEntity.ok(service.getCase(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Case> update(@PathVariable Long id, @RequestBody Case c) {
        return ResponseEntity.ok(service.updateCase(id, c));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteCase(id);
        return ResponseEntity.noContent().build();
    }
}

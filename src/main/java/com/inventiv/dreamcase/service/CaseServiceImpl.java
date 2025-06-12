package com.inventiv.dreamcase.service;

import com.inventiv.dreamcase.model.Case;
import com.inventiv.dreamcase.repository.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaseServiceImpl implements CaseService{

    @Autowired
    private CaseRepository repository;

    @Override
    public Case createCase(Case newCase) {
        return repository.save(newCase);
    }

    @Override
    public Case updateCase(Long id, Case updatedCase) {
        Case existing = repository.findById(id).orElseThrow();
        existing.setTitle(updatedCase.getTitle());
        existing.setDescription(updatedCase.getDescription());
        return repository.save(existing);
    }

    @Override
    public Case getCase(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void deleteCase(Long id) {
        repository.deleteById(id);
    }
}


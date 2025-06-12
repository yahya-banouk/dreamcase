package com.inventiv.dreamcase.service;

import com.inventiv.dreamcase.model.Case;

public interface CaseService {
    Case createCase(Case newCase);
    Case updateCase(Long id, Case updatedCase);
    Case getCase(Long id);
    void deleteCase(Long id);
}
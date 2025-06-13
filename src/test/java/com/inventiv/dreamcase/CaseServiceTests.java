package com.inventiv.dreamcase;

import com.inventiv.dreamcase.model.Case;
import com.inventiv.dreamcase.repository.CaseRepository;
import com.inventiv.dreamcase.service.CaseServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CaseServiceTests {

    @Mock
    private CaseRepository repo;

    @InjectMocks
    private CaseServiceImpl service;

    @Test
    void shouldCreateCase() {
        Case input = new Case();
        input.setTitle("Test");
        input.setDescription("Desc");

        when(repo.save(any())).thenReturn(input);

        Case result = service.createCase(input);
        assertEquals("Test", result.getTitle());
    }
}
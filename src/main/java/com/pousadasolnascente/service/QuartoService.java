package com.pousadasolnascente.service;

import com.pousadasolnascente.repository.QuartoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuartoService {
    @Autowired
    private QuartoRepository quartoRepository;
}

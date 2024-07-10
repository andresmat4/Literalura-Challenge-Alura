package com.alura.literalura.repository;

import com.alura.literalura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface LibroRepository  extends JpaRepository<Libro, Long> {
    Libro findByTituloIgnoreCase(String titulo);

    List<Libro> findByIdiomasContaining(String idioma);
}

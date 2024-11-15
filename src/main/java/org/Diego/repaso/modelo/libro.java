package org.Diego.repaso.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    @Hidden
    private Long idLibro;  
    
    @Column(length = 50)
    private String titulo;
    
    @Column(length = 50, nullable = true)
    private String autor;
    
    @Column(length = 10)
    private LocalDate añoPublicacion;
}


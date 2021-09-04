package com.dio.sistemacontrolede.pontoeacesso.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited

public class Calendar {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private DataType dataType;
    private String descricao;
    private LocalDateTime dataEspecial;
}